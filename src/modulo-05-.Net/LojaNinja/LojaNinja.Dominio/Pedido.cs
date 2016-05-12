using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LojaNinja.Dominio
{
    public class Pedido
    {
        /// <summary>
        /// Construtor utilizado para montar pedidos novos
        /// </summary>
        public Pedido(DateTime DataDesejoEntregaDesejada, string nomeProduto, decimal ValorVenda, TipoDePagamento TipoDePagamento, string nomeCliente, string cidade, string estado)
        {
            DataDesejoEntregaDesejada = DataDesejoEntregaDesejada;
            NomeProduto = nomeProduto;
            ValorVenda = ValorVenda;
            TipoDePagamento = TipoDePagamento;
            NomeCliente = nomeCliente;
            Cidade = cidade;
            Estado = estado;

            //DateTime.Now contaria as horas, minutos e segundos, isso inviabliziaria algumas validações a seguir
            DataPedido = DateTime.Today; 

            var diasRestantesParaConcluirEntrega = (DataDesejoEntregaDesejada - DataPedido).TotalDays;
            ValidaPossibilidadeEntrega(diasRestantesParaConcluirEntrega);
            DefineUrgenciaDoPedido(diasRestantesParaConcluirEntrega);
        }

        /// <summary>
        /// Construtor utilizado para montar pedidos recuperados do repositório
        /// </summary>
        public Pedido(int id, DateTime dataPedido, DateTime DataDesejoEntregaDesejada, string nomeProduto, decimal ValorVenda, TipoDePagamento TipoDePagamento, string nomeCliente, string cidade, string estado, bool pedidoUrgente)
        {
            Id = id;
            DataDesejoEntregaDesejada = DataDesejoEntregaDesejada;
            NomeProduto = nomeProduto;
            ValorVenda = ValorVenda;
            TipoDePagamento = TipoDePagamento;
            NomeCliente = nomeCliente;
            Cidade = cidade;
            Estado = estado;
            DataPedido = dataPedido;
            PedidoUrgente = pedidoUrgente;
        }

        public int Id { get; private set; }
        public DateTime DataPedido { get; private set; }
        public DateTime DataDesejoEntregaDesejada { get; private set; }
        public string NomeProduto { get; private set; }
        public decimal ValorVenda { get; private set; }
        public TipoDePagamento TipoDePagamento { get; private set; }
        public string NomeCliente { get; private set; }
        public string Cidade { get; private set; }
        public string Estado { get; private set; }
        public bool PedidoUrgente { get; private set; }

        private void ValidaPossibilidadeEntrega(double diasRestantesParaConcluirEntrega)
        {            
            if (diasRestantesParaConcluirEntrega < 1)
                throw new ArgumentException("A data de entrega desejada deve ser no mínimo 1 dia maior do que a data atual.");
        }

        private void DefineUrgenciaDoPedido(double diasRestantesParaConcluirEntrega)
        {
            PedidoUrgente = diasRestantesParaConcluirEntrega < 7;
        }
    }
}
