package cap4.exercicios;

import java.util.Scanner;

// 4.30 (Palíndromos) Um palíndromo é uma sequência de caracteres que é lida da
// esquerda para a direita ou da direita para a esquerda. Por exemplo,
// cada um dos seguintes inteiros de cinco dígitos é um palíndromo: 12321,
// 55555, 45554 e 11611. Escreva um aplicativo que lê em um inteiro de
// cinco dígitos e determina se ele é ou não um palíndromo. Se o número
// não for de cinco dígitos, exiba uma mensagem de erro e permita que
// o usuário insira um novo valor.
public class Exercicio4_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Favor digite um número de 5 dígitos: ");
        int numero = input.nextInt();
        int inversor = 0;
        int aux = numero;

        if(numero < 10_000){
            System.out.println("O número deve conter 5 dígitos");

        } else {

            while (aux > 0) {
                inversor = inversor * 10 + aux % 10; // sempre adiciona unidade do número ao inversor
                System.out.println("inversor: " + inversor);
                aux /= 10; // remove a unidade do número
                System.out.println("aux: " + aux);
            }

            if (numero == inversor) {
                System.out.println("É Palindromo");
            } else {
                System.out.println("Não é Palindromo");
            }
        }




    }
}
