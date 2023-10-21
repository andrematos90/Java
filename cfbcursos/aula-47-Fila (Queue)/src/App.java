import java.util.LinkedList;
import java.util.Queue;
public class App {
    public static void main(String[] args) {
        Queue<String> carros = new LinkedList<>();

        carros.add("gol");
        carros.add("new civic");
        carros.add("malibu");
        carros.add("twingo");
        carros.add("fusca");

        //peek() Retorna o elemento na frente da fila sem removê-lo. Se a fila estiver vazia, retorna null.
        System.out.println(carros.peek());


    }
}
