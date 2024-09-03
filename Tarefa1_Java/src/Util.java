import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Classe utilitária para gerar nomes e idades aleatórios para alunos.
 */
public class Util {

    /**
     * Gera um nome aleatório com o tamanho especificado.

     * @param tamanho O tamanho do nome a ser gerado.
     * @return O nome aleatório gerado.
     */
    public static String gerarNomeAleatorio(int tamanho) {

        String letras = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder nome = new StringBuilder();

        Random random = new Random();
        for (int i = 0; i < tamanho; i++) {
            char letraSorteada = letras.charAt(random.nextInt(letras.length()));
            nome.append(letraSorteada);
        }

        return nome.toString();
    }



    /**
     * Gera uma idade aleatória entre 18 e 70 anos.
     *
     * @return A idade aleatória gerada.
     */
    public static int gerarIdadeAleatoria() {

        Random random = new Random();
        return random.nextInt(18,70); // Gera idade entre 18 e 70

    }


    /**
     * Exibe o estado da lista antes e depois da ordenação.
     *
     * @param lista (list) A lista de alunos a ser exibida.
     * @param metodo (str) O método de ordenação a ser aplicado.
     */
    public static void exibirOrdenacao(List<Aluno> lista, String metodo) {

        switch (metodo) {
            case "bolha":
                Ordenacao.metodoBolha(lista);
                break;
            case "selecao":
                Ordenacao.metodoSelecao(lista);
                break;
            case "insercao":
                Ordenacao.metodoInsercao(lista);
                break;
            case "sort":
                Collections.sort(lista);
                break;
            default:
                throw new IllegalArgumentException("Método de ordenacao inválido: " + metodo);
        }

        System.out.println("\n==== Lista " + metodo + " COM ordenacao ====\n");
        System.out.println(lista);
    }


    /**
     * Gera uma lista de alunos com nomes e idades aleatórios.
     *
     * @param quantidade A quantidade de alunos a ser gerada.
     * @param tamanhoNome O tamanho dos nomes dos alunos.
     * @return A lista de alunos gerados.
     */
    public static List<Aluno> gerarNomesEIdades(int quantidade, int tamanhoNome) {

        List<Aluno> lista = new ArrayList<>();
        for (int i = 0; i < quantidade; i++) {
            String nome = gerarNomeAleatorio(tamanhoNome);
            int idade = gerarIdadeAleatoria();
            lista.add(new Aluno(nome, idade));
        }

        return lista;
    }
}
