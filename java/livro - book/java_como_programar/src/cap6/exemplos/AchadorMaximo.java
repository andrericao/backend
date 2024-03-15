package cap6.exemplos;

import java.util.Scanner;

public class AchadorMaximo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite três números separados por espaço: ");

        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        // determina valor máximo
        double result = maximum(num1, num2, num3);

        System.out.printf("O maior valor é %f", result);
    }

    public static double maximum(double x, double y, double z){

        double maiorValor = x;

        if(y > maiorValor){
            maiorValor = y;
        }

        if(z > maiorValor){
            maiorValor = z;
        }

        return maiorValor;
    }

}
