
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class App {
    public static void main(String[] args){
      
       Path arquivo = Paths.get("C/Users/andre/Documents/GitHub/Projetos-Praticos/CRUD%Java%com%Mysql%JDBC/passos.txt");


       if(Files.exists(arquivo)){
        System.out.println("é um arquivo");
       }else{
        System.out.println("nao é um arquivo");
       }

    }
}
