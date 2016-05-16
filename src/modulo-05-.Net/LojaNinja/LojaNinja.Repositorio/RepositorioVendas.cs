using LojaNinja.Dominio;
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
<<<<<<< HEAD
        private const string PATH_ARQUIVO = @"C:\Users\DOUGLAS\Desktop\LojaNinja\Vendas.txt";
        private static readonly object objetoLock = new object();

        public List<Pedido> ObterPedidos()
        {
            var linhasArquivo = File.ReadAllLines(PATH_ARQUIVO, Encoding.UTF8).ToList();
=======
        private const string PATH_ARQUIVO = @"C:\Users\fabriciosilva\Desktop\Vendas.txt";        

        public List<Pedido> ObterPedidos()
        {
            var linhasArquivo = File.ReadAllLines(PATH_ARQUIVO).ToList();
>>>>>>> 9c6a820787619075ecea444f4b8f1a38855fdfb0

            return ConverteLinhasEmPedidos(linhasArquivo);
        }

        public Pedido ObterPedidoPorId(int id)
        {
            return this.ObterPedidos().FirstOrDefault(x => x.Id == id);
        }

        public void IncluirPedido(Pedido pedido)
        {
<<<<<<< HEAD
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
=======
            throw new NotImplementedException();
>>>>>>> 9c6a820787619075ecea444f4b8f1a38855fdfb0
        }

        public void AtualizarPedido(Pedido pedido)
        {
<<<<<<< HEAD
            var listaPedidos = ObterPedidos();

            var y = listaPedidos.FirstOrDefault(ped => ped.Id.Equals(pedido.Id));
=======
            throw new NotImplementedException();
>>>>>>> 9c6a820787619075ecea444f4b8f1a38855fdfb0
        }

        public void ExcluirPedido(int id)
        {
<<<<<<< HEAD
            var listaPedidos = ObterPedidos();

            listaPedidos.Remove(listaPedidos.FirstOrDefault(listPedidos => listPedidos.Id == id));

            PreencherArquivoCSV(listaPedidos);
            
=======
            throw new NotImplementedException();
>>>>>>> 9c6a820787619075ecea444f4b8f1a38855fdfb0
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
<<<<<<< HEAD
                var dataEntregaDesejada = Convert.ToDateTime(linha.Split(';')[2]);
                var nomeProduto = linha.Split(';')[3];
                var valorVenda = Convert.ToDecimal(linha.Split(';')[4]);
                TipoPagamento tipoPagamento;
                Enum.TryParse(linha.Split(';')[5], out tipoPagamento);
=======
                var DataDesejoEntregaDesejada = Convert.ToDateTime(linha.Split(';')[2]);
                var nomeProduto = linha.Split(';')[3];
                var ValorVendaVenda = Convert.ToDecimal(linha.Split(';')[4]);
                TipoDePagamento TipoDePagamento;
                Enum.TryParse(linha.Split(';')[5], out TipoDePagamento);
>>>>>>> 9c6a820787619075ecea444f4b8f1a38855fdfb0
                var nomeCliente = linha.Split(';')[6];
                var cidade = linha.Split(';')[7];
                var estado = linha.Split(';')[8];
                var urgente = Convert.ToBoolean(linha.Split(';')[9]);

<<<<<<< HEAD
                var pedido = new Pedido(id, dataPedido, dataEntregaDesejada, nomeProduto, valorVenda, tipoPagamento, nomeCliente, cidade, estado, urgente);
=======
                var pedido = new Pedido(id, dataPedido, DataDesejoEntregaDesejada, nomeProduto, ValorVendaVenda, TipoDePagamento, nomeCliente, cidade, estado, urgente);
>>>>>>> 9c6a820787619075ecea444f4b8f1a38855fdfb0
                listaPedidos.Add(pedido);
            }

            return listaPedidos;
        }
<<<<<<< HEAD

        private void PreencherArquivoCSV(List<Pedido> ListaPedidos)
        {
            string linhas = "Número Pedido;Data Pedido;Data Desejo Entrega;Nome Produto;Valor Venda;Tipo Pagamento;Nome Cliente;Cidade;Estado;Urgente";
            foreach (var pedido in ListaPedidos)
            {
                linhas += this.ConvertePedidoEmLinhaCSV(pedido, pedido.Id);
            }
            File.WriteAllText(PATH_ARQUIVO, linhas);
        }
=======
>>>>>>> 9c6a820787619075ecea444f4b8f1a38855fdfb0
    }
}
