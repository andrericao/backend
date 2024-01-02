package cap3.exercicios.fazendoADiferenca;

import java.util.Scanner;

public class TestaPerfilSaude {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Por favor digite seu nome: ");
        String nome = input.nextLine();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = input.nextLine();

        System.out.println("Digite o sexo: ");
        String sexo = input.nextLine();

        System.out.println("Digite o dia do seu nascimento: ");
        int dia = input.nextInt();

        System.out.println("Digite o mes do seu nascimento: ");
        int mes = input.nextInt();

        System.out.println("Digite o ano do seu nascimento: ");
        int ano = input.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = input.nextDouble();

        System.out.println("Digite seu peso: ");
        double peso = input.nextDouble();

        PerfilSaude ps1 = new PerfilSaude(nome, sobrenome, sexo, dia, mes, ano, altura, peso);

        ps1.getFrequenciaCardiacaIdeal();
        ps1.getIMC();
        ps1.getIdade();
    }
}
