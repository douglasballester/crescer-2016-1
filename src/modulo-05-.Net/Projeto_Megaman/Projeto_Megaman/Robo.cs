using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;


namespace Projeto_Megaman
{
    public class Robo
    {
       
        public int Vida { get; protected set; }
        protected List<IUpgrade> Upgrade = new List<IUpgrade>();
        protected Chip chip;

        protected virtual int Ataque{ get; set; }
        protected virtual int Defesa{ get; set; }

        public Robo(Chip chip) : this()
        {
        }

        public Robo()
        {
            Vida = 100;
            Ataque = 5;
        }

        public virtual void Atacar(Robo robo)
        {
            robo.ReceberAtaque(this.Ataque);
        }

        public virtual void ReceberAtaque(int ataque)
        {
            int dano = ataque - this.Defesa;
            if (dano > 0)
            {
                this.Vida -= dano;
            }
        }

        public virtual void EquiparUpgrade(IUpgrade upgrade)
        {
            if (Upgrade.Count < 3)
            {
                Upgrade.Add(upgrade);
                Ataque += upgrade.UpgradeAtaque;
                Defesa += upgrade.UpgradeDefesa;
            }
        }

        /*public void VerificaChip(Robo robo)
        {
            
        }*/

        public override string ToString()
        {
            return "Nome: " + this.GetType().Name + ", Vida: " + this.Vida + ", Ataque: " + this.Ataque + "Defesa: " + this.Defesa;
        }

    }
}
