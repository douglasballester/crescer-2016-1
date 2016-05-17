using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace LojaNinja.MVC.Controllers
{
    public class LoginController : Controller
    {
        [HttpGet]
        public ActionResult Index()
        {
             //Se o usuário está logado, enviamos ele direto para a AreaSecreta, caso contrário, Login.
        //if (!ServicoDeSessao.EstaLogado)
        //{
            return View();
        }

        //    return View();
        //}
    }
}