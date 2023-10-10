import java.util.Random;

public class App {
    public static void main(String[] args){
        int linhas = 3;
        int colunas = 4;
        int[][] primeiraMatriz = new int[linhas][colunas];
        int[][] matrizJaInicializada={{10, 20, 30, 40, 50},{1, 2, 3, 4, 5}};

        Random random = new Random();

        for(int l = 0; l < linhas; l++){
            for(int c = 0; c < colunas; c++){
                primeiraMatriz[l][c] =  random.nextInt(99);;
            }
        }

        //primeira forma de fazer o for para imprimir os elementos da matriz
        for(int l = 0; l < linhas; l++){
            for(int c = 0; c < colunas; c++){
                System.out.printf("%2d | ", primeiraMatriz[l][c]);
            }
            System.out.printf("%n");
        }

          //segunda forma de fazer o for para imprimir os elementos da matriz
        for(int[] n:primeiraMatriz){
            for(int v:n){
                System.out.printf("%2d | ",v);
            }
            System.out.printf("%n");
        }

        System.out.printf("%n");

        for(int[] n:matrizJaInicializada){
            for(int v:n){
                System.out.printf("%2d | ", v);
            }
            System.out.printf("%n");
        }
    }
}
