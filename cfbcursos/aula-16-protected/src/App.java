public class App {
    public static void main(String[] args) throws Exception {
        
        Aviao aviao1 = new Aviao("Tucano", "Embraer", "Caca");

       
         //int aut = aviao1.autonomia; ocasiona erro por ser protected
        int aut = aviao1.getAutonomia(); 
        System.out.printf("autonomia: %d", aut);
    } 
}
