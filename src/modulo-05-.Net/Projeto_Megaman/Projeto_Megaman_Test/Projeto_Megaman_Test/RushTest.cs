using Microsoft.VisualStudio.TestTools.UnitTesting;
using Projeto_Megaman;

namespace Projeto_Megaman_Test
{
    
    [TestClass]
    public class RushTest
    {
        [TestMethod]
        public void CriarRush()
        {
            Robo rush = new Rush();

            Assert.AreEqual(100, rush.Vida);
        }

        [TestMethod]
        public void AdicionarUpgradeDeAtaque()
        {
            Robo rush = new Rush();
            Robo bot = new Bot();

            rush.EquiparUpgrade(new CanhaoDePlasma());
            rush.Atacar(bot);
            Assert.AreEqual(94, bot.Vida);
            Assert.AreEqual(100, rush.Vida);
        }

        [TestMethod]
        public void Adicionar3UpgradesNoRush()
        {
            Robo rush = new Rush();
            Robo bot = new Bot();

            rush.EquiparUpgrade(new CanhaoDePlasma());
            rush.EquiparUpgrade(new CanhaoDePlasma());
            rush.EquiparUpgrade(new CanhaoDePlasma());

            rush.Atacar(bot);
            Assert.AreEqual(92, bot.Vida);
        }

        [TestMethod]
        public void RushAdicionaRushComoUpgrade()
        {
            Robo rush = new Rush();
            Robo bot = new Bot();

            rush.EquiparUpgrade(new Rush());
            bot.EquiparUpgrade(new Rush());

            rush.Atacar(bot);
            bot.Atacar(rush);
            Assert.AreEqual(95, bot.Vida);
            Assert.AreEqual(97, rush.Vida);
        }

        [TestMethod]
        public void BotAdicionaRushComUpgradeRushComoUpgrade()
        {
            Rush rush = new Rush();
            Robo bot = new Bot();

            rush.EquiparUpgrade(new Rush());

            bot.EquiparUpgrade(rush);

            rush.Atacar(bot);
            bot.Atacar(rush);
            Assert.AreEqual(98, bot.Vida);
            Assert.AreEqual(93, rush.Vida);
        }

        [TestMethod]
        public void RushAtacaMegaman()
        {
            Robo rush = new Rush();
            Robo megaman = new Megaman();

            rush.Atacar(megaman);
            Assert.AreEqual(100, megaman.Vida);
        }
    }
}
