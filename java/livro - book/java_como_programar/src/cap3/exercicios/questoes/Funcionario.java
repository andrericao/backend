package cap3.exercicios.questoes;
/*
todo: 3.13
 (Classe Employee) Crie uma classe chamada Employee que inclua três variáveis de instância —
 um primeiro nome (tipo String),
 um sobrenome (tipo String) e
 um salário mensal (double).
 Forneça um construtor que inicializa as três variáveis de instância.
 Forneça um método set e um get para cada variável de instância.
 Se o salário mensal não for positivo, não configure seu valor.
 Escreva um aplicativo de teste chamado EmployeeTest que demonstre as capacidades da classe Employee.
 Crie dois objetos Employee e exiba o salário anual de cada objeto.
 Então dê a cada Employee um aumento de 10% e exiba novamente o salário anual de cada Employee.
 */
public class Funcionario {
    private String nome;
    private String sobrenome;
    private double salarioMensal;

    public Funcionario(String nome, String sobrenome, double salarioMensal){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salarioMensal = salarioMensal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        if(salarioMensal < 0.00){
            salarioMensal = 0.00;
        } else {
            this.salarioMensal = salarioMensal;
        }
    }
}
