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

        System.out.println("Digite um valor decimal: ");
        double x = input.nextDouble();

        while(x > 0.0){

            System.out.printf("Valor de X %.2f | valor de X tratado %.2f%n", x, Math.floor(x));

            System.out.println("Digite outro valor decimal: ");
            x = input.nextDouble();
        }

        System.out.printf("%s", "Fim do Programa!");
    }
}
