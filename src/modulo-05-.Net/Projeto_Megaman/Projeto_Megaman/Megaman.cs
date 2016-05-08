using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Projeto_Megaman
{
    public class Megaman : Robo
    {
        public Megaman() : base()
        {
        }
        private int _ataque = 6;
        private int _defesa = 0;

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

        public override void Atacar(Robo robo)
        {
            if (Vida < 30)
            {
                int dano = this.Ataque + 3;
                robo.ReceberAtaque(dano);
            }
            else
            {
                robo.ReceberAtaque(this.Ataque);
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
