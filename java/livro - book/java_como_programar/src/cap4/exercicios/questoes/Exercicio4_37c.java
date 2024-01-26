package cap4.exercicios.questoes;
// c) Escreva um aplicativo que computa o valor de e x utilizando a fórmula a seguir.
// Permita ao usuário inserir o número de termos a calcular.

//e^x = 1 + x¹/1! + x²/2! + x³/3! + ...

import java.util.Scanner;

public class Exercicio4_37c {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = input.nextInt();

        int i = numero - 1;
        int expoenteDividendo = 0;
        int fatorialDivisor = numero;
        double somaRazao = 0; // ele já inicia com um(1) no enunciado

        while (i > 0){

            // elevo o número a "i"
            expoenteDividendo = (int) Math.pow(numero, numero - i);
            System.out.printf("Expoentes: %d ^ %d = %d%n", numero, numero - i, expoenteDividendo);

            // Faço o fatorial de baixo pra cima
            fatorialDivisor *= numero - i;
            System.out.printf("Fatorial de %d, %d° passo = %d%n", numero, numero -i, fatorialDivisor);

            somaRazao += (double) expoenteDividendo / fatorialDivisor;
            System.out.printf("Razão %d dividido por %d = %f%n", expoenteDividendo, fatorialDivisor, somaRazao);
            System.out.println("-".repeat(40));
            System.out.println();

            //decremento
            i--;
        }

        System.out.printf("Valor arredondado: %.2f", somaRazao);

    }
}
