package cap3.exercicios.fazendoADiferenca;

import java.util.Scanner;

public class TestaFrequenciaCardiaca {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Por favor digite seu nome: ");
        String nome = input.nextLine();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = input.nextLine();

        System.out.println("Digite o dia do seu nascimento: ");
        int dia = input.nextInt();

        System.out.println("Digite o mes do seu nascimento: ");
        int mes = input.nextInt();

        System.out.println("Digite o ano do seu nascimento: ");
        int ano = input.nextInt();

        FrequenciaCardiaca fc1 = new FrequenciaCardiaca(nome, sobrenome, dia, mes, ano);

        fc1.getDataNascimento();
        fc1.getIdade();

        fc1.frequenciaCardiacaIdeal();


    }
}
