//4.17 (Quilometragem de combustível) Os motoristas se preocupam com a quilometragem obtida
// por seus automóveis. Um motorista monitorou várias viagens registrando a quilometragem
// dirigida e a quantidade de combustível em litros utilizados para cada tanque cheio.
// Desenvolva um aplicativo Java que receba como entrada os quilômetros dirigidos
// e os litros de gasolina consumidos (ambos como inteiros) para cada viagem.
// O programa deve calcular e exibir o consumo em quilômetros/litro para cada viagem e
// imprimir a quilometragem total e a soma total de litros de combustível consumidos
// até esse ponto para todas as viagens. Todos os cálculos de média devem produzir
// resultados de ponto flutuante. Utilize classe Scanner e repetição
// controlada por sentinela para obter os dados do usuário.
package cap4.exercicios;

import java.util.Scanner;

public class Exercicio4_17 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int acumuladorLitros = 0;
        int acumuladorKMs = 0;
        int contadorViagens = 0;

        System.out.println("Digite a quantidade de quilometros OU digite -1 para sair: ");
        int quilometros = input.nextInt();



        while(quilometros != -1){

            System.out.println("Digite a quantidade de combustível consumido em litros: ");
            int litros = input.nextInt();

            acumuladorKMs += quilometros;
            acumuladorLitros += litros;
            ++contadorViagens;
            float media = (float) quilometros / litros;
            System.out.printf("%d° viagem: consumo médio - %.2fKM/L%n" +
                    "Quilometragem Total: %dKM e Consumo total de %d litros%n", contadorViagens, media, acumuladorKMs, acumuladorLitros);

            System.out.println("Digite a quantidade de quilometros OU digite -1 para sair: ");
            quilometros = input.nextInt();
        }
        System.out.println("Programa encerrado!");
        }

    }
