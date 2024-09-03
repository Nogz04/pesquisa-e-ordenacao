import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Classe principal para executar a ordenação de listas de alunos usando diferentes métodos.
 */
public class Main {
    public static void main(String[] args) {

        // Inicializando as listas
        List<Aluno> listaBolha = new ArrayList<>();
        List<Aluno> listaSelecao = new ArrayList<>();
        List<Aluno> listaInsercao = new ArrayList<>();
        List<Aluno> listaSort = new ArrayList<>();

        int quantidade = 60000; // serão 60 mil alunos gerados.

        Random random = new Random();
        int tamanhoNome = random.nextInt(3, 5); // fazendo com que o tamanho dos nomes mude a cada compilação do código.

        // Gerando os nomes e idades.
        listaBolha = Util.gerarNomesEIdades(quantidade, tamanhoNome);
        listaSelecao = Util.gerarNomesEIdades(quantidade, tamanhoNome);
        listaInsercao = Util.gerarNomesEIdades(quantidade, tamanhoNome);
        listaSort = Util.gerarNomesEIdades(quantidade, tamanhoNome);

        // ----------------------------------------------------- //


        // Exibindo e ordenando as listas

        Util.exibirOrdenacao(listaBolha, "bolha");
        //Util.exibirOrdenacao(listaSelecao, "selecao");
        //Util.exibirOrdenacao(listaInsercao, "insercao");
        //Util.exibirOrdenacao(listaSort, "sort");


        // TIRAR OS COMENTÁRIOS para executar cada lista, deixei o método bolha sem " / ".
        //caso queira testar a ordenação por chaves, recomendo mudar o tamanho do nome e a quantidade de nomes gerados para uma visão melhor da ordenação por chaves.
    }
}
