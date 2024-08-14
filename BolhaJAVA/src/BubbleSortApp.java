import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSortApp {

    public static void main(String[] args) {
        // Cria e inicializa o ArrayList com números inteiros
        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(64, 34, 25, 12, 22, 11, 90));
        
        // Imprime o ArrayList original
        System.out.println("ArrayList original: " + numeros);
        
        // Cria uma instância de BubbleSorter
        BubbleSorter ordenadora = new BubbleSorter();
        
        // Chama o método de ordenação
        ordenadora.ordenar(numeros);
        
        // Imprime o ArrayList ordenado
        System.out.println("ArrayList ordenado: " + numeros);
    }
}
