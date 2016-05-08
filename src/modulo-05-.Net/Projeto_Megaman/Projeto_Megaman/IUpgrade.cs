using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Projeto_Megaman
{
    public interface IUpgrade
    {
        int UpgradeAtaque { get; }
        int UpgradeDefesa { get; }
    }
}
