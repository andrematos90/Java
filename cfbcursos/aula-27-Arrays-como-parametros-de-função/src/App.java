public class App {
    public static void main(String[] args) {
        int[] numeros = {10, 22, 31, 48, 51, 68};
        
        parImpar(numeros);


    }

    public static void parImpar(int[] array){
        for(int item:array){
            if(item % 2 == 0){
                System.out.printf("%d - PAR%n", item);
            }else{
                System.out.printf("%d - IMPAR%n", item);
            }
        }
    }
}
