package cap4.exemplos;

public class Incremento {
    public static void main(String[] args) {

        int c = 5;

        System.out.printf("c antes do posincremento: %d%n", c); // 5
        System.out.printf("   posincrementando c: %d%n", c++);  // 5
        System.out.printf("c depois do incremento: %d%n%n", c); // 6

        c = 5;
        System.out.printf("c antes do posincremento: %d%n", c); // 5
        System.out.printf("   posincrementando c: %d%n", ++c);  // 6
        System.out.printf("c depois do incremento: %d%n%n", c); // 6
    }
}
