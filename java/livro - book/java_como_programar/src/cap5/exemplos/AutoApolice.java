package cap5.exemplos;

public class AutoApolice {

    private int numeroDaConta;
    private String modeloAutomovel;
    private String estado;

    public AutoApolice(int numeroDaConta, String modeloAutomovel, String estado){
        this.numeroDaConta = numeroDaConta;
        this.modeloAutomovel = modeloAutomovel;
        this.estado = estado;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public String getModeloAutomovel() {
        return modeloAutomovel;
    }

    public void setModeloAutomovel(String modeloAutomovel) {
        this.modeloAutomovel = modeloAutomovel;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public boolean isEstadoSemCulpa(){

        boolean validoNoEstado;

            switch (getEstado()){
                case "MA": case "NJ": case "NY": case "PA":
                    validoNoEstado = true;
                    break;
                default:
                    validoNoEstado = false;
                    break;
            }
            return validoNoEstado;


    }
}
