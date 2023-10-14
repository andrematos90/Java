public class Calculadora{
    public int[] numeros;
    public String operador;
    
    public void operacao(int[]numeros, String operador){
        if(operador == "+"){
            soma(numeros);
        }
    }

    public void soma(int[] numeros){
        int valorSoma = 0;
        for(int numero : numeros){
            valorSoma += numero;
        }
        System.out.printf("%d", valorSoma);
    }
}