import java.util.ArrayList;
import java.util.Iterator;


public class App {
    public static void main(String[] args) {
        ArrayList<String> carros = new ArrayList<>();

        //só adiciona fusca uma vez
        carros.add("Fusca");
        carros.add("Chevette");
        carros.add("Fiat 147");
        carros.add("Variant");
        carros.add("Charger");

        System.out.println(carros);

        Iterator<String> it = carros.iterator();
        
        while(it.hasNext()){
            String c = it.next();
            System.out.println(c);
        }



    }
}
