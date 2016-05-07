using Microsoft.VisualStudio.TestTools.UnitTesting;
using Projeto_Megaman;

namespace Projeto_Megaman_Test
{
    [TestClass]
    public class MegamanTest
    {
        [TestMethod]
        public void CriarMegaman()
        {
            Megaman megaman = new Megaman();

            Assert.AreEqual(100, megaman.Vida);
        }

       [TestMethod]
        public void MegamanAtacaBot()
        {
            Robo megaman = new Megaman();
            Robo bot = new Bot();

            megaman.Atacar(bot);

            Assert.AreEqual(94, bot.Vida);
        }

        [TestMethod]
        public void MegamanAtacaBot10Vezes()
        {
            Robo megaman = new Megaman();
            Robo bot = new Bot();

            for (int i = 0; i < 10; i++)
            {
                megaman.Atacar(bot);
            }
            Assert.AreEqual(40, bot.Vida);
        }

        [TestMethod]
        public void MegamanAtacaBotComMenosDe30Vida()
        {
            Robo megaman = new Megaman();
            Robo bot = new Bot();

            megaman.ReceberAtaque(71);

            megaman.Atacar(bot);

            Assert.AreEqual(29, megaman.Vida);
           Assert.AreEqual(91, bot.Vida);
        }

        [TestMethod]
        public void MegamanAtacaProtomanComMenosDe30Vida()
        {
            Robo megaman = new Megaman();
            Robo protoman = new Protoman();

            megaman.ReceberAtaque(71);

            megaman.Atacar(protoman);

            Assert.AreEqual(93, protoman.Vida);
        }

        [TestMethod]
        public void MegamanAtacaProtoman()
        {
            Robo megaman = new Megaman();
            Robo protoman = new Protoman();

            megaman.Atacar(protoman);

            Assert.AreEqual(96, protoman.Vida);
        }

        [TestMethod]
        public void BotAtacaMegaman()
        {
            Robo megaman = new Megaman();
            Robo bot = new Bot();

            bot.Atacar(megaman);

            Assert.AreEqual(95, megaman.Vida);
        }

    }
}
