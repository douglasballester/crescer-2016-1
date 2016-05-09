using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Projeto_Megaman
{
    public class Rush : Robo, IUpgrade
    {

        public Rush(Chip chip) : this()
        {
           
        }

        public Rush() : base()
        {
            this.Ataque = 4;
            this.Defesa = 3;
            this.Upgrade = new List<IUpgrade>();
        }

        public int UpgradeAtaque
        {
            get
            {
                return Ataque;
            }
        }

        public int UpgradeDefesa
        {
            get
            {
                return Defesa;
            }
        }

        public override void EquiparUpgrade(IUpgrade upgrade)
        {
            if (Upgrade.Count < 2)
            {
                Upgrade.Add(upgrade);
                Ataque += upgrade.UpgradeAtaque;
                Defesa += upgrade.UpgradeDefesa;
            }
        }

        public override void Atacar(Robo robo)
        {
            if(robo.GetType().Name != "Megaman")
            {
                robo.ReceberAtaque(Ataque);
            }
        }
    }
}
