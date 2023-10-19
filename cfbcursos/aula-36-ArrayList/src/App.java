import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
       ArrayList<Integer> numeros = new ArrayList<>();
     // Classe/ t.doarray/nomedoarray/instanciação

       ArrayList<String> nomes = new ArrayList<>(20);
     //Classe/t.doarray/nomedoarray/instanciação

          
          numeros.add(10); //método add para adicionar itens no final da lista
          numeros.add(11);
          numeros.add(1,12); //indice em que sera inserido no primeiro parametro e o valor no segundo
          numeros.add(25);
          

         for(int numero:numeros){
            System.out.println(numero);
          }  

          System.out.println(numeros.get(0)); //método get retorna o elemento do indice que é passado como parametro

          nomes.add("Simba");
          System.out.println(nomes.size()); //método size retorna o tamanho do arraylist

          nomes.clear(); //limpa o arraylist

          System.out.println(numeros.indexOf(25)); // retorna o indice da primeira ocorrencia do valor passado

          numeros.remove(0); //pode se passar o elemento retorno=booleano ou o indice que será removido retorno = string

          nomes.trimToSize(); //elimina os espaços que nao estao sendo usando no arraylist , como nesse caso que é de 20 e nao esta sendo usado



        }
    
}
