public class TestaGerente {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
/*
        //podemos chamar métodos do funcionário
        g1.setNome("André Paulo");

        //e métodos de senha de gerente
        g1.setSenha(1234);

        System.out.println(g1);

        Funcionario g2 = new Gerente();
        g2.setSalario(5000.00);
        System.out.println(g2.getBonificacao());
        */

        ControleDeBonificacao controle = new ControleDeBonificacao();
        Gerente g3 = new Gerente();
        g3.setSalario(5000.00);
        controle.registra(g3);

        Funcionario f1 = new Funcionario();
        f1.setSalario(1000.00);
        controle.registra(f1);

        System.out.println(controle.getTotalDeBonificacoes());
    }
}
