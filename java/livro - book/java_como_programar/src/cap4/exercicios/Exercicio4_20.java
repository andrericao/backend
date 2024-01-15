package cap4.exercicios;
// 4.20 (Calculador de salários) Desenvolva um aplicativo Java que determina o salário bruto
// de cada um de três empregados. A empresa paga as horas normais pelas primeiras 40 horas
// trabalhadas por cada funcionário e 50% a mais por todas as horas trabalhadas além das 40
// horas. Você recebe uma lista de empregados, o número de horas trabalhadas por eles na semana
// passada e o salário-hora de cada um. Seu programa deve aceitar a entrada dessas informações
// para cada empregado e, então, determinar e exibir o salário bruto do empregado.
// Utilize a classe Scanner para inserir os dados.

import java.util.Scanner;


public class Exercicio4_20 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um salário de exemplo:");
        double salarioSemanal = input.nextDouble();
        double salarioHora = salarioSemanal / 40;

        String LimpaBuffer = input.nextLine();

        System.out.println("Digite o nome do funcionário:");
        String nome = input.nextLine();

        while(!nome.equals("-1")){

            System.out.println("Digite as horas trabalhadas:");
            int horas = input.nextInt();

            if(horas > 40){
                int extra = horas - 40;
                double salario = (salarioHora * extra * 1.5) + salarioSemanal;
                System.out.printf("O salário de %s é R$ %.2f%n", nome, salario);
                System.out.println("-".repeat(40) + "\n");
            } else if(horas <= 40){
                double salario = salarioHora * horas;
                System.out.printf("O salário de %s é RS %.2f%n", nome, salario);
                System.out.println("-".repeat(40) + "\n");
            }

            LimpaBuffer = input.nextLine();

            System.out.println("Digite o nome do funcionário:");
            nome = input.nextLine();
        }

        System.out.println("Fim do programa!");
    }
}
