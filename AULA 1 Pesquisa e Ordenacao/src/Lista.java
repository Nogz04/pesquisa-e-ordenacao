import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class Lista {

    public static void criarLista(ArrayList<Integer> lista, int numeroRandomizacoes){
        Random random = new Random();
        for (int i = 0; i<numeroRandomizacoes; i++ ){
            int randomNumeros = random.nextInt(1, 1001);
            lista.add(randomNumeros);
        }
    }


    public static void exibirLista(ArrayList<Integer> lista){
        for (Integer numeros : lista){
            System.out.println(numeros);
        }
    }

    public static void gravarEmArquivo(String nomeArquivo, ArrayList<Integer> lista) throws IOException {
        try (BufferedWriter gravador = new BufferedWriter(new FileWriter(nomeArquivo))) {
            for (Integer numero : lista) {
                gravador.write(numero.toString()); // Converte o número para String antes de gravar
                gravador.newLine(); // Adiciona uma nova linha após cada número
            }
        } // O try-with-resources garante que o BufferedWriter será fechado corretamente
    }

    public static ArrayList<Integer> lerArquivo(String nomeArquivo) throws IOException{
        ArrayList<Integer> lista = new ArrayList<>();
        try (BufferedReader leitor = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = leitor.readLine()) != null) {
                lista.add(Integer.parseInt(linha)); // Converte a linha para um inteiro e adiciona à lista
            }
        } // O try-with-resources garante que o BufferedReader será fechado corretamente
        return lista;
    }
}
