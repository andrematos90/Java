import java.util.Scanner;

public class JogoDaVelha {
    public static void main(String[] args){

        Campo[][] velha = new Campo[3][3];
        char simboloAtual ='X';
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
            try{
                if(verificarJogada(velha, jogar(scan, simboloAtual), simboloAtual)){
                    if(simboloAtual == 'X'){
                        simboloAtual = 'O';
                    }else{
                        simboloAtual = 'X';
                    }
                }

            }catch(Exception e){
                System.out.print("Erro!");
            }
            System.out.print("Fim do jogo");
        }


    }


    public static void desenhaJogo(Campo [][] v){
        limparTela();

        System.out.println("    0    1    2");
        System.out.printf("0     %c  |  %c   |   %c   %n", v[0][0].getSimbolo(), v[0][1].getSimbolo(), v[0][2].getSimbolo());
        System.out.println("--------------------");
        System.out.printf("1     %c  |  %c   |   %c   %n", v[1][0].getSimbolo(), v[1][1].getSimbolo(), v[1][2].getSimbolo());
        System.out.println("--------------------");
        System.out.printf("2     %c  |  %c   |   %c   %n", v[2][0].getSimbolo(), v[2][1].getSimbolo(), v[2][2].getSimbolo());

    }

    public static void limparTela(){
        for(int cont=0; cont < 200; cont++){
            System.out.println("");
        }
    }

    public static int[] jogar(Scanner scan, char sa){
        int p[] = new int[2];
        System.out.printf("%s  %c%n", "Quem joga: ",sa);
        System.out.print("Informa a linha: ");
        p[0]=scan.nextInt();
        System.out.print("Informa a coluna: ");
         p[1]=scan.nextInt();
        return p;
    }

    public boolean verificarJogada(Campo[][] velha, int p[], char simboloAtual){
        if(velha[p[0]][p[1]].getSimbolo()==' '){
            velha[p[0]][p[1]].setSimbolo(simboloAtual);
            return true;
        }else{
            return false;
        }
    }

    public static String verificaVitoria(Campo[][] velha){
        return "";
    }
}
