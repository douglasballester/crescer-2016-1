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
<<<<<<< HEAD
        public Pedido(DateTime dataEntregaDesejada, string nomeProduto, decimal valor, TipoPagamento tipoPagamento, string nomeCliente, string cidade, string estado)
        {
            DataEntregaDesejada = dataEntregaDesejada;
            NomeProduto = nomeProduto;
            Valor = valor;
            TipoPagamento = tipoPagamento;
=======
        public Pedido(DateTime DataDesejoEntregaDesejada, string nomeProduto, decimal ValorVenda, TipoDePagamento TipoDePagamento, string nomeCliente, string cidade, string estado)
        {
            DataDesejoEntregaDesejada = DataDesejoEntregaDesejada;
            NomeProduto = nomeProduto;
            ValorVenda = ValorVenda;
            TipoDePagamento = TipoDePagamento;
>>>>>>> 9c6a820787619075ecea444f4b8f1a38855fdfb0
            NomeCliente = nomeCliente;
            Cidade = cidade;
            Estado = estado;

            //DateTime.Now contaria as horas, minutos e segundos, isso inviabliziaria algumas validações a seguir
<<<<<<< HEAD
            DataPedido = DateTime.Now; 

            var diasRestantesParaConcluirEntrega = (dataEntregaDesejada - DateTime.Today).TotalDays;
=======
            DataPedido = DateTime.Today; 

            var diasRestantesParaConcluirEntrega = (DataDesejoEntregaDesejada - DataPedido).TotalDays;
>>>>>>> 9c6a820787619075ecea444f4b8f1a38855fdfb0
            ValidaPossibilidadeEntrega(diasRestantesParaConcluirEntrega);
            DefineUrgenciaDoPedido(diasRestantesParaConcluirEntrega);
        }

        /// <summary>
        /// Construtor utilizado para montar pedidos recuperados do repositório
        /// </summary>
<<<<<<< HEAD
        public Pedido(int id, DateTime dataPedido, DateTime dataEntregaDesejada, string nomeProduto, decimal valor, TipoPagamento tipoPagamento, string nomeCliente, string cidade, string estado, bool pedidoUrgente)
        {
            Id = id;
            DataEntregaDesejada = dataEntregaDesejada;
            NomeProduto = nomeProduto;
            Valor = valor;
            TipoPagamento = tipoPagamento;
=======
        public Pedido(int id, DateTime dataPedido, DateTime DataDesejoEntregaDesejada, string nomeProduto, decimal ValorVenda, TipoDePagamento TipoDePagamento, string nomeCliente, string cidade, string estado, bool pedidoUrgente)
        {
            Id = id;
            DataDesejoEntregaDesejada = DataDesejoEntregaDesejada;
            NomeProduto = nomeProduto;
            ValorVenda = ValorVenda;
            TipoDePagamento = TipoDePagamento;
>>>>>>> 9c6a820787619075ecea444f4b8f1a38855fdfb0
            NomeCliente = nomeCliente;
            Cidade = cidade;
            Estado = estado;
            DataPedido = dataPedido;
            PedidoUrgente = pedidoUrgente;
        }

        public int Id { get; private set; }
        public DateTime DataPedido { get; private set; }
<<<<<<< HEAD
        public DateTime DataEntregaDesejada { get; private set; }
        public string NomeProduto { get; private set; }
        public decimal Valor { get; private set; }
        public TipoPagamento TipoPagamento { get; private set; }
=======
        public DateTime DataDesejoEntregaDesejada { get; private set; }
        public string NomeProduto { get; private set; }
        public decimal ValorVenda { get; private set; }
        public TipoDePagamento TipoDePagamento { get; private set; }
>>>>>>> 9c6a820787619075ecea444f4b8f1a38855fdfb0
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
<<<<<<< HEAD

        public void AtualizarId(int id)
        {
            if (Id != 0)
                throw new InvalidOperationException("Esse objeto já possuia Id, portanto ele já havia sido salvo no banco. Não é possível alterar esse valor.");

            Id = id;
        }
=======
>>>>>>> 9c6a820787619075ecea444f4b8f1a38855fdfb0
    }
}
