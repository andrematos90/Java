public class App {
    public static void main(String[] args){
        char[] caracteres = {'o', 'l', 'a', ' ', 'm', 'u', 'n', 'd', '0'};
        String texto_1 = ("Curso de Java");
        int tamanho;
        char caractere;
        char[] copia = new char[5];

        String s1 = new String();
        String s2= new String(texto_1);
        String s3 = new String(caracteres);
        String s4 = new String(caracteres, 0, 4);

        System.out.println(s4);

        //método length retorna o tamanho da string
        tamanho = texto_1.length();

        //método charAt  retorna o caractere da posição indicada
        caractere = texto_1.charAt(6);

        //método gerCharscopia caracteres de uma string para outra strings
        texto_1.getChars(0, 5, copia, 0);
        System.out.println(copia);

    }
}
