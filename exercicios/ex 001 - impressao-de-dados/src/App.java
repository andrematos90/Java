/*Crie um programa em Java que imprima no console as seguintes informações:

Seu nome completo.
Sua idade.
Uma mensagem de saudação personalizada.
Utilize a instrução System.out.println() para exibir cada informação em uma nova linha.

Execute o programa e verifique se a saída no console está correta.

Experimente utilizar a instrução System.out.print() para imprimir as informações sem pular para uma nova linha.

Desafio (opcional): Crie uma formatação mais elaborada para a saída, utilizando caracteres especiais e espaços para melhorar a apresentação das informações no console.

Observações:

Certifique-se de que seu código está bem comentado, explicando cada parte relevante.
Caso surjam dúvidas, consulte a documentação oficial do Java para obter mais informações sobre a impressão de dados no console.
Dica:
Não se esqueça de utilizar corretamente os operadores de concatenação e as aspas para incluir strings no código.

 */


public class App {
    public static void main(String[] args) throws Exception {
        
        
        int idade = 33;
        String nome = "Andre";
        String sobrenome = "Matos";

        System.out.printf("Olá %s %s, você tem %d anos, certo?" , nome, sobrenome, idade);

    



    }
}
