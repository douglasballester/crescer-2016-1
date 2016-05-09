using Microsoft.VisualStudio.TestTools.UnitTesting;
using Projeto_Megaman;

namespace Projeto_Megaman_Test
{
    [TestClass]
    public class ProtomanTest
    {
        [TestMethod]
        public void CriarProtoman()
        {
            Robo protoman = new Protoman();

            Assert.AreEqual(100, protoman.Vida);
        }


        [TestMethod]
        public void ProtomanAtacaBot()
        {
            Robo protoman = new Protoman();
            Robo bot = new Bot();

            protoman.Atacar(bot);

            Assert.AreEqual(95, bot.Vida);
        }

        [TestMethod]
        public void ProtomanAtacaMegaman()
        {
            Robo protoman = new Protoman();
            Robo megaman = new Megaman();

            protoman.Atacar(megaman);

            Assert.AreEqual(95, megaman.Vida);
        }

        [TestMethod]
        public void ProtomanMortoVivoCom7DeAtaqueAtacaMegaman()
        {
            Robo protoman = new Protoman();
            Robo megaman = new Megaman();

            protoman.ReceberAtaque(102);
            protoman.Atacar(megaman);

            Assert.AreEqual(93, megaman.Vida);
        }

        [TestMethod]
        public void ProtomanRessucita1VezCom20VidaE7DeAtaque()
        {
            Robo protoman = new Protoman();
            
            protoman.ReceberAtaque(102);

            Assert.AreEqual(20, protoman.Vida);
        }

        [TestMethod]
        public void ProtomanTentaRessucitar2VezesCom20VidaE7DeAtaque()
        {
            Robo protoman = new Protoman();

            protoman.ReceberAtaque(102);
            protoman.ReceberAtaque(22);

            Assert.AreEqual(0, protoman.Vida);
        }

        [TestMethod]
        public void ProtomanToString()
        {
            Robo protoman = new Protoman();

            protoman.ToString();

            Assert.AreEqual("Nome: " + "Protoman" + ", Vida: " + 100 + ", Ataque: " + 5 + "Defesa: " + 2, protoman.ToString());
        }

        [TestMethod]
        public void ProtomanCom1UpgradeDeAtaque()
        {
            Robo protoman = new Protoman();
            Robo bot = new Bot();
            CanhaoDePlasma upgrade = new CanhaoDePlasma();
            protoman.EquiparUpgrade(upgrade);
            protoman.Atacar(bot);
           
            Assert.AreEqual(93, bot.Vida);
        }

        [TestMethod]
        public void ProtomanCom2UpgradeDeAtaqueAposTerMorrido1Vez()
        {
            Robo protoman = new Protoman();
            Robo bot = new Bot();
            CanhaoDePlasma upgrade = new CanhaoDePlasma();

            protoman.ReceberAtaque(102);
            protoman.EquiparUpgrade(upgrade);
            protoman.EquiparUpgrade(upgrade);
           

            protoman.Atacar(bot);

            Assert.AreEqual(89, bot.Vida);
            Assert.AreEqual(20, protoman.Vida);
        }

        [TestMethod]
        public void ProtomanCom1UpgradeDeCadaTipo()
        {
            Robo protoman = new Protoman();
            Robo bot = new Bot();
            BotasSuperVelocidade upgrade3 = new BotasSuperVelocidade();
            EscudoEnergia upgrade2 = new EscudoEnergia();
            CanhaoDePlasma upgrade = new CanhaoDePlasma();

            protoman.EquiparUpgrade(upgrade);
            protoman.EquiparUpgrade(upgrade2);
            protoman.EquiparUpgrade(upgrade3);

            protoman.Atacar(bot);
            bot.Atacar(protoman);

            Assert.AreEqual(100, protoman.Vida);
            Assert.AreEqual(92, bot.Vida);
        }

        [TestMethod]
        public void ProtomanCom1UpgradeDeCadaTipoRessucitad()
        {
            Robo protoman = new Protoman();
            Robo bot = new Bot();
            BotasSuperVelocidade upgrade3 = new BotasSuperVelocidade();
            EscudoEnergia upgrade2 = new EscudoEnergia();
            CanhaoDePlasma upgrade = new CanhaoDePlasma();

            protoman.ReceberAtaque(200);
            protoman.EquiparUpgrade(upgrade);
            protoman.EquiparUpgrade(upgrade2);
            protoman.EquiparUpgrade(upgrade3);

            protoman.Atacar(bot);
            bot.Atacar(protoman);

            Assert.AreEqual(20, protoman.Vida);
            Assert.AreEqual(90, bot.Vida);
        }

        [TestMethod]
        public void ProtomanAtacaCom1UpgradeAtaqueEDepoisCom3UpDeAtaque()
        {
            Robo protoman = new Protoman();
            Robo bot = new Bot();
            CanhaoDePlasma upgrade = new CanhaoDePlasma();
            protoman.EquiparUpgrade(upgrade);
            protoman.Atacar(bot);
            protoman.EquiparUpgrade(upgrade);
            protoman.EquiparUpgrade(upgrade);
            protoman.Atacar(bot);

            Assert.AreEqual(82, bot.Vida);
        }
    }
}
