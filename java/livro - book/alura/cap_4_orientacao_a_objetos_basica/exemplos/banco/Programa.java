package cap_4_orientacao_a_objetos_basica.exemplos.banco;

public class Programa {
    public static void main(String[] args) {

        Conta minhaConta;
        minhaConta = new Conta();

        minhaConta.titular = "André";
        minhaConta.saldo = 1000.0;

        System.out.println("Saldo atual: " + minhaConta.saldo);
    }
}
