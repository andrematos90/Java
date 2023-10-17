public class App {
    public static void main(String[] args) {
       int[] notas = {1, 8, 9, 5, 7, 8, 2};
       int[] resultado = {0, 0};

       avalia(notas, resultado);

       System.out.printf("Aprovados: %d%n", resultado[0]);
       System.out.printf("Reprovados: %d%n", resultado[1]);



    }

    public static void avalia(int[] n, int[]res){
    for(int item:n){
        if(item >= 7){
            res[0]++;
        }else{
            res[1]++;
        }
     }
    }
}




