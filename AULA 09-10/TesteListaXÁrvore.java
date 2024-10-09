import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.TreeSet;

class Util {
    public static void preencherOrdenado(ArrayList<Integer> lista, int n) {
        for (int i = 0; i < n; i++) {
            lista.add(i);
        }
    }

    public static void preencherDesordenado(ArrayList<Integer> lista, int n) {
        Random gerador = new Random();
        for (int i = 0; i < n; i++) {
            lista.add(gerador.nextInt(100000));
        }
    }

    public static void preencherArvore(TreeSet<Integer> arvore, int n) {
        Random gerador = new Random();
        for (int i = 0; i < n; i++) {
            arvore.add(gerador.nextInt(100000)); // Alterado para o mesmo intervalo da lista desordenada
        }
    }

    public static int pesquisaBinariaContains(int valor, ArrayList<Integer> lista) {
        int ini = 0;
        int fim = lista.size() - 1;
        while (ini <= fim) {
            int meio = (ini + fim) / 2;
            if (valor == lista.get(meio)) {
                return meio; // Valor encontrado
            }
            if (valor < lista.get(meio)) {
                fim = meio - 1;
            } else {
                ini = meio + 1;
            }
        }
        return -1; // Valor não encontrado
    }
}

public class Principal {
    public static void main(String[] args) {
        final int N = 2000000;

        // Preencher lista desordenada
        ArrayList<Integer> listaDesordenada = new ArrayList<>();
        Util.preencherDesordenado(listaDesordenada, N);

        // Preencher lista ordenada
        ArrayList<Integer> listaOrdenada = new ArrayList<>();
        Util.preencherOrdenado(listaOrdenada, N);

        // Preencher árvore
        TreeSet<Integer> arvore = new TreeSet<>();
        Util.preencherArvore(arvore, N);

//        // Comparar método 1: lista ordenada
//        long tempoInicio = System.nanoTime();
//        System.out.println("Iniciou pesquisa na lista ordenada...");
//        boolean encontradoOrdenada = listaOrdenada.contains(N - 1); // Ajuste o valor conforme necessário
//        System.out.println("Encontrado na lista ordenada: " + encontradoOrdenada);
//        System.out.println("Tempo (ms) contains ordenada: " + (System.nanoTime() - tempoInicio) / 1000000.0);

        // Comparar método 2: lista desordenada
        long tempoInicio = System.nanoTime();
        System.out.println("Iniciou pesquisa na lista desordenada...");
        Collections.sort(listaDesordenada); // Ordena a lista desordenada
        Util.pesquisaBinariaContains(N-1, listaDesordenada); // Ajuste o valor conforme necessário
        //System.out.println("Encontrado na lista desordenada: " + encontradoDesordenada);
        System.out.println("Tempo (ms) contains desordenada: " + (System.nanoTime() - tempoInicio) / 1000000.0);

//        // Comparar busca binária na lista ordenada
//        tempoInicio = System.nanoTime();
//        System.out.println("Iniciou busca binária na lista ordenada...");
//        int posicao = Util.pesquisaBinariaContains(N - 1, listaOrdenada); // Ajuste o valor conforme necessário
//        System.out.println("Posição encontrada na lista ordenada: " + posicao);
//        System.out.println("Tempo (ms) busca binária: " + (System.nanoTime() - tempoInicio) / 1000000.0);

        // Comparar busca na árvore
        tempoInicio = System.nanoTime();
        System.out.println("\n\nIniciou pesquisa na árvore...");
        boolean encontradoArvore = arvore.contains(N - 1); // Ajuste o valor conforme necessário
        System.out.println("Encontrado na árvore: " + encontradoArvore);
        System.out.println("Tempo (ms) contains árvore: " + (System.nanoTime() - tempoInicio) / 1000000.0);
    }
}
