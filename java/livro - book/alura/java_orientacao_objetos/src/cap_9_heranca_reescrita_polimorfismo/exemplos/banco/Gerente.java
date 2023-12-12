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
    @Override
    public double getBonificacao(){
        /*
        todo: -> return this.salario * .10 + 1000; <-
         neste caso sempre que mudasse teríamos que mudar aqui tb
         sendo assim usaremos a super classe
         invocando o método como está na classe mãe
        */
        return super.getBonificacao() + 1000;
    }

    public void setSenha(int senha){
        this.senha = senha;
    }
}
