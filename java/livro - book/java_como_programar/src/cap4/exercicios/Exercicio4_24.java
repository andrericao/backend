package cap4.exercicios;

import java.util.Scanner;

public class Exercicio4_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int aprovados = 0;
        int reprovados = 0;
        int contadorEstudantes = 1;

        while(contadorEstudantes <= 10){
            System.out.printf("Inserir %d° resultado (1 = aprovado, 2 = reprovado): ", contadorEstudantes);
            int resultado = input.nextInt();

            if(resultado == 1){
                aprovados++;
                contadorEstudantes++;
            } else if(resultado == 2) {
                reprovados++;
                contadorEstudantes++;
            }
        }
        System.out.printf("%d aprovados%n%d reprovados%n%n", aprovados, reprovados);
        if(aprovados >= 8){
            System.out.println("Bônus para o professor!");
        }
    }
}
