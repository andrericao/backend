package cap7.exemplos;

public class Exemplo7_14_TestaQuadroDeNotasComArray {
    public static void main(String[] args) {
        int[] arrayNotas = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };

        Exemplo7_14_QuadroDeNotasComArray meuQuadroNotas = new Exemplo7_14_QuadroDeNotasComArray("" +
                "Java como Programar", arrayNotas);

        System.out.printf("Bem Vindo ao quadro de notas para %n%s%n%n",
                meuQuadroNotas.getNomeDoCurso());
        meuQuadroNotas.processarNotas();
    }
}
