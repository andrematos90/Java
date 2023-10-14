public class App {
    public static void main(String[] args){
    
       Calculadora operacao = new Calculadora();

       System.out.printf("resultado da conta: %d", operacao.soma(1, 8,1));

       
       System.out.printf("resultado da conta: %d", operacao.subtracao(8, 4));

    }
}
