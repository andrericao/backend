package cap4.exercicios;

import java.util.Scanner;

public class Exercicio4_22 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Quantos loops?");
        int numLoops = input.nextInt();

        System.out.println("N" + " ".repeat(5) + "N*10" + " ".repeat(3) + "N*100" + " ".repeat(3) + "N*1000");
        System.out.println("-".repeat(40));
        for(int i = 1; i <= numLoops; i++){
            System.out.printf("%d" + " ".repeat(5) +   "%d" + " ".repeat(5) + "%d" + " ".repeat(5) + "%d%n", i, i *10, i *100, i * 1000);
        }
    }
}
