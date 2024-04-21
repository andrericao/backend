package cap6.exercicios.questoes;

import java.security.SecureRandom;

//  Escreva instruções que atribuem inteiros aleatórios à variável n nos seguintes intervalos:
public class Exercicio6_12 {

    static SecureRandom sr = new SecureRandom();

    // a) 1 <= n <= 2
    public static void numAleatoriosUmEDois(){

        int n = 1;
        int contador = 1;
        while(n <= 1_000){
            double x = sr.nextDouble();
            if(x > 0.99 && x < 1.99){
                System.out.printf("%d° - %f%n", contador, x);
                contador++;
            }
            n++;
        }
    }

    // b) 1 <= n <= 100
    public static void numAleatoriosUmECem(){
        int n = 1;
        int contador = 1;
        while(n <= 1_000){
            int x = sr.nextInt();
            if(x >= 1 && x <= 100){
                System.out.printf("%d - %d%n", contador, x);
                contador++;
            }
            n++;
        }
    }
    // c) 0 <= n <= 9.
    public static void numAleatoriosUmENove(){
        int n = 1;
        int contador = 1;
        while(n <= 1_000){
            int x = sr.nextInt();
            System.out.println(x);
            if(x >= 0 && x <= 1000){
                System.out.printf("%d - %d%n", contador, x);
                contador++;
            }
            n++;
        }
    }

    // d) 1000 <= n <= 1112
    public static void numAleatorioMilEMilCentoEDoze(){
        int n = 1;
        int contador = 1;
        while(n <= 1000){
            int x = sr.nextInt();
            if(x >= 1_000 && x <= 1_112){
                System.out.printf("%d - %d%n", contador, x);
                contador++;
            }
            n++;
        }
    }


    public static void main(String[] args) {

        //Exercicio6_12.numAleatoriosUmEDois();
        //Exercicio6_12.numAleatoriosUmECem();
        //Exercicio6_12.numAleatoriosUmENove();
        Exercicio6_12.numAleatorioMilEMilCentoEDoze();
    }
}
