public class App {
    public static void main(String[] args) {
        int[] numeros = {10, 1, 21};
        System.out.printf("Resultado: %d%n", soma(numeros));

         System.out.printf("Resultado outraSoma:%d%n", outraSoma(1,5,8)); // pode se passar diretamente nuemros 
       
    }

    public static int soma(int[] n){
        int res=0;
        for(int item:n){
            res+=item;
        }
        return res;
    }

    //outra forma de passar varios numeros como parametro

   

    public static int outraSoma(int...n){ //n é um array
        int res = 0;
        for(int item:n){
            res+=item;
        }
        return res;
    }
}
