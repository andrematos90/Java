public class App {
    public static void main(String[] args) {
     /* 
      for usado quando se sabe a quantidade de iterações
      for(int cont = 0; cont <= 10; cont++){
        System.out.println(cont);
      }
      */

      /*
      While usado quando nao se sabe a quantidade necessária de repetições
      int cont = 0;
      while(cont < 10){
        System.out.println(cont);
        cont ++;
      }
       */

       //do while executa o código ao menos uma vez
      int cont = 11;
       do {
        System.out.println(cont);
        cont ++;
       } while (cont <= 10);
    }
}
