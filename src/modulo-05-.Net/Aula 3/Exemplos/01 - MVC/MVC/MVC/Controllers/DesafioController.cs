using System.Web.Mvc;

namespace MVC.Controllers
{
    public class DesafioController : Controller
    {
        public ActionResult Index(string nome)
        {
            ViewBag.nome = nome;
            return View();
        }
    }
}