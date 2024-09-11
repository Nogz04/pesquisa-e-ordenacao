using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using static System.Net.Mime.MediaTypeNames;

namespace OrdenacaoDeObjetos
{

    internal class Aluno : IComparable<Aluno>
    {
        
        public string Nome { get; set; }
        public int Idade { get; set; }

        public Aluno(string nome, int idade)
        {
            Nome = nome;
            Idade = idade;
        }

        public override bool Equals(object? obj)
        {
            return obj is Aluno aluno &&
                   Nome == aluno.Nome;
        }

        public override string ToString()
        {
            return "Aluno{" + "nome=" + Nome + ", idade=" + Idade + '}';
        }

        public int CompareTo(Aluno? o)
        {
            if (o == null) return 0;
            if (this.Nome.CompareTo(o.Nome) != 0)
            {
                return this.Nome.CompareTo(o.Nome);
            }
            if (this.Idade > o.Idade)
            {
                return 1;
            }
            return -1;
        }
    }
}
