public class App {
    public static void main(String[] args) {
        int soma = 0;
        if(args.length <= 0){
            System.out.print("sem argumentos!");
            return;
        };


        for(String i:args){
                int v = Integer.valueOf(i);
                soma+=v;
        }      
            
     System.out.printf("%d", soma);
    }
}
