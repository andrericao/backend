package cap3.exercicios.questoes;

public class TestaFatura {
    public static void main(String[] args) {
        Fatura f1 = new Fatura("11-22","teclado", 2, 0.00);

        System.out.printf("O valor total da Fatura é R$%.2f", f1.getTotalFatura());
    }
}
