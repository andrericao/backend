// Figura 3.2: AccountTest.Java
// Cria e manipula um objeto Conta.
package cap3.exemplos;

import java.util.Scanner;

public class TestaConta
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        Conta minhaConta1 = new Conta("Noah Paulo", 50.00);
        Conta minhaConta2 = new Conta("Nathália Paulo", -7.53);

        System.out.printf("Primeiro nome é: %s%n%n", minhaConta1.getNome());

        System.out.println("Por favor digite o nome: ");
        String nome = input.nextLine();
        minhaConta2.setNome(nome);
        System.out.println();// GERA LINHA EM BRANCO
        System.out.printf("O nome na instância minhaConta1 é: %s%n%n", minhaConta1.getNome());

        System.out.printf("O nome na instância minhaConta2 é: %s%n%n", minhaConta2.getNome());
    }
}
