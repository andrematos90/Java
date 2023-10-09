import java.util.Scanner;

public class App1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        System.out.print("Digite seu nome: ");
        nome = scan.next(); // método para ler string
        System.out.print("Digite sua idade: ");
        idade = scan.nextInt(); //método para ler inteiros

        System.out.printf("Nome: %s", nome);
        System.out.printf("Idade: %d", idade);

        scan.close();
    }
}
