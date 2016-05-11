using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;
using MVC.Models;

namespace MVC.Controllers
{
    public class StreetFighterController : Controller
    {        
        public ActionResult Index()
        {
            return View();
        }

        public ActionResult SobreMim()
        {
            SobreMimModel x = new SobreMimModel()
            {
                Nome = "Douglas Ballester",
                Idade = 21,
                Peso = 65

            };
            return View(x);
        }

        public ActionResult FichaTecnica()
        {
            return View();
        }
    }
}