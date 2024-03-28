package cap6.exemplos;

public class MetodoDeSobrecargar {
    public static void main(String[] args) {
        System.out.printf("O quadrado de 7 (inteiro) é %d%n", square(7));
        System.out.printf("O quadrado de 7.5 (inteiro) é %.2f%n", square(7.5));
    }

    public static int square(int intValue){
        System.out.printf("Chamada ao quadrado com argumento int: %d%n", intValue);
        return intValue * intValue;
    }
    public static double square(double doubleValue){
        System.out.printf("Chamada ao quadrado com argumento double: %.2f%n", doubleValue);
        return doubleValue * doubleValue;
    }
}
