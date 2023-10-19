public class App {
    public static void main(String[] args) {
        int a = 10;
        int b = 22;
        int res = 0;

        if(a > 10) {
            throw new IllegalArgumentException("valor acima de 10 ERRO!");
        }
        if(b > 20){
            throw new IllegalArgumentException("valor acima de 11 ERRO!");
        }

        res = a +b;
        System.out.print(res);
    }
} 
