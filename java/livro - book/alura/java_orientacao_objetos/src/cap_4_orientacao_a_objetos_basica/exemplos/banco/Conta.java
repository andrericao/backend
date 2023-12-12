package cap_4_orientacao_a_objetos_basica.exemplos.banco;

public class Conta {

    int numero;
    String titular;
    double saldo;

    boolean saca(double valor){

        if(this.saldo > valor) {
            this.saldo = this.saldo - valor;
            return true;
        } else {
            return false;
        }
    }

    void deposita(double quantidade){
        this.saldo += quantidade;
    }

    boolean transferePara(Conta destino, double valor) {

        boolean retirou = this.saca(valor);

        if (retirou == false) {
            // não deu pra sacar
            return false;
        } else {
            destino.deposita(valor);
            return true;
        }
    }
}
