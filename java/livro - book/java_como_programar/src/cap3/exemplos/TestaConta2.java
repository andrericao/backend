package cap3.exemplos;

import java.util.Scanner;

public class TestaConta2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Conta minhaConta1 = new Conta("Noah Paulo", 50.00);
        Conta minhaConta2 = new Conta("Nathália Paulo", -7.53);

        System.out.printf("%s saldo: $%.2f %n", minhaConta1.getNome(), minhaConta1.getSaldo());
        System.out.printf("%s saldo: $%.2f %n%n", minhaConta2.getNome(), minhaConta2.getSaldo());
    }
}
