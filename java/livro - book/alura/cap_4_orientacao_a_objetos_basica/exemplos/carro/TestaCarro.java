package cap_4_orientacao_a_objetos_basica.exemplos.carro;

public class TestaCarro {
    public static void main(String[] args) {
        Carro meuCarro;
        meuCarro = new Carro();
        meuCarro.cor = "Verde";
        meuCarro.modelo = "Fusca";
        meuCarro.velocidadeAtual = 0;
        meuCarro.velocidadeMaxima = 80;

        // liga o carro
        meuCarro.liga();

        // acelera o carro
        meuCarro.acelera(20);

    System.out.println("A velocidade do carro no momento é de " + meuCarro.velocidadeAtual + " km/h");
    }
}
