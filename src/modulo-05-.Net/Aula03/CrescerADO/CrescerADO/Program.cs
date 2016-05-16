using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CrescerADO
{
    class Program
    {
        static void Main(string[] args)
        {
            string email = "";
            string senha = "";


            var conexao = new SqlConnection();

            string sql = string.Format("SELECT * from usuarios where email='{0}' and senha'{1}'", email, senha);

            var comando = new SqlCommand(sql,conexao);

            conexao.Open();

            SqlDataReader leitor = comando.ExecuteReader();

            while (leitor.Read())
            {
                Console.WriteLine(leitor["email"]);
            }


            conexao.Close();
        }
    }
}
