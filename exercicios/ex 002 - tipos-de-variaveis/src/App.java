/*Crie um programa em Java que solicite ao usuário que insira um dado numérico/string/ou numero real .

Armazene esse dado em uma variável e imprima qual o tipo de dado inserido.

 */

import java.util.Scanner;



public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número, palavra ou booleano: ");

        String dado = scanner.nextLine();

            try {
                Integer.parseInt(dado);
                System.out.println("O valor digitado é um numero");
            } catch (NumberFormatException e) {
                try {
                   Double.parseDouble(dado);
                    System.out.println("O número digitado é um numero real");
                } catch (NumberFormatException b) {
                    if(dado instanceof String){
                        System.out.println("Você digitou uma palavra");

                        }
                    
                }
            }

            scanner.close();

        }
    }

