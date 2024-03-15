package cap5.exercicios.questoes;

// 5.17(Calculando vendas)
// Um varejista on-line vende cinco produtos cujos preços no varejo são como a seguir:
// produto 1, US$ 2,98; produto 2, US$ 4,50; produto 3, US$ 9,98; produto 4, US$ 4,49 e produto 5, US$ 6,87.
// Escreva um aplicativo que leia uma série de pares de números como segue:
//      a) número de produto
//      b) quantidade vendida

import java.util.Scanner;

// Seu programa deve utilizar uma instrução switch para determinar o preço de varejo de cada produto.
// Você deve calcular e exibir o valor de varejo total de todos os produtos vendidos. Utilize um loop
// controlado por sentinela para determinar quando o programa deve parar o loop e exibir os resultados finais.
public class Exercicio5_17 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o produto que deseja de 1 a 5: ");
        System.out.println("Produto 1: R$2.98");
        System.out.println("Produto 2: R$4.50");
        System.out.println("Produto 3: R$9.98");
        System.out.println("Produto 4: R$4.49");
        System.out.println("Produto 5: R$6.87");
        System.out.println("Digite 0 (zero) para sair");
        int produto = input.nextInt();
        System.out.println();
        System.out.println("Agora digite a quantidade: ");
        double quantidade = input.nextDouble();
        double totalApagar = 0;
        int contador = 0;

        do {

            if (produto >= 1 && produto <= 5) {
                if (produto == 1) {
                    totalApagar += quantidade * 2.98;
                } else if (produto == 2) {
                    totalApagar += quantidade * 4.50;
                } else if (produto == 3) {
                    totalApagar += quantidade * 9.98;
                } else if (produto == 4) {
                    totalApagar += quantidade * 4.49;
                } else {
                    totalApagar += quantidade * 6.87;
                }
                System.out.printf("Adicionado valor de %.2f%n", totalApagar);
                contador++;
            } else {
                System.out.println("Valor Incorreto!");
                break;
            }

            System.out.println("Digite o produto que deseja de 1 a 5: ");
            System.out.println("-".repeat(40));
            System.out.println("Produto 1: R$2.98");
            System.out.println("Produto 2: R$4.50");
            System.out.println("Produto 3: R$9.98");
            System.out.println("Produto 4: R$4.49");
            System.out.println("Produto 5: R$6.87");
            System.out.println("Digite 0 (zero) para sair");
            produto = input.nextInt();

            System.out.println("Agora digite a quantidade: ");
            quantidade = input.nextInt();

        } while (produto > 0 && produto <= 5);

        if(contador >= 1) {
            System.out.printf("O total a ser pago é de R$ %.2f%n", totalApagar);
            System.out.println("Programa encerrado!");
        } else {
            System.out.println("Encerrando... \nNão houve compra efetuada!");
        }
    }
}