package cap3.exercicios.questoes;

import cap3.exemplos.Conta;

import java.util.Scanner;

public class ModificacaoTestaConta2DeExemplos {

    public static void main(String[] args) {

        Conta minhaConta1 = new Conta("Noah Paulo", 50.00);
        Conta minhaConta2 = new Conta("Nathália Paulo", -7.53);

        // exibir saldos
        /*
        System.out.printf("Olá %s, seu Saldo é de R$%.2f %n",
                minhaConta1.getNome(),
                minhaConta1.getSaldo());

         */
        // substituição do código acima
        mostrarSaldo(minhaConta1);
        mostrarSaldo(minhaConta2);

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor a ser depositado: ");
        double valorDeposito = input.nextDouble();
        System.out.printf("%n%sVocê receberá um deposito de R$ %.2f%n",
                minhaConta1.getNome(),
                valorDeposito);

        //deposito propriamente dito
        minhaConta1.deposita(valorDeposito);

        // exibe os saldos
       mostrarSaldo(minhaConta1);
       mostrarSaldo(minhaConta2);

        System.out.print("Digite o valor a ser depositado: ");
        valorDeposito = input.nextDouble();
        System.out.printf("%n%sVocê receberá um deposito de R$ %.2f%n",
                minhaConta2.getNome(),
                valorDeposito);

        //deposito propriamente dito
        minhaConta2.deposita(valorDeposito);

        // exibe os saldos
        mostrarSaldo(minhaConta1);
        mostrarSaldo(minhaConta2);

    }

    public static void mostrarSaldo(Conta conta){
        System.out.printf("Olá %s, seu Saldo é de R$%.2f %n",
                conta.getNome(),
                conta.getSaldo());
    }
}
