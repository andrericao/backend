package cap4.exercicios;

import java.util.Scanner;

// 4.23 (Encontre os dois números maiores) Utilizando uma abordagem semelhante àquela do Exercício 4.21,
// encontre os dois maiores valores entre os 10 valores inseridos.
// [Observação: você só pode inserir cada número uma vez.]
public class Exercicio4_23 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int segundoMaior = 0;
        int maiorNumero = 0;

        for (int i = 0; i < 10; i++){

            System.out.printf("Digite o %d° número: %n", i + 1);
            int numero = input.nextInt();

            if(numero > maiorNumero){
                maiorNumero = numero;
            }

            if(numero > segundoMaior && numero < maiorNumero){
                segundoMaior = numero;
            }

        }

        System.out.printf("O maior número é: %d%n", maiorNumero);
        System.out.printf("O segundo maior número é: %d", segundoMaior);
    }
}
