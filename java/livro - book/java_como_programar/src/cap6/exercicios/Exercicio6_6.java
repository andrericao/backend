package cap6.exercicios;

import java.util.Scanner;

public class Exercicio6_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o raio do círculo: ");
        double raio = input.nextDouble();

        System.out.printf("O volume é: %f%n: ", volumeEsfera(raio));

    }

    public static double volumeEsfera(double raio) {
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
        return volume;
    }
}
