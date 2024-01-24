package cap4.exercicios;
// 4.35 (Lados de um triângulo) Escreva um aplicativo que lê três valores diferentes
// de zero inseridos pelo usuário, determina e imprime se eles
// poderiam representar os lados de um triângulo.
// OBS: Para ser um triângulo o tamanho de um dos lados não pode ser maior que a soma dos outros dois.

import java.util.Scanner;

public class Exercicio4_35 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite os lados(3) do triângulo: ");
        System.out.println("Lado 1: ");
        int lado1 = input.nextInt();
        System.out.println("Lado 2: ");
        int lado2 = input.nextInt();

        System.out.println("Lado 3: ");
        int lado3 = input.nextInt();

        if(lado1 <= lado2 + lado3 && lado2 <= lado1 + lado3 && lado3 <= lado1 + lado2){
            System.out.println("SIM, poderia ser trinagulo");
        } else {
            System.out.println("Não poderia ser triângulo!");
        }

    }
}
