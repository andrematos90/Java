public class App {
    public static void main(String[] args) {
       String nome = " Simba ";
       String raca = "Collie";
       String texto = "ipsum,lorem,lodsdso";

       /*método replace  permite substituir todas as ocorrências de uma sequência de caracteres (substring) por outra sequência dentro de uma string*/
       System.out.println(raca.replace('l', 'd'));

       //toLowerCase() converte tudo para minuscula
       System.out.println(raca.toLowerCase());

       //toUpperCase() converte tudo para maiuscula
       System.out.println(raca.toUpperCase());

       //trim() remove os espaços do inicio e do fim
       System.out.println(nome.trim());

       //toCharArray(), converte a string em um array de caracteres
       char[] c = nome.toCharArray();
       System.out.println(c[3]);

       //split(),divide uma string em substrings com base em um delimitador específico

       String[] s = texto.split(",");
       for(String item:s){
        System.out.println(item);
       }
    }
}
