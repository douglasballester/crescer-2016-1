using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Projeto_Megaman
{
    public class BotasSuperVelocidade : IUpgrade
    {
        public int UpgradeAtaque
        {
            get
            {
                return 1;
            }
        }

        public int UpgradeDefesa
        {
            get
            {
                return 1;
            }
        }
    }
}
