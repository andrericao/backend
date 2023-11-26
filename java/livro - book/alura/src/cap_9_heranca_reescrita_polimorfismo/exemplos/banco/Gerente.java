package cap_9_heranca_reescrita_polimorfismo.exemplos.banco;

public class Gerente extends Funcionario{
    private int senha;
    private int numeroDeFuncionariosGerenciados;

    public boolean autentica(int senha){
        if(this.senha == senha){
            System.out.println("Acesso liberado!");
            return true;
        } else {
            System.out.println("Acesso negado!");
            return false;
        }
    }

    public void setSenha(int senha){
        this.senha = senha;
    }
}
