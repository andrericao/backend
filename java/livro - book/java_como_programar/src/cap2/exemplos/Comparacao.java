// Figura 2.15: Comparison.java
// Compara inteiros utilizando instruções if, operadores relacionais
// e operadores de igualdade.
package cap2.exemplos;

import java.util.Scanner;

public class Comparacao
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int numero1;
        int numero2;

        System.out.print("Enter first number: ");
        numero1 = input.nextInt();

        System.out.print("Enter second number: ");
        numero2 = input.nextInt();

        if(numero1 == numero2)
            System.out.printf("%d == %d%n", numero1, numero2);

        if (numero1 != numero2)
            System.out.printf("%d != %d%n", numero1, numero2);

        if (numero1 < numero2)
            System.out.printf("%d < %d%n", numero1, numero2);

        if (numero1 > numero2)
            System.out.printf("%d > %d%n", numero1, numero2);

        if (numero1 <= numero2)
            System.out.printf("%d <= %d%n", numero1, numero2);

        if (numero1 >= numero2)
            System.out.printf("%d >= %d%n", numero1, numero2);
    }
}
