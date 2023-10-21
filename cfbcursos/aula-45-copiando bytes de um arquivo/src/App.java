import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {
    public static void main(String[] args) throws IOException{
        Path foto1 = Paths.get("C:/Users/andre/Downloads/collie1.jpg");
        Path foto2 = Paths.get("C:/Users/andre/Downloads/collie2.jpg");

        byte[] bytefoto = Files.readAllBytes(foto2);
        Files.write(foto1, bytefoto);


    }
}

/*nesse exemplo foi usado  "throws IOException" para nao ocorrer erro na execução
na aula44 foi usado try catch para o mesmo fim.
 */
