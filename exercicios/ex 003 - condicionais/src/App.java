/*Você foi contratado para desenvolver um programa que simule um sistema de reserva de passagens de avião. O programa deve permitir que os usuários escolham o tipo de assento e a classe do voo. Existem três tipos de assentos disponíveis: Econômico, Executivo e Primeira Classe. As classes de voo são: Internacional e Nacional.

As regras para a reserva são as seguintes:

Para voos internacionais:

A classe Econômica possui 30 assentos, 5 estão disponiveis.
A classe Executiva possui 20 assentos, 1 estão disponiveis.
A Primeira Classe possui 10 assentos, 0 estão disponiveis.

Para voos nacionais:

A classe Econômica possui 50 assentos, 0 estão disponiveis.
A classe Executiva possui 30 assentos, 5 estão disponiveis.
A Primeira Classe possui 15 assentos, 5 estão disponiveis.

Seu programa deve:

Solicitar ao usuário que selecione o tipo de voo (Internacional ou Nacional).
Solicitar ao usuário que selecione a classe do voo (Econômica, Executiva ou Primeira Classe).

Verificar a disponibilidade de assentos para a classe selecionada e informar se a reserva foi bem-sucedida ou se não há assentos disponíveis naquela classe.

Considere também as seguintes restrições:

Caso a classe selecionada não seja válida, informe ao usuário e peça uma nova seleção.
Caso o tipo de voo selecionado não seja válido, informe ao usuário e peça uma nova seleção. */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Internacional reservaInternacional = new Internacional();
        Nacional reservaNacional = new Nacional();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o numero da opção do seu voo:");
        System.out.println("1 -Internacional?");
        System.out.println("2 -Nacional");
        int opcaoVoo = Integer.parseInt(scanner.nextLine()); 

        System.out.println("Digite o numero da opcao de assento: ");
        System.out.println("1 - Economico");
        System.out.println("2 - Executivo");
        System.out.println("3 - Primeira Classe");
        int opcaoAssento = Integer.parseInt(scanner.nextLine());

        if(opcaoVoo == 1){
            if(opcaoAssento == 1 && 
            reservaInternacional.getAssentoEconomico() > 0 ){
                System.out.println("Reserva realizada com sucesso!");
            }
            if(opcaoAssento == 2 &&
            reservaInternacional.getAssentoExecutivo() > 0){
                System.out.println("Reserva realizada com sucesso!");
            }
            if(opcaoAssento == 3 &&
            reservaInternacional.getAssentoPrimeira() > 0){
                System.out.println("Reserva realizada com sucesso!");
            }
            else{
                System.out.println("Não há mais acentos disponiveis! Reserva não realizada!");
            }
            
        }

        if(opcaoVoo == 2){
            if(opcaoAssento == 1 && 
            reservaNacional.getAssentoEconomico() > 0 ){
                System.out.println("Reserva realizada com sucesso!");
            }
            if(opcaoAssento == 2 &&
            reservaNacional.getAssentoExecutivo() > 0){
                System.out.println("Reserva realizada com sucesso!");
            }
            if(opcaoAssento == 3 &&
            reservaNacional.getAssentoPrimeira() > 0){
                System.out.println("Reserva realizada com sucesso!");
            }
            else{
                System.out.println("Não há mais acentos disponiveis! Reserva não realizada!");
            }
        }

      

        scanner.close();

    
    }
}
