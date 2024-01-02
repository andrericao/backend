package cap3.exercicios.questoes;
/*
    todo: 3.14
     (Classe Date) Crie uma classe chamada Date que inclua três variáveis de instância —
     mês (tipo int),
     dia (tipo int) e
     ano (tipo int).
     Forneça um construtor que inicializa as três variáveis de instância supondo que os valores fornecidos estejam corretos.
     Ofereça um método set e um get para cada variável de instância.
     Apresente um método displayDate que exiba mês, dia e ano separados por barras normais (/).
     Escreva um aplicativo de teste chamado DateTest que demonstre as capacidades da classe Date.
 */
public class Data {

    private int mes;
    private int dia;
    private int ano;

    public Data(int mes, int dia, int ano){
        this.mes = mes;
        this.dia = dia;
        this.ano = ano;
    }

    public void mostrarData(){
        System.out.printf("Data: %d/%d/%d", getDia(), getMes(), getAno());
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
