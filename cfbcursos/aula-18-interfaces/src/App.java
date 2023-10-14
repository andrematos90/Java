public class App {
    public static void main(String[] args){
        Carro twingo =  new Carro();

        twingo.anda("esta parado");
        twingo.qtCombustivel(100);
        twingo.ligar(false);

        twingo.info();
    }
}
