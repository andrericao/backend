package cap7.exemplos;

public class Exemplo7_12_ForAprimorado {
    public static void main(String[] args) {
        int[] array = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
        int total = 0;

        for(int numero : array){
            total += numero;
        }

        System.out.printf("Total = %d", total);
    }
}