package cap5.exemplos;

public class TestaAutoApolice {
    public static void main(String[] args) {

        AutoApolice apolice1 = new AutoApolice(11111111, "Toyota Camry", "NJ");
        AutoApolice apolice2 = new AutoApolice(22222222, "Ford Fusion", "ME");

        estadoApoliceSemCulpa(apolice1);
        estadoApoliceSemCulpa(apolice2);
    }

    public static void estadoApoliceSemCulpa(AutoApolice apolice){
        System.out.println("Auto Apólice: ");
        System.out.printf(
                "Conta #: %d; Carro: %s; Estado %s %s um estado sem culpa%n%n",
                apolice.getNumeroDaConta(), apolice.getModeloAutomovel(),
                apolice.getEstado(),
                (apolice.isEstadoSemCulpa() ? "é": "não é"));
    }
}
