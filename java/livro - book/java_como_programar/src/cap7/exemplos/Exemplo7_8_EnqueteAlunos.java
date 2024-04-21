package cap7.exemplos;

public class Exemplo7_8_EnqueteAlunos {
    public static void main(String[] args) {
        int [] respostas = { 1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3,
                2, 3, 3, 2, 14 };

        int[] frequencia = new int[6];

        // para cada resposta, seleciona elemento de respostas e utiliza esse valor
        // como índice de frequência para determinar elemento a incrementar
        for(int resposta = 0; resposta < respostas.length; resposta++){
            try{
                ++frequencia[respostas[resposta]];
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println();
                System.out.println(e);
                System.out.printf("%nResposta %d = %d%n%n", resposta, respostas[resposta]);
            }
        }
        System.out.printf("%s%15s%n", "Avaliação", "Frequência");

        for(int avaliacao = 1; avaliacao < frequencia.length; avaliacao++){
            System.out.printf("%6d%15d%n", avaliacao, frequencia[avaliacao]);
        }
    }
}
