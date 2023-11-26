package cap_4_orientacao_a_objetos_basica.exemplos.banco;

public class TestaAlgunsMetodos {
    public static void main(String[] args) {

        // criando conta
        Conta minhaConta;
        minhaConta = new Conta();

        // alterando valores de minhaConta
        minhaConta.titular = "Noah";
        minhaConta.saldo = 500.0;

        // saca 200 reais
        minhaConta.saca(200.0);

        // deposita 500 reais
        minhaConta.deposita(500.0);

        System.out.println("Saldo de " + minhaConta.titular + " é de: " + minhaConta.saldo);

        // EXEMPLO DE USO

        Conta minhaConta2;
        minhaConta2 = new Conta();

        minhaConta2.saldo = 1000.0;

        boolean consegui = minhaConta2.saca(200.0);
        if(consegui){
            System.out.println("Consegui sacar!");
        } else {
            System.out.println("Deu ruim!");
        }
    }
}
