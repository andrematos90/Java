import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite se nome: ");
        String nome  = scan.nextLine();
        
        int erros=0;

        System.out.print("1. Qual o estrela do nosso sistema solar? ");
        System.out.println("a) Alpha Centauri, b) VY Canis Majoris, c)Sol");
        String a  = scan.nextLine();

        System.out.print("2. Qual a primeira letra do nosso alfabeto? ");
        System.out.println("a) A, b)Z c)G");
        String b  = scan.nextLine();

        System.out.print("3. 2X10 = ? ");
        System.out.println("a)10, b)30, c)20");
        String c  = scan.nextLine();

        System.out.print("4. Lula is?: ");
        System.out.println("a)Ladrao, b)Melhor presidente, c) Alma mais honesta");
        String d  = scan.nextLine();

        System.out.print("5. Valor de P.I? ");
        System.out.println("a)3.14, b)3.25, c)3.45");
        String e  = scan.nextLine();

        scan.close();

        String[] respostas = {a, b, c, d, e};
        
        String[] gabarito = new String[5];

        gabarito[0] ="c";
        gabarito[1] = "a";
        gabarito[2] = "c";
        gabarito[3] = "a";
        gabarito[4] = "a";

        if(Arrays.equals(gabarito, respostas)){
            System.out.printf("Parabens %s, voce gabaritou as respostas!%n", nome);
        }else{
            for(int i=0; i < 5; i++ ){
                if(!gabarito[i].equals(respostas[i])){
                    erros++;
                }
                
            }
        }

        System.out.printf("Quantidade de erros: %d%n", erros);
        
    }
}
