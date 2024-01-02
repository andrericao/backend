package cap4.exemplos;

public class TestaEstudante {
    public static void main(String[] args) {
        Estudante mioguelito = new Estudante("Miguel",  93.5);
        Estudante iago = new Estudante("Iago", 72.75);

        System.out.printf("A nota de %s é: %s%n", mioguelito.getNome(), mioguelito.getNota());
        System.out.printf("A nota de %s é: %s%n", iago.getNome(), iago.getNota());
    }
}
