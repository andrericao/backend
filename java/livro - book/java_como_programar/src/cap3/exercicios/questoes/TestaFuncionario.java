package cap3.exercicios.questoes;

public class TestaFuncionario {
    public static void main(String[] args) {

        Funcionario marquinho = new Funcionario("Marco", "Aurélio", 8000.00);
        Funcionario valeria = new Funcionario("Valéria", "Mandarino", 2000.00);

        System.out.printf("O salário anual do %s %s é R$ %.2f%n%n",
                marquinho.getNome(),
                marquinho.getSobrenome(),
                marquinho.getSalarioMensal() * 12);

        System.out.printf("O salário anual da %s é R$ %.2f%n%n",
                valeria.getNome(),
                valeria.getSalarioMensal() * 12);



        double aumentoVintePorcentoMarquinho = marquinho.getSalarioMensal() * 1.2;
        double aumentoVintePorcentoValeria = valeria.getSalarioMensal() * 1.2;

        System.out.printf("Com aumento o salário do %s é R$ %.2f%n%n",
                marquinho.getNome(),
                aumentoVintePorcentoMarquinho);

        System.out.printf("Com aumento o salário da %s é R$ %.2f",
                valeria.getNome(),
                aumentoVintePorcentoValeria);
    }

}
