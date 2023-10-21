import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        HashMap<Integer, String> carros = new HashMap<Integer, String>();

        carros.put(1, "opala");
        carros.put(2, "fuca");
        carros.put(3, "chevy 500");
        carros.put(4, "kadett");

        for(int i=0; i<carros.size()+1; i++){
            System.out.println(carros.get(i));
        }
    }
}
