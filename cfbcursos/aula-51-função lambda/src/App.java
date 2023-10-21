import java.util.function.Predicate;

public class App {
    public static void main(String[] args) {
        // Criando uma função lambda para verificar se um número é par
        Predicate<Integer> ehPar = (numero) -> numero % 2 == 0;

        // Verificando se um número é par
        System.out.println(ehPar.test(4));  // Deve retornar true
        System.out.println(ehPar.test(7));  // Deve retornar false
    }
}
