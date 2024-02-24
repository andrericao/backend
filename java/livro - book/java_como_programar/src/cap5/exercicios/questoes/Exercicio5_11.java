package cap5.exercicios.questoes;
// 5.11 (Localize o menor valor)
// Escreva um aplicativo que localiza o menor de vários números inteiros.
// Suponha que o primeiro valor lido especifica o número de valores a
// serem inseridos pelo usuário.

import java.util.Scanner;

public class Exercicio5_11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite a quantidade de valores a serem inseridos: ");
        int qtdNumeros = input.nextInt();
        int menorNumero = 1_000_000;

        for(int i = 1; i <= qtdNumeros; i++){
            System.out.printf("Digite o %d° número de %d números: ", i, qtdNumeros);
            int numero = input.nextInt();

            if(numero < menorNumero){
                menorNumero = numero;
            }
        }

        System.out.printf("O Menor número é: %d", menorNumero);

    }
}
