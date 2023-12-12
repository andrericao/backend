package cap_5_modificadores_de_acesso.exercicio;

import cap_5_modificadores_de_acesso.exemplo.Conta;
import cap_5_modificadores_de_acesso.exemplo.DataDeAbertura;

public class TestaConta {
    public static void main(String[] args) {

        Conta c1 = new Conta();
        Conta c2 = new Conta("André");

        System.out.println("Contas criadas: " + Conta.getTotalDeContas()); // 2

        // c1.saldo = 100.0; -> NÃO COMPILA
        c1.deposita(100);

        c1.setDataDeAbertura(new DataDeAbertura(20, 11, 2023));

        System.out.println(c1.getDataDeAbertura().getDataFormatada());

        System.out.println("Rendimentos: " + c1.getRendimentos());

        System.out.println("Número identificador de c1: " + c1.getIdentificador());
        System.out.println("Número identificador de c2: " + c2.getIdentificador());
    }
}
