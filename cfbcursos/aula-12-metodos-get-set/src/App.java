public class App {
    public static void main(String[] args) {
       Carro carro1 = new Carro("Renault", "Twingo", 2001, 123456);

       System.out.print(carro1.marca);
       System.out.println();
       System.out.print(carro1.modelo);
         System.out.println();

         //usando método get para acessar o atributo "renavam"
       System.out.print(carro1.getRenavam());

        System.out.println();
        
       Carro carro2 = new Carro("volskwagen", "fusca", 1985, 00000);

       carro2.setRenavam(9999);
       System.out.println(carro2.modelo);
       System.out.println(carro2.getRenavam());

       

    }
}
