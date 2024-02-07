package cap5.exemplos;

import java.util.Scanner;

public class NotaPorLetra {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int total = 0;
        int contadorDeNota = 0;
        int notaA = 0;
        int notaB = 0;
        int notaC = 0;
        int notaD = 0;
        int notaF = 0;

        while(input.hasNext())  {
            System.out.printf("Digite a nota do aluno");
            int nota = input.nextInt();
            total += nota;
            ++contadorDeNota;

            switch (nota / 10){
                case 9:
                case 10:
                    ++notaA;
                    break;

                case 8:
                    ++notaB;
                    break;

                case 7:
                    ++notaC;
                    break;

                case 6:
                    ++notaD;
                    break;

                default:
                    ++notaF;
                    break; // opcional
            }

        }

        System.out.printf("%nQuadro de Alunos:%n");

        if(contadorDeNota != 0){
            double media = (double) total / contadorDeNota;

            System.out.printf("Total de %d notas inseridas, somando pontos %d%n", contadorDeNota, total);
            System.out.printf("Média de nota da classe é %.2f%n", media);

            System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n",
                    "Number of students who received each grade:",
                    "A: ", notaA,
                    "B: ", notaB,
                    "C: ", notaC,
                    "D: ", notaD,
                    "F: ", notaF);
        } else {
            System.out.println("Não foi inserida nenhuma nota");
        }
    }
}
