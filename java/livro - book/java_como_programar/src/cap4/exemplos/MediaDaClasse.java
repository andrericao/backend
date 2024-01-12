package cap4.exemplos;

import java.util.Scanner;

public class MediaDaClasse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int somatorioNotas = 0;
        int contadorNotas = 1;

        while(contadorNotas < 11){
            System.out.print("Digite a nota: ");
            int nota = input.nextInt();
            // antes do ensino do incremento e decremento
            // preferi deixar
            somatorioNotas = somatorioNotas + nota;
            contadorNotas = contadorNotas + 1;
        }

        int media = somatorioNotas / 10;
        System.out.printf("O somatório das 10 notas é igual a %d%n", somatorioNotas);
        System.out.printf("A média da turma é igual a %d%n" , media);
    }
}
