package cap6.exemplos;

import java.security.SecureRandom;

public class LancarDadosSeisMilhoesVezes {

    public static void main(String[] args) {

        SecureRandom sr = new SecureRandom();

        int qtd_1 = 0;
        int qtd_2 = 0;
        int qtd_3 = 0;
        int qtd_4 = 0;
        int qtd_5 = 0;
        int qtd_6 = 0;

        for(int i = 1; i <= 6_000_000; i++){

            int face = 1 + sr.nextInt(6);

            switch (face){
                case 1:
                    ++qtd_1;
                    break;
                case 2:
                    ++qtd_2;
                    break;
                case 3:
                    ++qtd_3;
                    break;
                case 4:
                    ++qtd_4;
                    break;
                case 5:
                    ++qtd_5;
                    break;
                case 6:
                    ++qtd_6;
                    break;
            }
        }

        System.out.println("Face\tQTd Vezes");
        System.out.printf("1:\t%d%n2:\t%d%n3:\t%d%n4:\t%d%n5:\t%d%n6:\t%d", qtd_1, qtd_2, qtd_3, qtd_4, qtd_5, qtd_6);
    }
}
