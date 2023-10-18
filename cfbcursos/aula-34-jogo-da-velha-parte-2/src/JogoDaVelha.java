import java.util.Scanner;

public class JogoDaVelha {
    public static void main(String[] args){

        Campo[][] velha = new Campo[3][3];
        char simboloatual ='X';
        boolean game = true;
        String vitoria = "";
        Scanner scan = new Scanner(System.in);

        while(game){
            desenhaJogo(velha);
            vitoria = verificaVitoria(velha);
            if(!vitoria.equals("")){
                System.out.printf("Jogador %s venceu%n!", vitoria);
                break;
            }
        }


    }


    public static void desenhaJogo(Campo [][] v){
        //limpa tela();

        System.out.println("    0    1    2");
        System.out.printf("0     %c  |  %c   |   %c   %n", v[0][0].getSimbolo(), v[0][1].getSimbolo(), v[0][2].getSimbolo());
        System.out.println("--------------------");
        System.out.printf("1     %c  |  %c   |   %c   %n", v[1][0].getSimbolo(), v[1][1].getSimbolo(), v[1][2].getSimbolo());
        System.out.println("--------------------");
        System.out.printf("2     %c  |  %c   |   %c   %n", v[2][0].getSimbolo(), v[2][1].getSimbolo(), v[2][2].getSimbolo());

    }

    public static void verificaVitoria(velha){
        
    }
}
