
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


public class App {
    public static void main(String[] args){
      
       Path arquivo = Paths.get("C:/Users/andre/Downloads/passos.txt/");

       if(Files.exists(arquivo)){
        try{
            List<String> linhas = Files.readAllLines(arquivo);

            /*usando for tradicional para imprimir as linhas
            
             
            for(String linha:linhas){
                System.out.println(linha);
            }*/

            //usando foreach para ler 
            linhas.forEach(linha -> System.out.println(linha));
                      
        }catch(Exception e){
            System.out.println("Erro ao ler o arquivo!");
        }finally{
            System.out.println("Fim da leitura!");
        }
       
       }else{
        System.out.println("nao é um arquivo");
       }

    }
}
