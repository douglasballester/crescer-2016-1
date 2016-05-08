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

        public Protoman() : base()
        {
            Defesa = 2;
        }

        public override void ReceberAtaque(int ataque)
        {
            base.ReceberAtaque(ataque);

            if ((Vida <= 0) && (contMorte == 0))
            {
                Vida = 20;
                contMorte = 1;
                Ataque += 2;
            }
        }
    }
}