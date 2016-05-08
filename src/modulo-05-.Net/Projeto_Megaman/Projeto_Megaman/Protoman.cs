using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Projeto_Megaman
{
    public class Protoman : Robo
    {
        private int contMorte = 0;
        private int _defesa = 2;
        private int _ataque = 5;


        public Protoman() : base()
        {
        }

        protected override int Ataque
        {
            get
            {
                return _ataque;
            }
        }

        protected override int Defesa
        {
            get
            {
                return _defesa;
            }
        }

        public override void ReceberAtaque(int ataque)
        {
            base.ReceberAtaque(ataque);

            if ((Vida <= 0) && (contMorte == 0))
            {
                Vida = 20;
                contMorte = 1;
                _ataque += 2;
            }
        }

        public override void EquiparUpgrade(IUpgrade upgrade)
        {
            if (Upgrade.Count < 3)
            {
                Upgrade.Add(upgrade);
                _ataque += upgrade.UpgradeAtaque;
                _defesa += upgrade.UpgradeDefesa;
            }
        }
    }
}