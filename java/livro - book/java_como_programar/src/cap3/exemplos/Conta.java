// Figura 3.1: Account.java
// Classe Conta que contém uma variável de instância name
// e métodos para configurar e obter seu valor.
package cap3.exemplos;

public class Conta
{
    private String nome;

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getNome()
    {
        return nome;
    }
}
