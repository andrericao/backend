// 4.4Escreva instruções Java para realizar cada uma das seguintes tarefas:

package cap4.exercicios.questoes;

public class Exercicio4_4 {


    public static void main(String[] args) {

        // Escreva instruções Java para realizar cada uma das seguintes tarefas:
        //  a) Utilize uma instrução para atribuir a soma de x e y a z,

        //  em seguida, incremente x por 1.
        int x = 0;
        int y = 0;
        int z = 0;

        int soma = x++ + y + z;

        System.out.println(soma);

        //  b) Teste se a variável contador é maior do que 10.
        //  Se for, imprima "Contador é maior que 10".

        int contador = 0;

        for(int i = 0; i < 10; i++){
            contador++;
        }

        System.out.println(contador <= 10 ? "Contador menor ou igual que 10" : "Contador é maior que 10");
        System.out.println(contador);

        //  c) Utilize uma instrução para decrementar a variável x por 1,
        //  então subtraia-o da       variável total e armazene o resultado na variável total.

        int total = 0;
        total -= --x;

        //  d) Calcule o resto após "q" ser dividido por divisor e atribua o resultado a "q".
        //  Escreva essa instrução de duas maneiras diferentes.

        int q = 0;
        int divisor = 0;

        q = q % divisor;
        q %= divisor;
     }
}
