package cap_9_heranca_reescrita_polimorfismo.exemplos.banco;

public class testaGerente {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();

        // podemos chamar métodos de Funcionario:
        gerente.setNome("André");

        // e também método de gerente
        gerente.setSenha(1234);
    }
}
