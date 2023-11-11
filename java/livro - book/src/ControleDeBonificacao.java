public class ControleDeBonificacao {

    private double totalDeBonificacoes;

    public void registra(Funcionario f) {
        System.out.println("Adicionando bonificação do funcionário: " + f);
        this.totalDeBonificacoes += f.getBonificacao();
    }

    public double getTotalDeBonificacoes(){
        return this.totalDeBonificacoes;
    }
}
