package cap4.exercicios.questoes;

import java.util.Scanner;

// 4.31 (Imprimindo o equivalente decimal de um número binário)
// Escreva um aplicativo que insere um número inteiro que contém somente 0s e 1s
// (isto é, um número inteiro binário) e imprime seu equivalente decimal.
// [Dica: utilize os operadores de resto e divisão para pegar os dígitos
// do número binário um de cada vez da direita para a esquerda.
// No sistema de números decimais, o dígito mais à direita tem um valor
// posicional de 1 e o próximo dígito à esquerda um valor posicional de 10,
// depois 100, depois 1.000 e assim por diante. O número decimal 234 pode ser
// interpretado como 4 * 1 + 3 * 10 + 2 * 100.
// No sistema de número binário, o dígito mais à direita tem um valor
// posicional de 1, o próximo dígito à esquerda um valor posicional de 2,
// depois 4, depois 8 e assim por diante. O equivalente decimal do binário
// 1.101 é 1 * 1 + 0 * 2 + 1 * 4 + 1 * 8 ou 1 + 0 + 4 + 8 ou 13.]
public class Exercicio4_31 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o número inteiro binário: ");
        int binario = input.nextInt();
        int n = 0;
        int decimal = 0;

        while(true){
            if (binario <= 0) {
                break;
            } else {
                int temp = binario % 10; // pega a unidade do número
                System.out.println("valor de temp: " + temp);
                decimal += temp * Math.pow(2, n); // eleva o número de acordo com a casa
                System.out.println("Valor de decimal: " + decimal);
                binario /= 10; // tira o numero elevado acima retrornando o loop com o número novo

                System.out.println("Valor binario: " + binario);
                n++;
            }

        }

        System.out.printf("O valor de decimal é: %d", decimal);
    }
}