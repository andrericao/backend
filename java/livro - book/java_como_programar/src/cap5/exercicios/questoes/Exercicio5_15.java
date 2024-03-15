package cap5.exercicios.questoes;

// 5.15(Programa para impressão de triângulos) Escreva um aplicativo que exibe os
// seguintes padrões separadamente, um embaixo do outro. Utilize loops for para gerar os padrões.
// Todos os asteriscos (*) devem ser impressos por uma única instrução na forma System.out.print('*');
// o que faz com que os asteriscos sejam impressos lado a lado. Uma instrução na forma System.out.println();
// pode ser utilizada para mover-se para a próxima linha. Uma instrução na forma System.out.print(' ');
// pode ser utilizada para exibir um espaço para os últimos dois padrões. Não deve haver outras instruções
// de saída no programa.
// [Dica: os dois últimos padrões requerem que cada linha inicie com um número adequado de espaços em branco.]


import java.util.Scanner;

public class Exercicio5_15 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor para base do triângulo: ");
        int qtdAsteriscos = input.nextInt();

        // a)
        // *
        // **
        // ***
        // ****
        // *****
        // ******
        // *******
        // ********
        // *********
        // **********

        System.out.println("a)");
        for(int i = 1; i <= qtdAsteriscos; i++){
            System.out.print("*".repeat(i));
            System.out.println();
        }

        System.out.println();
        System.out.println("-".repeat(40));
        System.out.println();

        // b)
        // **********
        // *********
        // ********
        // *******
        // ******
        // *****
        // ****
        // ***
        // **
        // *

        System.out.println("b)");
        for(int i = qtdAsteriscos; i >= 1; i--){
            System.out.print("*".repeat(i));
            System.out.println();
        }

        System.out.println();
        System.out.println("-".repeat(40));
        System.out.println();

        // c)
        // **********
        //  *********
        //   ********
        //    *******
        //     ******
        //      *****
        //       ****
        //        ***
        //         **
        //          *

        System.out.println("c)");

        for(int i = qtdAsteriscos; i >= 1; i--){
            System.out.print(" ".repeat(qtdAsteriscos - i) + "*".repeat(i));
            System.out.printf("%n");
        }

        System.out.println();
        System.out.println("-".repeat(40));
        System.out.println();

        System.out.println("d)");
        for(int i = 1; i <= qtdAsteriscos; i++){
            System.out.print(" ".repeat(qtdAsteriscos - i) + "*".repeat(i));
            System.out.printf("%n");
        }

        // d)
        //          *
        //         **
        //        ***
        //       ****
        //      *****
        //     ******
        //    *******
        //   ********
        //  *********
        // **********
    }
}
