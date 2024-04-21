package cap6.exercicios.questoes;

// 6.10 (Arredondando números) Para arredondar números em casas decimais específicas,
// utilize uma instrução como
// -> y = Math.floor(x * 10 + 0.5) / 10;
// que arredonda x para a casa decimal (isto é, a primeira posição à direita do ponto de fração decimal), ou
// -> y = Math.floor(x * 100 + 0.5) / 100;
// que arredonda x para a casa centesimal (isto é, a segunda posição à direita do ponto de fração decimal).
// Escreva um aplicativo que defina quatro métodos para arredondar um número x de várias maneiras:

// a) roundToInteger(number)
// b) roundToTenths(number)
// c) roundToHundredths(number)
// d) roundToThousandths(number)

// Para cada leitura de valor, seu programa deve exibir o valor original, o número arredondado
// para o inteiro mais próximo, o número arredondado para o décimo mais próximo, o número arredondado
// para o centésimo mais próximo e o número arredondado para o milésimo mais próximo.

import java.util.Scanner;

public class Exercicio6_10 {

    public static void arredondarParaInteiros(int numero){
        double y = Math.floor(numero * 10 + 0.5) / 10;
        System.out.printf("O valor arredondado para inteiro é %.0f%n", y);
    }

    public static void arredondarParaDecimais(int numero){
        double y = Math.floor(numero * 10 + 0.5) / 100;
        System.out.println("O valor arredondado para decimal é " + y);
    }

    public static void arredondarParaCentesimos(int numero){
        double y = Math.floor(numero * 10 + 0.5) / 1_000;
        System.out.println("O valor arredondado para centésimo é " + y);
    }

    public static void arredondarParaMilesimos(int numero){
        double y = Math.floor(numero * 10 + 0.5) / 10_000;
        System.out.println("O valor arredondado para milésimo é " + y);
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite um valor para ser arredondado: ");
        int numero = input.nextInt();

        Exercicio6_10.arredondarParaInteiros(numero);
        Exercicio6_10.arredondarParaDecimais(numero);
        Exercicio6_10.arredondarParaCentesimos(numero);
        Exercicio6_10.arredondarParaMilesimos(numero);

    }
}
