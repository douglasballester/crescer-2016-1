using LojaNinja.Dominio;
using LojaNinja.MVC.Models;
using LojaNinja.Repositorio;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace LojaNinja.MVC.Controllers
{
    public class PedidoController : Controller
    {
        private RepositorioVendas repositorio = new RepositorioVendas();

        public ActionResult Manter(int? id)
        {
            if (id.HasValue)
            {
                var pedido = repositorio.ObterPedidoPorId(id.Value);

                var model = new PedidoModel()
                {
                    //preencher
                };

                return View("Manter", model);
            }
            else
            {
                return View("Manter");
            }
        }

        public ActionResult Salvar(PedidoModel model)
        {
            if (ModelState.IsValid)
            {
                try
                {
                    var pedido = new Pedido(model.DataEntrega, model.NomeProduto, model.Valor, model.TipoPagamento, model.NomeCliente, model.Cidade, model.Estado);
                    //if (model.Id.HasValue)
                    //    repositorio.AtualizarPedido(pedido);
                    //else
                    repositorio.IncluirPedido(pedido);

                    ViewBag.MensagemSucesso = "Pedido salvo com sucesso!";
                    return View("Detalhes", pedido);
                }
                catch (ArgumentException ex)
                {
                    ModelState.AddModelError("", ex.Message);
                }
            }

            return View("Manter", model);
        }

        public ActionResult Detalhes(int id)
        {
            var pedido = repositorio.ObterPedidoPorId(id);

            return View(pedido);
        }

        public ActionResult Listagem(string cliente, string produto)
        {
            var pedidos = repositorio.ObterPedidos();

            if (!string.IsNullOrWhiteSpace(cliente))
            {
                pedidos = pedidos.Where(ped => ped.NomeCliente.ToLower().Equals(cliente.ToLower())).ToList();
            }
            if (!string.IsNullOrWhiteSpace(produto))
            {
                pedidos = pedidos.Where(ped => ped.NomeProduto.ToLower().Equals(produto.ToLower())).ToList();
            }

            return View(pedidos);
        }

        public ActionResult Excluir(int id)
        {
            var pedidoExcluido = repositorio.ObterPedidoPorId(id);
            repositorio.ExcluirPedido(id);
            ViewBag.Mensagem = "Pedido excluído!";

            return View(pedidoExcluido);
        }
    }
}