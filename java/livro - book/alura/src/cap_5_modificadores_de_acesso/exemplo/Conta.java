package cap_5_modificadores_de_acesso.exemplo;

public class Conta {

    // O "static" cria um atributo que pertence a classe e não a cada objeto
    // No livro o atributo serviu para asaber a quantidade de "Contas" criadas
    // O número terá a adição de 1 unidade a cada contrutor instaciado (linha 25)
    private static int totalDeContas;
    private String titular;
    private double saldo;
    private double limite;
    private int numero;
    private DataDeAbertura dataAbertura;

    private static int identificador;

    public void setDataDeAbertura(DataDeAbertura dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public DataDeAbertura getDataDeAbertura(){
        return this.dataAbertura;
    }

    // O acesso ao construtor se dá sem a necessidade de criação de uma conta
    // primeiro declaro e com "GETTER" dou acesso  (linha 28)
    public Conta(){
        // todo contrutor deve ter este método
        Conta.totalDeContas++;
        Conta.identificador++;
    }

    public Conta(String titular){
        // todo contrutor deve ter este método
        Conta.totalDeContas++;  // USADO NOS EXEMPLOS
        Conta.identificador++;  // USADO NOS EXERCICIOS
        this.titular = titular;
    }

    public static int getTotalDeContas(){
        return Conta.totalDeContas;
    }

    public static int getIdentificador(){
        return Conta.identificador;
    }

    public double getRendimentos(){
       double rendimentos = this.saldo *= 0.1;
       return rendimentos;
    }

    public void verSaldo(){
        double saltoTotal = this.saldo + this.limite;
        System.out.println("Saldo: R$ " + saltoTotal);
    }

    public void deposita(double valor){
        if(valor > 0) {
            this.saldo += valor;
        }
    }

    public void liberarLimite(double valor){
        if(valor > 0){
            this.limite += valor;
            System.out.println("Parabéns você teve aumento no limite de Cheque Especial");
            System.out.println("Limite: R$ " + this.limite);
            this.verSaldo();
        }
    }

    public boolean saca(double valor){
        if(this.saldo < valor){
            System.out.println("Saldo insuficiente");
            return false;
        } else {
            this.saldo -= valor;
            return true;
        }
    }

    public boolean transferePara(Conta destino, double valor){

        boolean temValor = this.saca(valor);

        if(!temValor){
            return false;
        } else {
            destino.deposita(valor);
            System.out.println("Transferência efetuada com sucesso!");
            return true;
        }
    }
}
