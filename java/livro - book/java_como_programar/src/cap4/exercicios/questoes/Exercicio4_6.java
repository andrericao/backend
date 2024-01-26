// 4.6 Combine as instruções escritas no Exercício 4.5 em um aplicativo
// Java que calcula e imprime a soma dos inteiros de 1 a 10.
// Utilize a instrução while para fazer loop pelas instruções de cálculo e
// incremento. O loop deve terminar quando o valor de x tornar-se 11.

package cap4.exercicios.questoes;

public class Exercicio4_6 {

    public static void main(String[] args) {

        int sum = 0;
        int x = 0;


        while(x < 10) {
            ++x;
            sum += x;
            System.out.printf("A soma é: %d%n", sum);
        }
    }
}
