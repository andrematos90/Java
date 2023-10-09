public class App {
    public static void main(String[] args){
        //primeira forma de declarar e adicionar itens ao array
        int[] numeros2 = {10, 5, 6};
        for (int cont = 0; cont < 2; cont++){
            System.out.printf("%d, ",numeros2[cont]);
        }

        //segunda forma de declarar e adicionar itens ao array
        int[] numeros = new int[5];

        numeros[0] = 3;
        numeros[1] = 6;
        numeros[2] = 7;
        numeros[3] = 8;
        numeros[4] = 12;

        for(int cont = 0; cont < numeros.length; cont++){
            System.out.printf("%d, ", numeros[cont]);
        }
    }
}
