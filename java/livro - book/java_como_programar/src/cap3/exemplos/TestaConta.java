// Figura 3.2: AccountTest.Java
// Cria e manipula um objeto Conta.

package cap3.exemplos;

import java.util.Scanner;

public class TestaConta
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        Conta minhaConta = new Conta();

        System.out.printf("Primeiro nome é: %s%n%n", minhaConta.getNome());

        System.out.println("Por favor digite o nome: ");
        String nome = input.nextLine();
        minhaConta.setNome(nome);
        System.out.println();// GERA LINHA EM BRANCO

        System.out.printf("Nome na instância minhaConta é: %s%n%n", minhaConta.getNome());
    }
}
