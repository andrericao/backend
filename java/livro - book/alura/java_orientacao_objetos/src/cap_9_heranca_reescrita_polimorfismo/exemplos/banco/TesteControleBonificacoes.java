package cap_9_heranca_reescrita_polimorfismo.exemplos.banco;

public class TesteControleBonificacoes {

    public static void main(String[] args) {

        ControleBonificacoes controle = new ControleBonificacoes();

        Gerente funcionario1 = new Gerente();
        funcionario1.setSalario(5000.0);
        controle.registra(funcionario1);

        Funcionario funcionario2 = new Funcionario();
        funcionario2.setSalario(1000.0);
        controle.registra(funcionario2);

        System.out.println("O total de bonificações é de R$ " + controle.getTotalBonificacoes());
    }
}
