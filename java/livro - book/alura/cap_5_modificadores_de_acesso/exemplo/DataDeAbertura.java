package cap_5_modificadores_de_acesso.exemplo;

public class DataDeAbertura {
    private int dia;
    private int mes;
    private int ano;

    public DataDeAbertura(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String getDataFormatada(){
        String dataFormatada = this.dia + "/" + this.mes + "/" + this.ano;
        return dataFormatada;
    }

}
