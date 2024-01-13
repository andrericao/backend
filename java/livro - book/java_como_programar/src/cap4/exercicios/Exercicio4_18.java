package cap4.exercicios;

import java.util.Scanner;

public class Exercicio4_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite saldo inicial: ");
        int saldo = input.nextInt();
        System.out.println("Digite credito: ");
        int credito = input.nextInt();
        System.out.println("Digite o valor do gasto: ");
        int despesa = input.nextInt();

        while(saldo >= credito || despesa != -1){

            saldo += despesa - credito;
            System.out.printf("Saldo Atualizado: R$ %d,00%n%n", saldo);

            if(credito > saldo){
                System.out.println("Limite de credito exedido!");
                despesa = -1;
            }


            System.out.println("Digite o valor do gasto: ");
            despesa = input.nextInt();

        }

        if(despesa == -1){
            System.out.println("Fim do Programa!");
        }
    }
}
