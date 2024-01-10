package cap4.exemplos;

import java.util.Scanner;

public class MediaDaClasse2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Declaração de variáveis
        int acumuladorNotas = 0;
        int contadorNotas = 0;

        System.out.print("Digite a nota ou -1 para sair: ");
        int nota = input.nextInt();

        while(nota != -1){
            acumuladorNotas = acumuladorNotas + nota;
            contadorNotas = contadorNotas + 1;
            System.out.print("Digite a nota ou -1 para sair: ");
            nota = input.nextInt();
        }

        if(contadorNotas != 0){
            double media =  (double) acumuladorNotas / contadorNotas;
            System.out.printf("%nO total das %d notas inseridas é %d%n", contadorNotas, acumuladorNotas);
            System.out.printf("A média da turma é %.2f", media);
        } else {
            System.out.println("Nenhuma nota inserida!");
        }

    }
}
