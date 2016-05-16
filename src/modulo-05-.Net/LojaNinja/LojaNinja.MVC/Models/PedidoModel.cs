using LojaNinja.Dominio;
using System;
using System.Collections.Generic;
<<<<<<< HEAD
using System.ComponentModel;
=======
>>>>>>> 9c6a820787619075ecea444f4b8f1a38855fdfb0
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Web;

namespace LojaNinja.MVC.Models
{
    public class PedidoModel
    {
<<<<<<< HEAD
        public int? Id { get; set; }

        [Required]
        public DateTime DataEntrega { get; set; }
=======
        [Display(Name = "Data de entrega ")]
        [Required(ErrorMessage = "Informe a data de entrega.")]
        [DisplayFormat(DataFormatString = "{0:yyyy-MM-dd}")]
        public DateTime DataDesejoEntrega { get; set; }
>>>>>>> 9c6a820787619075ecea444f4b8f1a38855fdfb0

        [Display(Name = "Nome do produto ")]
        [Required(ErrorMessage = "Informe o nome do produto.")]
        public string NomeProduto { get; set; }

<<<<<<< HEAD
        [Required]
        [RegularExpression(@"^\d+.\d{0,2}$", ErrorMessage = "Valor da venda deverá ser informado.")]
        public decimal Valor { get; set; }

        [Required]
        public TipoPagamento TipoPagamento { get; set; }

        [Display(Name = "Nome ")]
=======
        [Display(Name = "ValorVenda da venda ")]
        [Required(ErrorMessage = "Informe o ValorVenda da venda.")]
        [RegularExpression(@"^\d+.\d{0,2}$", ErrorMessage = "ValorVenda da venda deverá ser informado.")]
        public decimal ValorVenda { get; set; }

        [Display(Name = "Escolha um tipo de pagamento.")]
        public TipoDePagamento TipoDePagamento { get; set; }

        [Display(Name = "Nome ")]
        [RegularExpression("^[a-zA-Z ]*$", ErrorMessage = "Digite apenas letras.")]
>>>>>>> 9c6a820787619075ecea444f4b8f1a38855fdfb0
        [Required(ErrorMessage = "Informe seu nome.")]
        public string NomeCliente { get; set; }

        [Display(Name = "Cidade ")]
        [Required(ErrorMessage = "Informe a cidade.")]
        public string Cidade { get; set; }

        [Display(Name = "Estado ")]
        [StringLength(2, ErrorMessage = "Estado deverá ter 2 caracteres")]
        [Required(ErrorMessage = "Informe o estado.")]
        public string Estado { get; set; }
<<<<<<< HEAD

=======
>>>>>>> 9c6a820787619075ecea444f4b8f1a38855fdfb0
    }
}