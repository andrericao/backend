package cap_4_orientacao_a_objetos_basica.exercicios;
/*
4 - Na classe de teste dentro do bloco main, construa duas contas com o new e compare-as com o ==. E se eles tiverem os mesmos atributos? Para isso, você precisará criar outra referência.

5 - Agora, crie duas referências para a mesma conta e compare-as com o ==. Tire suas conclusões. A fim de criar duas referências para a mesma conta:
*/
public class TestaConta {
    public static void main(String[] args) {
        Conta c1 = new Conta();

        c1.saldo = 150.0;
        c1.titular = "Nathália";
        c1.numeroConta = 23294;
        c1.agencia = "152-56";
        //c1.dataAbertura = "18/11/2023";

        //c1.saca(150.0);

        //c1.deposita(600.0);

        //c1.recuperaDadosParaImpressao();

        //System.out.println(c1.saldo);

        // =================== EXERCICO 4 ====================

        Conta c2 = new Conta();
        c2.titular = "Noah";
        c2.saldo = 25.0;

        Conta c3 = new Conta();
        c3.titular = "Noah";
        c3.saldo = 25.0;

        if(c2 == c3){
            System.out.println("Iguais");
        } else {
            System.out.println("Diferentes");
        }

// =================== EXERCICO 5 ====================

         Conta c4 = c3;

        if(c4 == c3){
            System.out.println("Iguais");
        } else {
            System.out.println("Diferentes");
        }


// =================== EXERCICO 6 ====================

        DataDeAbertura d1 = new DataDeAbertura();

        d1.dia = 19;
        d1.mes = 11;
        d1.ano = 2023;


        c1.dataAbertura = d1;

        //System.out.println("Data de criação: " + d1.dia + "/" + d1.mes + "/" + d1.ano);

// =================== EXERCICO 7 ====================

        c1.recuperaDadosParaImpressao();

    }

}
