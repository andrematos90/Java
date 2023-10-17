public class App {
    public static void main(String[] args) {

       Carro carro1 = new Carro("Chevrolet", "Malibu", "DF2115-515SDF-15FGFDS");
       Carro carro2 = new Carro("Honda", "New Civic", "54515-SDH4234-12AF456");
       Carro carro3 = new Carro("Ford", "Fusion", "EFG1IJ-4F35DF-HUDH1");
       Carro carro4 = new Carro("Citroen", "C5", "4ADAW6-596DW-56WDF54");

       
       Carro[] carros = new Carro[4];

       carros[0] = carro1;
       carros[1] = carro2;
       carros[2] = carro3;
       carros[3] = carro4;

       for(Carro item:carros){
           item.info();
       }
       
      
    }
        
}
