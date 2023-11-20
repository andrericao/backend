package cap_5_modificadores_de_acesso.exemplo;

public class TestaConta1 {
    public static void main(String[] args) {

        Conta c1 = new Conta();
        System.out.println("Contas criadas: " + Conta.getTotalDeContas()); // 1

        Conta c2 = new Conta();
        System.out.println("Contas criadas: " + Conta.getTotalDeContas()); // 2

        c1.verSaldo();

        c1.deposita(200.0);
        c1.liberarLimite(50.0);

        c1.verSaldo();
        c1.transferePara(c2, 50.0);

        c2.verSaldo();
        c1.verSaldo();

        int totalContas2 = Conta.getTotalDeContas();
        System.out.println("Contas criadas: " + totalContas2); // 2


    }
}
