package cap7.exemplos;

import java.security.SecureRandom;

public class Exemplo7_7_LancarDados {
    public static void main(String[] args) {

        SecureRandom sr = new SecureRandom();
        int[] frequencia = new int[7];

        for(int lancar = 1; lancar <= 6_000_000; lancar++) {
            ++frequencia[1 + sr.nextInt(6)];
        }

        System.out.printf("%s%15s%n", "Lado", "Frequência");

        for(int lado = 1; lado <= frequencia.length; lado++){
            System.out.printf("%4d%15d%n", lado, frequencia[lado]);
        }
    }
}
