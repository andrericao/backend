package cap5.exemplos;

public class TestaBreak {
    public static void main(String[] args) {
        int contador;
        for (contador = 1; contador <= 10; contador++) {
            if (contador == 5)
                break;
            System.out.printf("%d ", contador);
        }

        System.out.printf("%nLoop pára quando o contador = %d%n", contador);
    }
}

