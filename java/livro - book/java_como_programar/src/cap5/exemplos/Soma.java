package cap5.exemplos;

public class Soma {
    public static void main(String[] args) {

        int total = 0;

        // livro
        for (int number = 2; number <= 20; number += 2)
            total += number;
        System.out.printf("Sum is %d%n", total);

        // MEU
        total = 0;


        for(int number = 2; number <= 20; number += 2){
            System.out.printf("A soma de %d + %d é: %d%n", number, total, total + number);
            total += number;
        }
    }
}
