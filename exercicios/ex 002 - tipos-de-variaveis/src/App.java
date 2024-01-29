/*Crie um programa em Java que solicite ao usuário que insira um dado numérico/string/boolean ou outro .

Armazene esse dado em uma variável e imprima qual o tipo de dado inserido.

 */

import java.util.Scanner;



public class App {
    public static void main(String[] args) throws Exception {

    
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número, palavra ou booleano: ");

        String dado = scanner.nextLine();


        if(dado instanceof String){
            System.out.println("o valor digitado é uma palavra!");
        }else{
            try{
                int numero = Integer.parseInt(dado);
                System.out.println("O valor digitado é um numero");
            }
            catch(NumberFormatException e){
                try{
                    double numero = Double.parseDouble(dado);
                    System.out.println("O número digitado é um numero real");
        }catch(NumberFormatException b){
            System.out.println("O valor digitado é booleano");
        }
    }
       
    }
}
