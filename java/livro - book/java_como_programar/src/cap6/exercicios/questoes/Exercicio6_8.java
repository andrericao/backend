package cap6.exercicios.questoes;

// 6.8 (Taxas de estacionamento) Um estacionamento cobra uma tarifa mínima de R$ 2,00
// para estacionar por até três horas. Um adicional de R$ 0,50 por hora não necessariamente
// inteira é cobrado após as três primeiras horas. A tarifa máxima para qualquer dado período
// de 24 horas é R$ 10,00. Suponha que nenhum carro fique estacionado por mais de 24 horas
// por vez. Escreva um aplicativo que calcule e exiba as tarifas de estacionamento para cada
// cliente que estacionou nessa garagem ontem. Você deve inserir as horas de estacionamento
// para cada cliente. O programa deve exibir a cobrança para o cliente atual e calcular e exibir
// o total dos recibos de ontem. Ele deve utilizar o método calculateCharges para determinar
// a tarifa para cada cliente.

import java.util.Scanner;

public class Exercicio6_8 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        System.out.println("Digite a quantidade de horas...");
        double horas = input.nextDouble();
        double valorAPagar =  0.0;

        if (horas > 0.0 && horas <= 3.0) {
            valorAPagar = 2.0;
            System.out.printf("O valor a ser pago é de %f$n", valorAPagar);
        } else {
            horas = ((horas - 3) * 0.5) + 2;
            // horas *= 0.5;
            // horas += 2.0;
            System.out.printf("O valor a ser pago é de %.2f%n", horas);
        }
    }
}
