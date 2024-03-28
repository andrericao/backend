package cap6.exemplos;

public class EscopoDeCampo {
    private static int x = 1;

    public static void main(String[] args) {
        int x = 5;

        System.out.printf("O 'x' Local em 'main' é %d%n", x);

        variavelLocal(); // variavelLocal tem uma variável local x
        variavelCampo(); // variavelCampo utiliza o campo x da classe Scope
        variavelLocal(); // variavelLocal reinicializa a variável local x
        variavelCampo(); // campo x da classe ExcopDeCampo retém seu valor

        System.out.printf("O 'x' Local em 'main' é %d%n", x);
    }

    public static void variavelLocal(){
        int x = 25;

        System.out.printf("O valor de 'x' local ao entrar no método variavelLocal() é %d%n", x);
        ++x;
        System.out.printf("O valor de 'x' local ao sair do método variavelLocal() é %d%n", x);
    }

    public static void variavelCampo(){
        System.out.printf("O valor de 'x' ao entrar no método variavelCampo() é %d%n", x);
        x *= 10;
        System.out.printf("O valor de 'x' ao sair do método variavelCampo() é %d%n", x);
    }
}
