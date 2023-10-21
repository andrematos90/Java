import java.util.Stack;
public class App {
    public static void main(String[] args) {
        Stack<String> carros = new Stack<>();

        carros.push("gol");
        carros.push("new civic");
        carros.push("malibu");
        carros.push("twingo");
        carros.push("fusca");

        //peek() acessa o ultimo elemento da pilha
        System.out.println(carros.peek());


    }
}
