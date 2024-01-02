package cap3.exercicios.fazendoADiferenca;
/*
    todo: 3.17(Computadorização dos registros de saúde)
     Uma questão relacionada à assistência médica discutida ultimamente nos veículos de comunicação é a computadorização dos registros de saúde. Essa possibilidade está sendo abordada de maneira cautelosa por causa de preocupações quanto à privacidade e à segurança de dados sigilosos, entre outros motivos. [Iremos discutir essas preocupações em exercícios posteriores.] A computadorização dos registros de saúde pode facilitar que pacientes compartilhem seus perfis e históricos de saúde entre vários profissionais de saúde. Isso talvez aprimore a qualidade da assistência médica, ajude a evitar conflitos e prescrições erradas de medicamentos, reduza custos em ambulatórios e salve vidas.
     -> Neste exercício, você projetará uma classe HealthProfile “inicial” para uma pessoa. Os atributos da classe devem incluir
     - nome,
     - sobrenome,
     - sexo,
     - data de nascimento (consistindo em atributos separados para mês, dia e ano de nascimento),
     - altura (em metros) e
     - peso (em quilogramas) da pessoa.
     Sua classe deve ter um construtor que receba esses dados.
     Para cada atributo, forneça métodos set e get.
     A classe também deve incluir métodos que calculem e retornem
     - a idade do usuário em anos,
     - intervalo de frequência cardíaca máxima e frequência cardíaca alvo (veja o Exercício 3.16), além de
     - índice de massa corporal (IMC; veja o Exercício 2.33).
     Escreva um aplicativo Java que solicite as informações da pessoa, instancie um objeto da classe HealthProfile para ela e imprima as informações a partir desse objeto — incluindo nome, sobrenome, sexo, data de nascimento, altura e peso da pessoa ––, e então calcule e imprima a idade em anos, IMC, intervalo de frequência cardíaca máxima e frequência cardíaca alvo. Ele também deve exibir o gráfico de valores IMC do Exercício 2.33.
 */
public class PerfilSaude {

    private String nome;
    private String sobrenome;
    private String sexo;
    private int dia;
    private int mes;
    private int ano;
    private double altura;
    private double peso;

    public PerfilSaude(String nome,
                       String sobrenome,
                       String sexo,
                       int dia,
                       int mes,
                       int ano,
                       double altura,
                       double peso) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.altura = altura;
        this.peso = peso;
    }

    public void getIdade(){
        int idade = 2024 - getAno();
        System.out.printf("Idade: %d ano(s)", idade);
    }

    public void getFrequenciaCardiacaIdeal(){
        int frequenciaLimite = 220;
        int idade = 2024 - getAno();

        int frequenciaMaxima = frequenciaLimite - idade;
        int frequenciaIdealMinima = frequenciaMaxima / 2;
        float frequenciaIdealMaxima = (float) (frequenciaMaxima * .85);

        System.out.println("Frequência máxima: " + frequenciaMaxima);
        System.out.println("Sua frequencia deve permanecer entre " + frequenciaIdealMinima + " bpm e " + frequenciaIdealMaxima + " bpm");
    }

    public void getIMC(){
        double imc = getPeso() / (getAltura() * getAltura());
        System.out.printf("IMC: %.2f%n", imc);

        System.out.println("VALORES IMC");
        System.out.println("Abaixo do peso: menor que 18.5");
        System.out.println("Normal: entre 18.5 e 24.9");
        System.out.println("Sobrepeso: entre 25 e 29.9");
        System.out.println("Obeso: 30 ou mais");
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}


