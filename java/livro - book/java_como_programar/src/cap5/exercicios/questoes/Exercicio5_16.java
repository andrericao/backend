package cap5.exercicios.questoes;

import java.util.Scanner;

// 5.16(Gráfico de barras do programa de impressão) -> SEM ARRAY
// Uma aplicação interessante dos computadores é exibir diagramas e gráficos de barras.
// Escreva um aplicativo que leia cinco números entre 1 e 30. Para cada número que é lido,
// seu programa deve exibir o mesmo número de asteriscos adjacentes. Por exemplo, se seu
// programa lê o número 7, ele deve exibir *******. Exiba as barras dos asteriscos depois de ler
// os cinco números.

public class Exercicio5_16 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int num5 = 0;

        System.out.println("Digite um número de 1 a 30!");
        System.out.println("=".repeat(40));
        System.out.println( );
        for(int i = 1; i <= 5; i++){
            System.out.printf("Digite o %d° numero: %n", i);
            int numero = input.nextInt();
            
            if(numero >= 1 && numero <= 30){
                if(i == 1){
                    num1 = numero;
                } else if(i == 2) {
                    num2 = numero;
                } else if (i == 3){
                    num3 = numero;
                } else if (i == 4){
                    num4 = numero;
                } else if (i == 5){
                    num5 = numero;
                }
            } else {
                System.out.println("Favor digitar número válido (entre 1 e 30)!");
                i--;
            }

        }

        System.out.println();
        System.out.println("=".repeat(40));
        System.out.println();
        System.out.println("-".repeat(15) + "CÓDIGO DE BARRAS" + "-".repeat(15));
        System.out.println();
        for(int i = 1; i <= 5; i++){
            if(i == 1){
                System.out.println("*".repeat(num1));
            } else if (i == 2){
                System.out.println("*".repeat(num2));
            } else if (i == 3){
                System.out.println("*".repeat(num3));
            } else if (i == 4){
                System.out.println("*".repeat(num4));
            } else if (i == 5){
                System.out.println("*".repeat(num5));
            }
        }

    }
}