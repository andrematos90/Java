import java.security.SecureRandom;

public class App {
    public static void main(String[] args) {
        final int linhas = 3;
        final int colunas = 5;
        int[][] matriz = new int[linhas][colunas] ;
        
      
        
        geraMatriz(matriz, linhas, colunas);
        impMatriz(matriz, linhas, colunas);
            
    }

     public static void geraMatriz(int[][] mtz, int lin, int col){
            for(int l=0; l < lin; l++){
                 for(int c=0; c < col; c++){
                     mtz[l][c] =  new SecureRandom().nextInt(100);
                 }
                
            }
     }

     public static void impMatriz(int[][] mtz, int lin, int col){
            for(int l=0; l < lin; l++){
                 for(int c=0; c < col; c++){
                     System.out.printf("%d |", mtz[l][c] );
                 }
                  System.out.printf("%n");
           }
       }
       
}
