package cap_4_orientacao_a_objetos_basica.exemplos.banco;

// Ao instaciar um objeto, a variável faz apenas refe^rencia a este
// não por isso o nome da classe se repete: "Conta" contaTeste = new Conta;
// o tipo da varável diz que essa tipagem da variável é para garantir
// que elas faz uma referência a um objeto desta tipagem, no caso "CONTA"

public class TestaReferencia {

    public static void main(String[] args) {

        Conta c1 = new Conta();
        c1.deposita(100.0);

        Conta c2 = c1; // linha importante

        System.out.println(c1.saldo);
        System.out.println(c2.saldo);

        // FOI DADO APENAS UM (1) NEW, SÓ PPODE EXISTIR UM OBJETO
        // NESTE CASO AS DUAS VARIÁVEIS REFERENCIAM O MESMO LUGAR NA MEMÓRIA
        // OU SEJA O MESMO OBJETO

        c2.deposita(500.0); // depositamos com uma referência
        System.out.println(c1.saldo);// e conferimos o saldo atual em outra

    }
}
