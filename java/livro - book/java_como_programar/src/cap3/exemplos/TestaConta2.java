package cap3.exemplos;

import java.util.Scanner;

public class TestaConta2 {

    public static void main(String[] args) {

        Conta minhaConta1 = new Conta("Noah Paulo", 50.00);
        Conta minhaConta2 = new Conta("Nathália Paulo", -7.53);

        System.out.printf("%s saldo: $%.2f %n",
                minhaConta1.getNome(),
                minhaConta1.getSaldo());

        System.out.printf("%s saldo: $%.2f %n%n",
                minhaConta2.getNome(),
                minhaConta2.getSaldo());

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor a ser depositado: ");
        double valorDeposito = input.nextDouble();
        System.out.printf("%n%sVocê receberá um deposito de R$ %.2f%n",
                minhaConta1.getNome(),
                valorDeposito);

        //deposito propriamente dito
        minhaConta1.deposita(valorDeposito);

        // exibe os saldos
        System.out.printf("%sSaldo: R$%.2f %n",
                minhaConta1.getNome(),
                minhaConta1.getSaldo());

        System.out.printf("%sSaldo: R$%.2f %n",
                minhaConta2.getNome(),
                minhaConta2.getSaldo());

        System.out.print("Digite o valor a ser depositado: ");
        valorDeposito = input.nextDouble();
        System.out.printf("%n%sVocê receberá um deposito de R$ %.2f%n",
                minhaConta2.getNome(),
                valorDeposito);

        //deposito propriamente dito
        minhaConta2.deposita(valorDeposito);

        // exibe os saldos
        System.out.printf("%sSaldo: R$%.2f %n",
                minhaConta1.getNome(),
                minhaConta1.getSaldo());

        System.out.printf("%sSaldo: R$%.2f %n",
                minhaConta2.getNome(),
                minhaConta2.getSaldo());

    }
}
