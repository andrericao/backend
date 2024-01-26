package cap4.exercicios.questoes;
// 4.37
// a) Escreva um aplicativo que lê um inteiro não negativo, calcula e imprime seu fatorial.
import java.util.Scanner;

public class Exercicio4_37a {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("digite um  número: ");
        int numero = input.nextInt();

        int fatorial = numero;
        int i = 1;

        while(i < numero){
            fatorial *= (numero - i);
            i++;
        }
        System.out.printf("O fatorial de %d é %d", numero, fatorial);
    }
}
