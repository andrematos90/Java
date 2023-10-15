public class App {
    public static void main(String[] args) {
        Coelho coelho = new Coelho("coelhoso");
        Cobra cobra = new Cobra("coral",false);

        cobra.atacar(coelho);
        
    }
}
