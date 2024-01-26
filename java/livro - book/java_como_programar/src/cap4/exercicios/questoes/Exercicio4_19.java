package cap4.exercicios.questoes;

import java.util.Scanner;

public class Exercicio4_19 {

    public static void main(String[] args) {

        Scanner input  = new Scanner(System.in);

        double totalVendido = 0;
        int contadorVendas = 0;

        System.out.println("Digite o código do item vendido: ");
        int item = input.nextInt();

        while(item != -1) {


            if (item == 1) {
                totalVendido += 239.99;
                contadorVendas++;
                System.out.println("Item vendido.");
                System.out.printf("Seu total de vendas é: %.2f", totalVendido);
            } else if (item == 2) {
                totalVendido += 129.75;
                contadorVendas++;
                System.out.println("Item vendido.");
                System.out.printf("Seu total de vendas é: %.2f", totalVendido);
            } else if (item == 3) {
                totalVendido += 99.95;
                contadorVendas++;
                System.out.println("Item vendido.");
                System.out.printf("Seu total de vendas é: %.2f", totalVendido);
            } else if (item == 4) {
                totalVendido += 350.89;
                contadorVendas++;
                System.out.println("Item vendido.");
                System.out.printf("Seu total de vendas é: %.2f", totalVendido);
            } else {
                System.out.println("O número deve ser entre 1 e 4");
            }

            System.out.println("\nDigite o código do item vendido: \n");
            item = input.nextInt();

        }

        System.out.println("\nFechamento da semana!");
        System.out.printf("Você finalizou %d vendas, tendo somatório de: R$ %.2f", contadorVendas, totalVendido);
        System.out.printf("%nSeu pagamento neste encerramento de semana é de: R$ %.2f", 0.09 * totalVendido + 200);
    }
}
