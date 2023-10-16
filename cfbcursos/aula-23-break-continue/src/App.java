public class App {
    public static void main(String[] args) {
        int numero = 100;
        for(int i=0; i < numero; i++){
            if(i %2 != 0){
                continue;
            }
            System.out.println(i);
        }
    }
}
