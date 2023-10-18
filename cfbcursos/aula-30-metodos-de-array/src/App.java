import java.util.Arrays;

public class App {
    public static void main(String[] args) {
         int[] numeros = {5, 2, 8, 1, 9, 4};
        
        Arrays.sort(numeros); // Classifica o array
        System.out.println(Arrays.toString(numeros)); // Imprime [1, 2, 4, 5, 8, 9]
        
        int indice = Arrays.binarySearch(numeros, 5); // Procura o valor 5 no array
        System.out.println("Índice do valor 5: " + indice); // Imprime 3
        
        int[] copia = new int[numeros.length];
        System.arraycopy(numeros, 0, copia, 0, numeros.length); // Copia o array
        System.out.println(Arrays.toString(copia)); // Imprime [1, 2, 4, 5, 8, 9]
        
        Arrays.fill(copia, 0); // Preenche o array com zeros
        System.out.println(Arrays.toString(copia)); // Imprime [0, 0, 0, 0, 0, 0]
        
        boolean saoIguais = Arrays.equals(numeros, copia); // Compara os arrays
        System.out.println("Os arrays são iguais? " + saoIguais); // Imprime false
    }
}
