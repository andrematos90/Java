public class App {
    public static void main(String[] args) {
       Carro carro1 = new Carro("Renault", "Twingo", 2001, 123456);

       System.out.print(carro1.marca);
       System.out.println();
       System.out.print(carro1.modelo);
         System.out.println();
       System.out.print(carro1.ano);

       //System.out.print(carro1.renavam); renavam, nao é acessível fora da classe por ser private
       
    }
}
