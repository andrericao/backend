package cap4.exercicios;

import java.util.Scanner;

// 4.32 (Padrão de tabuleiro de damas de asteriscos) Escreva um aplicativo que
// utiliza apenas as instruções de saída

//  - System.out.print("* ");
//  - System.out.print(" ");
//  - System.out.println();

// para exibir o padrão de tabuleiro de damas a seguir.
// Uma chamada de método System.out.println sem argumentos faz com que o programa
// gere saída de um único caractere de nova linha. [Dica: as instruções de repetição são requeridas.

public class Exercicio4_32 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o numero para o tamanho do tabuleiro de xadrez: ");
        int tamanhoXadrez = input.nextInt();
        int i = 0;
        int j = 0;

        while (i < tamanhoXadrez) {
            if (i % 2 == 0) {
                while (j < tamanhoXadrez) {
                    System.out.print("*  ");
                    j++;
                }
            } else {
                while(j < tamanhoXadrez) {
                    System.out.print("  *");
                    j++;
                }
            }
            System.out.println();
            j = 0;
            i++;
        }
    }
}
