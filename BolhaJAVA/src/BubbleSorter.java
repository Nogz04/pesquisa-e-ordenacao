import java.util.ArrayList;

public class BubbleSorter {

    // Método para ordenar o ArrayList usando o método de bolha
    public void ordenar(ArrayList<Integer> lista) {
        int n = lista.size();
        boolean trocou;

        // Percorre toda a lista
        for (int i = 0; i < n - 1; i++) {
            trocou = false;
            System.out.println("valor de i" +i);

            // Percorre a parte não ordenada da lista
            for (int j = 0; j < n - i - 1; j++) {
                System.out.println("valor de j" +j);
                // Compara os elementos adjacentes
                if (lista.get(j) > lista.get(j + 1)) {
                    // Troca se estiver na ordem errada
                    Integer temp = lista.get(j);
                    lista.set(j, lista.get(j + 1));
                    lista.set(j + 1, temp);

                    trocou = true;

                    // Imprime o estado da lista após a troca
                    System.out.println("Após troca: " + lista);
                }
            }

            // Se não houve troca, a lista já está ordenada
            if (!trocou) break;
        }
    }
}
