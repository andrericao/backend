package cap5.exemplos;
// Uma pessoa investe US$ 1.000 em uma conta-poupança que rende juros de 5% ao ano.
// Supondo que todo o juro seja aplicado, calcule e imprima a quantia de
// dinheiro na conta no ﬁm de cada ano por 10 anos. Utilize a seguinte fórmula
// para determinar as quantidades:
//
//      m = a (1 + j)n

// onde

//      a é o aporte/quantia original investida (isto é, o principal)
//      j é a taxa de juros anual (por exemplo, utilize 0,05 para 5%)
//      n é o número de anos
//      m é a quantia/montante em depósito no ﬁm do n-ésimo ano.

public class JurosCompostos {
    public static void main(String[] args) {

        double montante;
        double aporte = 1000.0;
        double juros = 1.05;

        System.out.printf("%5s%19s %n", "Ano", "Montante");

        for (int ano = 1; ano <= 10; ++ano){
            montante = aporte * Math.pow(juros, ano);
            System.out.printf("%4d%,20.2f%n", ano, montante);
        }
    }
}
