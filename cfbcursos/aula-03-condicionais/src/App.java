
public class App {
    public static void main(String[] args)  {
        double valorCarro = 5.500;
        boolean bomEstado = false;
        boolean recuperavel = false;

        if(valorCarro <= 4000 && bomEstado){
            System.out.println("Pode comprar!");
        }
        else if(valorCarro <= 4000 && bomEstado || recuperavel){
            System.out.println("Pode comprar da para recuperar!");
        }else{
            System.out.println("Não compra!");
        }

        int nota = 8;
        String res = nota >=7 ? "Aprovado" : "Reprovado";
        System.out.println(res);


        int dia = 2;

        switch (dia){
            case 1: 
            System.out.println("Domingo");
            break;

            case 2: 
            System.out.println("Segunda");
            break;

            case 3:
            System.out.println("Terça");
            break;

            case 4:
            System.out.println("Quarta");
            break;

            case 5:
            System.out.println("Quinta");
            break;

            case 6:
            System.out.println("Sexta");
            break;

            case 7:
            System.out.println("Sábado");
            break;

            default:
            System.out.println("Dia inválido");
            break;
        }
        
    }
}