package cap4.exercicios.questoes;
// b) Escreva um aplicativo que estima o valor da constante matemática e utilizando
// a fórmula a seguir. Permita ao usuário inserir o número
// de termos a calcular.

import java.util.Scanner;

// e = 1 + 1/1! + 1/2! + 1/3! + ...
public class Exercicio4_37b {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = input.nextInt();

        int i = 1;
        int fatorial = numero;
        double somaRazao = 1; // ele já inicia com um(1) no enunciado

        while(i < numero){

            fatorial *= (numero - i);
            somaRazao += 1.0 / fatorial;
            i++;

        }

        System.out.printf("A razão Fatorial de %d é %f", numero, somaRazao);
    }
}
