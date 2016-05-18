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
                TempData["DataPedido"] = pedido.DataPedido;

                var model = new PedidoModel()
                {
                    Id = pedido.Id,
                    DataEntrega = pedido.DataEntregaDesejada,
                    NomeProduto = pedido.NomeProduto,
                    Valor = pedido.Valor,
                    TipoPagamento = pedido.TipoPagamento,
                    NomeCliente = pedido.NomeCliente,
                    Cidade = pedido.Cidade,
                    Estado = pedido.Estado
                }
                ;

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
                    var dataPedido = (DateTime)TempData["DataPedido"];
                    var pedido = new Pedido((int)model.Id, dataPedido, model.DataEntrega, model.NomeProduto, model.Valor, model.TipoPagamento, model.NomeCliente, model.Cidade, model.Estado, model.urgente);

                    if (model.Id > 0)
                    {
                        repositorio.AtualizarPedido(pedido);
                        ViewBag.MensagemSucesso = "Pedido alterado com sucesso!";
                    }
                    else
                    {
                        repositorio.IncluirPedido(pedido);
                        ViewBag.MensagemSucesso = "Pedido salvo com sucesso!";
                    }

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

            return View(pedidos);
        }

        public ActionResult Excluir(int id)
        {
            repositorio.ExcluirPedido(id);

            ViewBag.MensagemExcluir = "Pedido excluído!";

            return View("Excluir");
        }
    }
}