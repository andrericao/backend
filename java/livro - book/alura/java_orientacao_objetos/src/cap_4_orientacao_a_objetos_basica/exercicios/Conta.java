package cap_4_orientacao_a_objetos_basica.exercicios;
/*
2 -Transforme o modelo do exercício 1 em uma classe Java. Teste-a usando uma outra classe que tenha o main. Você deve criar a classe da conta com o nome Conta, mas pode nomear como quiser a classe de testes, por exemplo, pode chamá-la TestaConta. Contudo, ela deve necessariamente ter o método main.

A classe Conta deve conter, além dos atributos mencionados anteriormente, pelo menos os seguintes métodos:

saca que recebe um valor como parâmetro e o retira do saldo da conta;
deposita que recebe um valor como parâmetro e o adiciona ao saldo da conta;
calculaRendimento que não recebe parâmetro algum e devolve o valor do saldo multiplicado por 0.1.
Lembre-se de seguir a convenção Java, isso é importantíssimo. Preste atenção nas maiúsculas e minúsculas, seguindo o seguinte exemplo: nomeDeAtributo, nomeDeMetodo, nomeDeVariavel, NomeDeClasse, etc.
*/

/*
3 - Na classe Conta, crie um método recuperaDadosParaImpressao() que não recebe parâmetro, mas devolve o texto com todas as informações da nossa conta para efetuarmos a impressão.
*/

// =================== EXERCICO 2 ====================
public class Conta {

    String titular;
    int numeroConta;
    String agencia;
    double saldo;
    DataDeAbertura dataAbertura;

    void saca(double valor){
        if(this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque efetuado com sucesso. " +
                    "\nSaldo atual: R$ " + this.saldo);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    void deposita(double valor){
        if(valor > 0) {
            this.saldo += valor;
            System.out.println("Deposito realizado com sucesso! " +
                    "\nSaldo atual R$: " + saldo);
        } else {
            System.out.println("Valor deve ser maior que R$ 0,00");
        }
    }

    void calculaRendimento(){
        System.out.println("Saldo atual: R$ " + this.saldo);
        this.saldo *= 0.1;
        System.out.println("Valor de rendimentos: R$ " + this.saldo);
    }
// =================== EXERCICO 3 ====================
    void recuperaDadosParaImpressao(){
        System.out.println("Nome titular: " + this.titular);
        System.out.println("Número da conta: " + this.numeroConta);
        System.out.println("Agência: " + this.agencia);
        System.out.println("Saldo: RS " + this.saldo);
        System.out.println("Conta criada em: " + this.dataAbertura.dia + "/" + this.dataAbertura.mes + "/" + this.dataAbertura.ano);
    }
}
