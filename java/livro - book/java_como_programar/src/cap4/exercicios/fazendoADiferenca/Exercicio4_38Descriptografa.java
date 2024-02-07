package cap4.exercicios.fazendoADiferenca;
// Escreva um aplicativo separado que receba a entrada de um inteiro de quatro
// dígitos criptografado e o descriptografe (revertendo o esquema de criptografia)
// para formar o número original.

// TENTANDO DESCRIPTOGRAFAR O NÚMERO 3492 QUE VOLTA A SER 2567
import java.util.Scanner;

public class Exercicio4_38Descriptografa {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o número criptografado: ");
        int numero = input.nextInt();
        int i = 0;
        int numeroDescriptografado = numero;
        int digito = 0;

        while(i < 4){
            digito = numero % 10;
            System.out.printf("%d° Dígito: %d%n", i + 1, digito);

            if(digito >= 7){
                digito -= 7;
            } else {
                digito += 10 - 7;
            }

            numero /= 10;
            System.out.printf("%d° Número: %d%n", i + 1, numero);

            if(i == 0){
                numeroDescriptografado = digito * 100;
            } else if(i == 1){
                numeroDescriptografado += digito * 1_000;
            } else if(i == 2){
                numeroDescriptografado += digito;
            } else if (i == 3){
                numeroDescriptografado += digito * 10;
            }
            System.out.println("-".repeat(40));
            System.out.printf("O número descriptografado é: %d%n", numeroDescriptografado);
            i++;
        }

        if (numeroDescriptografado / 1_000 == 0) {
            // Só pra estilizar, pois sem essa estrutura de seleção
            // caso o primeiro dígito seja zero ele o imprime sem este
            // Número de teste é o 1978 que deve gerar 0142
            // A linha 56 comentada mostra resultado sem tal tratamento
            // apenas tirei o 0 antes do número
            System.out.println();
            System.out.println("=".repeat(25));
            System.out.printf("|| RESULTADO1: 0%d     ||%n", numeroDescriptografado);
           // System.out.printf("|| RESULTADO1: %d     ||%n", numeroDescriptografado);
            System.out.println("=".repeat(25));

        } else {

            System.out.println();
            System.out.println("=".repeat(25));
            System.out.printf("|| RESULTADO2: %d     ||%n", numeroDescriptografado);
            System.out.println("=".repeat(25));
        }

    }
}
