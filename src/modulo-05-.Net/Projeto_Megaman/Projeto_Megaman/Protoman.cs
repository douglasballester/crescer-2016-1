using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Projeto_Megaman
{
    public class Protoman : Robo
    {
        
        public Protoman()
        {
           
        }

        protected override int Ataque
        {
            get
            {
                return Ataque;
            }
        }

        protected override int Defesa
        {
            get
            {
                return 2;
            }
        }

        public override void Atacar(Robo robo)
        {
            base.Atacar(robo);
        }

        public override void ReceberAtaque(int ataque)
        {
            base.ReceberAtaque(ataque);
            int contMorte = 0;
            if(Vida <= 0 && contMorte == 0)
            {
                Vida = 20;
                contMorte = 1;
            }
        }

    }
}
