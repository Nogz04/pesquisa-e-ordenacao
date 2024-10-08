package ListaPalavras;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Util {

    /**
     * Método estático que gera uma palavra aleatória a partir de um tamanho
     * @param tamanho - quantidade de caracteres da palavra
     * @return uma palavra aleatória
     */
    public static String gerarPalavra(int tamanho) {
        StringBuilder letras = new StringBuilder("abcdefghijklmnopqrstuvwxyz");
        Random gerador = new Random();
        StringBuilder palavra = new StringBuilder();

        for (int i = 0; i < tamanho; i++) {
            palavra.append( letras.charAt( gerador.nextInt( letras.length() )));
        }

        return palavra.toString();
    }

    /**
     * Método estático que popula um lista com palavras aleatórias
     * @param lista - contém as palavras geradas
     * @param quantidade - quantas palavras se deseja gerar
     * @param tamanho - quantidade de caracteres da palavra a ser gerada
     */
    public static void gerarPalavrasLista(ArrayList<String> lista, int quantidade,
                                          int tamanho) {
        for (int i = 0; i < quantidade; i++) {
            lista.add( Util.gerarPalavra(tamanho) );
        }
    }

    /**
     * Método estático que exibe elemento de qualquer lista
     * @param lista - contém números ou palavras
     * @param frase - título a ser exibido pelo método
     */
    public static void exibir(ArrayList lista, String frase) {
        System.out.println(frase);
        for (Object item : lista) {
            System.out.println(item);
        }
    }

    public static void gravarPalavrasArquivo(String nomeArquivo, ArrayList<String> lista) throws IOException {
        try (BufferedWriter gravador = new BufferedWriter(new FileWriter(nomeArquivo))) {
            for (Object palavra : lista) {
                gravador.write(palavra.toString()); // Converte o número para String antes de gravar
                gravador.newLine(); // Adiciona uma nova linha após cada número
            }
        } // O try-with-resources garante que o BufferedWriter será fechado corretamente
    }
}
