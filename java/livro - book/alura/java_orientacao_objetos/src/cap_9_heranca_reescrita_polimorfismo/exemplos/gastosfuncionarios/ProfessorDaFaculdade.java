package cap_9_heranca_reescrita_polimorfismo.exemplos.gastosfuncionarios;

public class ProfessorDaFaculdade extends EmpregadoDaFaculdade{

    private int horaAula;

    @Override
    public double getGastos() {
        return this.getSalario() + this.horaAula * 10;
    }

    public String getInfo(){
        String informacaoBasica = getInfo();
        String informacao = informacaoBasica + " horas de aula: " + this.horaAula;

        return informacao;
    }

    public int getHoraAula() {
        return horaAula;
    }

    public void setHoraAula(int horaAula) {
        this.horaAula = horaAula;
    }
}
