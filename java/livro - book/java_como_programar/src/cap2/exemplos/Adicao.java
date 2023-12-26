// Figura 2.7: Addition.java
// Programa de adição que insere dois números, então exibe a soma deles

package cap2.exemplos;
import java.util.Scanner; // programa utiliza a classe Scannerpackage examples;

public class Adicao
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int numero1;
        int numero2;
        int soma;

        System.out.print("Digite o primeiro inteiro: ");
        numero1 = input.nextInt();

        System.out.print("Digite o segundo inteiro: ");
        numero2 = input.nextInt();

        soma = numero1 + numero2;

        System.out.printf("A soma é %d%n", soma);
    }
}
