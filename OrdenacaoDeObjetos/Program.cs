using OrdenacaoDeObjetos;

//Aluno a1 = new Aluno("Matheus", 20);
//Aluno a2 = new Aluno("Alex", 51);

//Console.WriteLine(a2.CompareTo(a1));

List<Aluno> lista = new List<Aluno>();


lista.Add(new Aluno("Matheus", 20));
lista.Add(new Aluno("Matheus", 19));
lista.Add(new Aluno("Matheus", 22));
lista.Add(new Aluno("Iago", 21));
lista.Add(new Aluno("Romeo", 19));
lista.Add(new Aluno("Difante", 19));
lista.Add(new Aluno("Vicenzo", 19));
lista.Add(new Aluno("Gabriela", 17));

//lista.Sort();
//lista = lista.OrderBy(a => a.Nome).ThenBy(a => a.Idade).ToList();
Ordenacao.pente(lista);

foreach (var Item in lista)
{
    Console.WriteLine(Item);
}