package cap_9_heranca_reescrita_polimorfismo.exemplos.banco;

public class ControleBonificacoes {

    private double totalBonificacoes = 0;

    public void registra(Funcionario f){
        System.out.println("Adicionando bonificação do funcionário " + f);
        this.totalBonificacoes += f.getBonificacao();
    }

    public double getTotalBonificacoes(){
        return this.totalBonificacoes;
    }
}
