using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Projeto_Megaman
{
    public class EscudoEnergia : IUpgrade
    {
        public int UpgradeAtaque
        {
            get
            {
               return 0;
            }
        }

        public int UpgradeDefesa
        {
            get
            {
                return 2;
            }
        }
    }
}
