package cap3.exercicios.fazendoADiferenca;
/*
    todo: 3
     3.16(Calculadora de frequência cardíaca alvo)
     Ao fazer exercícios físicos, você pode utilizar um monitor de frequência cardíaca para ver se sua frequência permanece dentro de um intervalo seguro sugerido pelos seus treinadores e médicos. Segundo a American Heart Association (AHA) (www.americanheart.org/presenter.jhtml?identifier=4736), a fórmula para calcular a frequência cardíaca máxima por minuto é 220 menos a idade em anos. Sua frequência cardíaca alvo é um intervalo entre 50-85% da sua frequência cardíaca máxima. [Observação: essas fórmulas são estimativas fornecidas pela AHA. As frequências cardíacas máximas e alvo podem variar com base na saúde, capacidade física e sexo da pessoa. Sempre consulte um médico ou profissional de saúde qualificado antes de começar ou modificar um programa de exercícios físicos.]
     Crie uma classe chamada HeartRates. Os atributos da classe devem incluir
     - o nome,
     - sobrenome e
     - data de nascimento da pessoa (consistindo em atributos separados para mês, dia e ano de nascimento).
     - Sua classe deve ter um construtor que receba esses dados como parâmetros.
     - Para cada atributo forneça métodos set e get.
     - A classe também deve incluir um método que calcule e retorne a idade (em anos),
     um que calcule e retorne a frequência cardíaca máxima e um que calcule e retorne a frequência cardíaca alvo da pessoa.
     Escreva um aplicativo Java que solicite as informações da pessoa, instancie um objeto da classe HeartRates e imprima as informações a partir desse objeto — incluindo nome, sobrenome e data de nascimento da pessoa — calcule e imprima a idade da pessoa (em anos), seu intervalo de frequência cardíaca máxima e sua frequência cardíaca alvo.
 */
public class FrequenciaCardiaca {
    private String nome;
    private String sobrenome;
    private int dia;
    private int mes;
    private int ano;

    public FrequenciaCardiaca(String nome, String sobrenome, int dia, int mes, int ano){
        this.nome = nome;
        this.sobrenome = sobrenome;

        if(dia > 31 || dia < 1){
            System.out.println("Favor inserir dia válido");
        } else {
            this.dia = dia;
        }

        if(mes > 12 || mes < 1){
            System.out.println("Favor inserir mês válido");
        } else {
            this.mes = mes;
        }
        if(ano > 2024){
            System.out.println("O ano de Nascimento não pode ser maior que o atual");
        } else {
            this.ano = ano;
        }
    }



    public void getIdade(){
         int idade = 2024 - getAno();
        System.out.printf("Idade: %d anos!%n", idade);
    }

    public void getDataNascimento(){
        System.out.printf("Data de Nascimento: %d/%d/%d%n", getDia(), getMes(), getAno());
    }

    public void frequenciaCardiacaIdeal(){
        int frequenciaLimite = 220;
        int idade = 2024 - getAno();

        int frequenciaMaxima = frequenciaLimite - idade;
        int frequenciaIdealMinima = frequenciaMaxima / 2;
        float frequenciaIdealMaxima = (float) (frequenciaMaxima * .85);

        System.out.println("Frequência máxima: " + frequenciaMaxima);
        System.out.println("Sua frequencia deve permanecer entre " + frequenciaIdealMinima + " bpm e " + frequenciaIdealMaxima + " bpm");


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

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {

        if(dia > 31 || dia < 1){
            System.out.println("Favor inserir dia válido");
        } else {
            this.dia = dia;
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if(mes > 12 || mes < 1){
            System.out.println("Favor inserir mês válido");
        } else {
            this.mes = mes;
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if(ano > 2024){
            System.out.println("O ano de Nascimento não pode ser maior que o atual");
        } else {
            this.ano = ano;
        }
    }
}
