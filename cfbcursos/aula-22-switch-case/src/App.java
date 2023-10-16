import java.util.Scanner;

public class App {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        String operacao;
        int n1;
        int n2;
        int resultado= 0;

        System.out.print("Digite o primeiro valor: ");
        n1 = Integer.parseInt(scanner.nextLine());
        System.out.print("Digite o segundo valor: ");
        n2 = Integer.parseInt(scanner.nextLine());
        System.out.print("Digite a operacao: ");
        operacao = scanner.nextLine();




        switch(operacao){
            case "+":
                  resultado = n1 + n2;
                  break;
            case "-":
                resultado = n1 - n2;
                  break;
            case "/":
                 if(n2!=0){
                    resultado = n1 / n2;
                 }else{
                     System.out.print("divisao por 0 nao e permitida!");
                 }
                 break;
            case "*":
                 resultado = n1 * n2;
                 break;
            default:
                 System.out.print("operacao invalida!");
                 break;
        }
         System.out.printf("resultado: %d", resultado);
         scanner.close();
    }
}
