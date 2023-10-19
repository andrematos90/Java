import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<String> carros = new ArrayList<>();

        carros.add("Twingo");
        carros.add("Malibu");

        try{
            System.out.println(carros.get(3));
    }catch(Exception e){
        System.out.printf("Indice passado é maior do que o tamanho do ArrayList%n", e);
    }finally{
         System.out.println("Finally é executado com erro ou não");
    }
}
}