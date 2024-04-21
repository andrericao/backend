package cap7.exemplos;

public class Exemplo7_6_GraficoDeBarras {
    public static void main(String[] args) {
        int[] array = { 0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1 };
        System.out.println("Distribuíção de notas: ");

        for(int contador = 0; contador < array.length; contador++){

            // gera saída do rótulo de barra ( "00-09: ", ..., "90-99: ", "100: ")
            if(contador == 10){
                System.out.printf("%5d: ", 100);
            } else {
                System.out.printf("%02d-%02d: ",
                                    contador * 10,
                                    contador * 10 + 9);
            }
            for(int stars = 0; stars < array[contador]; stars++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
