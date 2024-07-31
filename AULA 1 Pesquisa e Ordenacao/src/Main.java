import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        ArrayList<Integer> lista = new ArrayList<>();
        ArrayList<String> listaString = new ArrayList<>();

        Lista exemplo1 = new Lista();
        Lista.criarLista(lista, 1000);
        Lista.exibirLista(lista);

        try {
            Lista.gravarEmArquivo("NumerosJAVA.txt", lista); // Grava a lista em um arquivo
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            ArrayList<Integer> listaLida = Lista.lerArquivo("OutrosNumeros.txt"); // Lê a lista do arquivo
            System.out.println("\nConteúdo do arquivo:");
            Lista.exibirLista(listaLida); // Exibe a lista lida do arquivo
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
