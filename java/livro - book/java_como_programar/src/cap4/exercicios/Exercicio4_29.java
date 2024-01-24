package cap4.exercicios;

import java.util.Scanner;

// 4.29 (Quadrado de asteriscos) Escreva um aplicativo que solicita ao usuário que
// insira o tamanho do lado de um quadrado e, então, exibe um
// quadrado vazio desse tamanho com asteriscos. Seu programa deve trabalhar
// com quadrados de todos os comprimentos de lado possíveis entre 1 e 20.
public class Exercicio4_29 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Insira o tamado do quadrado: ");
        int tamanhaQuadrado = input.nextInt();
        int contador = 0;

        System.out.println("* ".repeat(tamanhaQuadrado));
        while(contador < tamanhaQuadrado - 2){
            System.out.println("* " + "  ".repeat(tamanhaQuadrado -2) + "*");
            contador++;
        }
        System.out.print("* ".repeat(tamanhaQuadrado));
    }
}
