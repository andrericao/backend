package cap_5_modificadores_de_acesso.exercicio;

public class TestaSingleton {
    public static void main(String[] args) {

        FabricaCarroSingleton singleton = FabricaCarroSingleton.getInstance();
        FabricaCarroSingleton singleton2 = FabricaCarroSingleton.getInstance();

        singleton.soma(2, 5);
        singleton2.soma(2, 5);
    }
}
