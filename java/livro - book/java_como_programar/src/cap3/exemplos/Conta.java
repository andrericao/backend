// Figura 3.1: Account.java
// Classe Conta que contém uma variável de instância name
// e métodos para configurar e obter seu valor.
package cap3.exemplos;

public class Conta {
    private String nome;
    private double saldo;

    public Conta(String nome, double saldo) {
        this.nome = nome;
        if(saldo > 0.0){
            this.saldo = saldo;
        }
    }

    public void deposito(double valorDeposito){
        if(valorDeposito > 0.0){
            saldo = saldo + valorDeposito;
        }
    }

    public double getSaldo(){
        return saldo;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
}
