package cap6.exercicios.questoes;

// 6.9 (Arredondando números)
// Math.floor pode ser utilizado para arredondar valores ao número inteiro mais próximo — por exemplo,
// y = Math.floor(x + 0.5); arredondará o número x para o inteiro mais próximo e atribuirá o resultado a y.
// Escreva um aplicativo que lê valores double e utiliza a instrução anterior para arredondar cada um dos
// números para o inteiro mais próximo. Para cada número processado, exiba ambos os números,
// o original e o arredondado.


import java.util.Scanner;

public class Exercicio6_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um valor para ser arredondado");
        double x = input.nextDouble();
        double y = Math.floor((x + 0.5));
        System.out.printf("O valor de X é %.2f e o de Y é %.2f%n", x, y);

        while(x >= 0.0){

            System.out.println("Digite um valor para ser arredondado");
            x = input.nextDouble();
            y += Math.floor((x + 0.5));
            System.out.printf("O valor de X é %.2f e o de Y é %.2f%n", x, y);
        }

        System.out.printf("O valor de X é %.2f e o de Y é %.2f%n", x, y);
    }
}
