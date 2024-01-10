package cap4.exemplos;

import java.util.Scanner;

public class Analise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int aprovados = 0;
        int reprovados = 0;
        int contadorEstudantes = 1;

        while(contadorEstudantes <= 10){
            System.out.print("Inserir resultado (1 = aprovado, 2 = reprovado): ");
            int resultado = input.nextInt();

            if(resultado == 1){
                aprovados = aprovados + 1;
            } else {
                reprovados = reprovados + 1;
            }

            contadorEstudantes = contadorEstudantes + 1;
        }

        System.out.printf("%d aprovados%n%d reprovados%n%n", aprovados, reprovados);
        if(aprovados >= 8){
            System.out.println("Bônus para o professor!");
        }
    }
}
