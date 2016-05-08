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

        [TestMethod]
        public void MegamanToString()
        {
            Robo megaman = new Megaman();

            megaman.ToString();

            Assert.AreEqual("Nome: " + "Megaman"+" Vida: " + 100 + ", Ataque: " + 6 + "Defesa: " + 0, megaman.ToString());
        }

        [TestMethod]
        public void MegamanCom1UpgradeDeAtaqueAtacaBot()
        {
            Megaman megaman = new Megaman();
            Robo bot = new Bot();

            CanhaoDePlasma upgrade = new CanhaoDePlasma();

            megaman.EquiparUpgrade(upgrade);
            megaman.Atacar(bot);

            Assert.AreEqual(92, bot.Vida);
        }

        [TestMethod]
        public void MegamanCom3UpgradeDeAtaqueAtacaBot()
        {
            Megaman megaman = new Megaman();
            Robo bot = new Bot();

            CanhaoDePlasma upgrade = new CanhaoDePlasma();

            for (int i = 0; i < 3; i++)
            {
                megaman.EquiparUpgrade(upgrade);
            }
            
            megaman.Atacar(bot);
            Assert.AreEqual(88, bot.Vida);
        }

        [TestMethod]
        public void MegamanCom2UpgradeDeAtaqueE1DeDefAtacaBot()
        {
            Megaman megaman = new Megaman();
            Robo bot = new Bot();

            CanhaoDePlasma upgrade = new CanhaoDePlasma();
            EscudoEnergia upgrade2 = new EscudoEnergia();

            megaman.EquiparUpgrade(upgrade);
            megaman.EquiparUpgrade(upgrade);
            megaman.EquiparUpgrade(upgrade2);

            megaman.Atacar(bot);
            bot.Atacar(megaman);
            Assert.AreEqual(90, bot.Vida);
            Assert.AreEqual(97, megaman.Vida);
        }

        [TestMethod]
        public void MegamanCom1UpgradeDeCadaTipo()
        {
            Megaman megaman = new Megaman();
            Robo bot = new Bot();

            CanhaoDePlasma upgrade = new CanhaoDePlasma();
            EscudoEnergia upgrade2 = new EscudoEnergia();
            BotasSuperVelocidade upgrade3 = new BotasSuperVelocidade();

            megaman.EquiparUpgrade(upgrade);
            megaman.EquiparUpgrade(upgrade2);
            megaman.EquiparUpgrade(upgrade3);

            megaman.Atacar(bot);
            bot.Atacar(megaman);
            Assert.AreEqual(91, bot.Vida);
            Assert.AreEqual(98, megaman.Vida);
        }

        [TestMethod]
        public void MegamanCom1UpgradeDeCadaTipoEMenos30Vida()
        {
            Megaman megaman = new Megaman();
            Robo bot = new Bot();

            CanhaoDePlasma upgrade = new CanhaoDePlasma();
            EscudoEnergia upgrade2 = new EscudoEnergia();
            BotasSuperVelocidade upgrade3 = new BotasSuperVelocidade();

            megaman.ReceberAtaque(71);
            megaman.EquiparUpgrade(upgrade);
            megaman.EquiparUpgrade(upgrade2);
            megaman.EquiparUpgrade(upgrade3);

            megaman.Atacar(bot);
            bot.Atacar(megaman);
            Assert.AreEqual(88, bot.Vida);
            Assert.AreEqual(27, megaman.Vida);
        }

        [TestMethod]
        public void MegamanAtacaCom3UpgradesDefesa()
        {
            Megaman megaman = new Megaman();
            Robo bot = new Bot();
            EscudoEnergia upgrade2 = new EscudoEnergia();

            megaman.EquiparUpgrade(upgrade2);
            megaman.EquiparUpgrade(upgrade2);
            megaman.EquiparUpgrade(upgrade2);

            megaman.Atacar(bot);
            
            Assert.AreEqual(94, bot.Vida);
        }

        [TestMethod]
        public void MegamanSeDefendeCom3UpgradesDefesa()
        {
            Megaman megaman = new Megaman();
            Robo bot = new Bot();
            EscudoEnergia upgrade2 = new EscudoEnergia();

            megaman.EquiparUpgrade(upgrade2);
            megaman.EquiparUpgrade(upgrade2);
            megaman.EquiparUpgrade(upgrade2);

            bot.Atacar(megaman);

            Assert.AreEqual(100, megaman.Vida);
        }

        [TestMethod]
        public void MegamanRecebe4Upgrades()
        {
            Megaman megaman = new Megaman();
            Robo bot = new Bot();
            CanhaoDePlasma upgrade2 = new CanhaoDePlasma();

            megaman.EquiparUpgrade(upgrade2);
            megaman.EquiparUpgrade(upgrade2);
            megaman.EquiparUpgrade(upgrade2);
            megaman.EquiparUpgrade(upgrade2);

            megaman.Atacar(bot);

            Assert.AreEqual(88, bot.Vida);
        }
    }
}
