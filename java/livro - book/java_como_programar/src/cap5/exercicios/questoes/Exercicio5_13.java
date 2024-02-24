package cap5.exercicios.questoes;

// (Fatoriais) Fatoriais costumam ser utilizados em problemas de probabilidade.
// O fatorial de um inteiro positivo n (escrito como n! e pronunciado como
// “fatorial de n”) é igual ao produto dos números inteiros positivos de 1 a n.
// Escreva um aplicativo que calcula os fatoriais de 1 a 20.
// Utilize o tipo long. Exiba os resultados em formato tabular.
// Que dificuldade poderia impedir você de calcular o fatorial de 100?

import java.util.Scanner;

public class Exercicio5_13 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número para cálculo fatorial: ");
        long valorInicial = input.nextLong();
        long fatorialDeValor = 1;

        for (int i = 1; i <= valorInicial; i++){
            fatorialDeValor *= i ;
        }

        System.out.printf("O fatorial de %d é %,d", valorInicial, fatorialDeValor);
    }
}
