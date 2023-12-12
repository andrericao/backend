package cap_9_heranca_reescrita_polimorfismo.exemplos.banco;

public class ControleBonificacoes {

    private double totalBonificacoes = 0;

    public void registra(Funcionario funcionario){
        this.totalBonificacoes += funcionario.getBonificacao();
    }

    public double getTotalBonificacoes(){
        return this.totalBonificacoes;
    }
}
