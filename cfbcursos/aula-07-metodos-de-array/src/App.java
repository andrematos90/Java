import java.util.Arrays;

public class App {

    
    public static void main(String[] args)  {
        int[] array={10,40,30,80,60,50};

        int[] arrayCopia = new int[5];


        //for para percorrer elementos do array
        for(int i=0; i < array.length; i++){
            System.out.printf("%d, ",array[i]);
        }

        System.out.println(" ");

        //for especial para percorrer elementos do array
        for(int n:array){
            System.out.printf("%d - ", n);
        }

         System.out.println(" ");

        //método "sort" para ordenar os elementos do array
        Arrays.sort(array);
        for(int item:array){
            System.out.printf("%d, ", item);
        }

        System.out.println(" ");

        //método "fill" preenche o array com um valor especificado
        Arrays.fill(array, 10);
        for(int n:array){
            System.out.printf("%d ", n);
        }

        System.out.println(" ");

        //método "copy" copia um array para outro
        System.arraycopy(array, 0, arrayCopia, 0, 5);
        for(int item:arrayCopia){
            System.out.printf("%d - ", item);
        }

         System.out.println(" ");

         //método 'equals" compara arrays, se forem igual retorna "true" se nao "false"
        System.out.printf("sao iguais: %s", Arrays.equals(array, arrayCopia) ? "Sim" : "nao");

         System.out.println(" ");

        //método "binary search" verifica se existe determinado elemento esta no array, retorna a posição do elemento, antes de ultilizar o método precisa ordenar o array

        System.out.printf("o elemento %d esta no array? %s",55,Arrays.binarySearch(array,55) > 0 ? "esta" : "nao esta");


    }
}
