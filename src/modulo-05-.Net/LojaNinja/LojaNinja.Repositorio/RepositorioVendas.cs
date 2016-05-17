﻿using LojaNinja.Dominio;
using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LojaNinja.Repositorio
{
    public class RepositorioVendas
    {
        private const string PATH_ARQUIVO = @"C:\Users\douglas.ballester\Documents\crescer-2016-1\src\modulo-05-.Net\LojaNinja\Vendas.txt";
        private static readonly object objetoLock = new object();

        public List<Pedido> ObterPedidos()
        {
            var linhasArquivo = File.ReadAllLines(PATH_ARQUIVO, Encoding.UTF8).ToList();

            return ConverteLinhasEmPedidos(linhasArquivo);
        }

        public Pedido ObterPedidoPorId(int id)
        {
            return this.ObterPedidos().FirstOrDefault(x => x.Id == id);
        }

        public void IncluirPedido(Pedido pedido)
        {
            lock (objetoLock)
            {
                var utlimoId = this.ObterPedidos().Max(x => x.Id);
                var idGerado = utlimoId + 1;
                var novaLinha = ConvertePedidoEmLinhaCSV(pedido, idGerado);

                File.AppendAllText(PATH_ARQUIVO, novaLinha);

                pedido.AtualizarId(idGerado);
            }
        }

        private string ConvertePedidoEmLinhaCSV(Pedido pedido, int proximoId)
        {
            return string.Format(Environment.NewLine + "{0};{1};{2};{3};{4};{5};{6};{7};{8};{9}",
                                proximoId,
                                pedido.DataPedido.ToString("dd/MM/yyyy HH:mm"),
                                pedido.DataEntregaDesejada.ToString("dd/MM/yyyy HH:mm"),
                                pedido.NomeProduto,
                                pedido.Valor,
                                pedido.TipoPagamento,
                                pedido.NomeCliente,
                                pedido.Cidade,
                                pedido.Estado,
                                pedido.PedidoUrgente);
        }

        //TODO Verificar por que não altera o pedido
        public void AtualizarPedido(Pedido pedido)
        {
            var listaPedidos = ObterPedidos();
            var pedidoAtualizado = listaPedidos.FirstOrDefault(ped => ped.Id.Equals(pedido.Id));

            listaPedidos.Remove(listaPedidos.FirstOrDefault(ped => ped.Id.Equals(pedido.Id)));
            listaPedidos.Add(pedidoAtualizado);
            PreencherArquivoCSV(listaPedidos);
        }

        public void ExcluirPedido(int id)
        {
            var listaPedidos = ObterPedidos();

            listaPedidos.Remove(listaPedidos.FirstOrDefault(listPedidos => listPedidos.Id == id));

            PreencherArquivoCSV(listaPedidos);
        }

        private List<Pedido> ConverteLinhasEmPedidos(List<string> linhasArquivo)
        {
            var listaPedidos = new List<Pedido>();

            //Remove linha do cabeçalho
            linhasArquivo.RemoveAt(0);

            foreach (var linha in linhasArquivo)
            {
                var id = Convert.ToInt32(linha.Split(';')[0]);
                var dataPedido = Convert.ToDateTime(linha.Split(';')[1]);
                var dataEntregaDesejada = Convert.ToDateTime(linha.Split(';')[2]);
                var nomeProduto = linha.Split(';')[3];
                var valorVenda = Convert.ToDecimal(linha.Split(';')[4]);
                TipoPagamento tipoPagamento;
                Enum.TryParse(linha.Split(';')[5], out tipoPagamento);
                var nomeCliente = linha.Split(';')[6];
                var cidade = linha.Split(';')[7];
                var estado = linha.Split(';')[8];
                var urgente = Convert.ToBoolean(linha.Split(';')[9]);

                var pedido = new Pedido(id, dataPedido, dataEntregaDesejada, nomeProduto, valorVenda, tipoPagamento, nomeCliente, cidade, estado, urgente);
                listaPedidos.Add(pedido);
            }

            return listaPedidos;
        }

        private void PreencherArquivoCSV(List<Pedido> ListaPedidos)
        {
            string linhas = "Número Pedido;Data Pedido;Data Desejo Entrega;Nome Produto;Valor Venda;Tipo Pagamento;Nome Cliente;Cidade;Estado;Urgente";
            foreach (var pedido in ListaPedidos)
            {
                linhas += this.ConvertePedidoEmLinhaCSV(pedido, pedido.Id);
            }
            File.WriteAllText(PATH_ARQUIVO, linhas);
        }
    }
}
