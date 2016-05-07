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

        protected override int Ataque
        {
            get
            {
                return 6;
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

        public override void ReceberAtaque(int ataque)
        {
            base.ReceberAtaque(ataque);
        }
    }
}
