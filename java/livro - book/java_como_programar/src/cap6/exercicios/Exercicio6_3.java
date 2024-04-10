package cap6.exercicios;

// 6.3 Escreva um aplicativo que teste se os exemplos de chamadas de método da
// classe Math mostrada na Figura 6.2 realmente produzem os resultados indicados.
public class Exercicio6_3 {
    public static void main(String[] args) {
        double abs = Math.abs(-23.7);
        System.out.printf("%f%n", abs);

        double ceil = Math.ceil(-9.2);
        System.out.printf("%f%n", ceil);
    }
}
