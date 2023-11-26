package cap_5_modificadores_de_acesso.exercicio;

public class FabricaCarroSingleton {

    private static FabricaCarroSingleton instance;

    private FabricaCarroSingleton(){
    }

    public static synchronized FabricaCarroSingleton getInstance(){

        if(instance == null){
            instance = new FabricaCarroSingleton();
            return instance;

        } else {
            return instance;
        }
    }

    public void soma(int num1, int num2){
        int total = num1 + num2;
        System.out.println("A soma deu " + total);
    }
}
