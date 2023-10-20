public class App {
    public static void main(String[] args) {


        String s1 = new String("Simba Rough Collie");
        String s2 = " string concatenada";
        

        //startsWith verifica se começa com a string passasda, retorno booleano
        if(s1.startsWith("im")){
            System.out.printf("Sao iguais!\n");
        }else{
            System.out . print("Nao sao iguais!\n");
        }

        //endsWith verifica se termina com a string passada, retorno booleano
        if(s1.endsWith("ba")){
            System.out.printf("Sao iguais!\n");
        }else{
            System.out . print("Nao sao iguais!\n");
        }

        //indexof localiza o caracter passado e retorna o indice
        System.out.printf("posicao do primeiro encontrado caracter: %d\n", s1.indexOf("i"));

        //procura a posição do segundo caractere 'i', começando a busca a partir da posição 2
        System.out.printf("posicao do segundo caracter: %d\n", s1.indexOf("i", 2));


        // substring copia parte da string, é passado o indice que começa a copia e que termina 
         System.out.println(s1.substring(6, 11));

         //concat concatena duas strings
         System.out.println(s1.concat(s2));
    }
    
}
