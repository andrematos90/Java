public class App {
    public static void main(String[] args) {


        String s1 = new String("Simba");
        String s2 = "Simba";
        String s3 = "Simba";
        String minusculo = "simba";
        String s4 =  "curso";
        String s5 = "curso de java";

        //entra no else pqsão objetos diferentes, mesmo que seus conteúdos sejam os mesmos 
        if(s1 == s2){
            System.out.printf("Sao iguais!");
        }else{
            System.out . print("Nao sao iguais!");
        }

         //entra no if pra são obejtos iguais
        if(s2 == s3){
            System.out.print("Sao iguais!");
        }else{
            System.out . print("Nao sao iguais!");
        }

        //utilizando o método equals compara os valores, retorna que sao iguais
         if(s1.equals(s2) ){
            System.out.printf("Sao iguais!");
        }else{
            System.out . print("Nao sao iguais!");
        }

        //métodos equalsIgnoreCase não distingue entre maiscula e minuscula

         if(s1.equalsIgnoreCase(minusculo) ){
            System.out.printf("Sao iguais!");
        }else{
            System.out . print("Nao sao iguais!");
        }

        /*compareTo compara duas strings e retorna 0 se forem iguais,
        se aprimeira for maior retorna 1, se for menor -1
        */
            System.out.printf("Retorno: %d%n", s1.compareTo(s3));

         /*regionMatches compara parte da string */
         if(s4.regionMatches(true, 0, s5, 0, 4)){
            System.out.printf("Sao iguais!");
        }else{
            System.out . print("Nao sao iguais!");
        }


       
    }
}
