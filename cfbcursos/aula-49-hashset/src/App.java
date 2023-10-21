import java.util.HashSet;

public class App {
    public static void main(String[] args) {
        HashSet<String> carros = new HashSet<>();

        //só adiciona fusca uma vez
        carros.add("fusca");
        carros.add("chevette");
        carros.add("fusca");


        System.out.println(carros);


    }
}
