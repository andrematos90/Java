public class App {
    public static void main(String[] args) {

        final int tamanho = 5;
        int[] array = new int[5];

        array[0]= 1;
        array[1]= 2;
        array[2]= 3;
        array[3]= 4;
        array[4]= 5;

        //imprime na  do indice 0 até o ultimo
        for(int i = 0; i < tamanho; i++){
            System.out.printf("%d%n", array[i]);
        }

        //imprime do ultimo até o indice 0
        for(int i = tamanho-1; i >= 0; i--){
            System.out.printf("%d%n", array[i]);
        }

        //for especial para arrays
        for(int numero:array){
            System.out.println(numero);
        }

        //criando array ja com os valores
        int[] numeros = {1, 2, 3};
    }
        
}
