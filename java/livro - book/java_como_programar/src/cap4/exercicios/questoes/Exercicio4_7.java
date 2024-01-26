// 4.7 Determine o valor das variáveis na instrução product *= x++;
// depois que o cálculo é realizado.
// Suponha que todas as variáveis sejam do tipo int e inicialmente tenham o valor 5.

package cap4.exercicios.questoes;

public class Exercicio4_7 {
    public static void main(String[] args) {

        int product = 5;
        int x = 5;

        System.out.printf("O valor é: %d", product *= x++);
        // errei, chutei 30
        // acontece que o incremento é pósfixado

    }
}
