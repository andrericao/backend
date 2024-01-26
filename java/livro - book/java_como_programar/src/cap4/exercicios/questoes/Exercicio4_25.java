package cap4.exercicios.questoes;

public class Exercicio4_25 {
    public static void main(String[] args){
        int count = 1;
        while (count <= 10){
            System.out.println(count % 2 == 1 ? "****" : "++++++++");
            ++count;
        }
    }
}
