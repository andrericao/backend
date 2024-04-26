package cap7.exemplos;

public class Exemplo7_14_QuadroDeNotasComArray {

    private String nomeDoCurso;
    private int[] notas;

    public Exemplo7_14_QuadroDeNotasComArray(String nomeDoCurso, int[] notas){
        this.nomeDoCurso = nomeDoCurso;
        this.notas = notas;
    }

    public void setNomeDoCurso(String nomeDoCurso){
        this.nomeDoCurso = nomeDoCurso;
    }

    public String getNomeDoCurso() {
        return nomeDoCurso;
    }

    public void processarNotas(){

        outputNotas();
        System.out.printf("%nA média da classe é %.2f%n", getMedia());

        System.out.printf("A menor nota é %d%nA maior nota é %d%n",
                            getMinimo(), getMaximo());

        outputBarraDeCaracter();
    }

    public int getMinimo(){
        int menorNota = notas[0];

        for(int nota : notas){
            if(nota < menorNota){
                menorNota = nota;
            }
        }
        return menorNota;
    }

    public int getMaximo(){
        int maiorNota = notas[0];

        for(int nota : notas)
            if(nota > maiorNota)
                maiorNota = nota;

        return maiorNota;
    }

    public double getMedia(){
        int total = 0;
        for(int nota : notas)
            total += nota;


        return (double) total / notas.length;
    }

    public void outputBarraDeCaracter(){
        System.out.printf("%nDitribuição de notas:%n");

        int[] frequencia = new int[11];

        for(int nota : notas)
            ++frequencia[nota / 10];

        for(int i = 0; i < frequencia.length; i++){
            if(i == 10)
                System.out.printf("%5d: ", 100);
            else
                System.out.printf("%02d-%02d: ", i * 10, i * 10 + 9);

            for(int asteriscos = 0; asteriscos < frequencia[i]; asteriscos++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void outputNotas(){
        System.out.printf("As notas são: %n%n");

        for(int estudante = 0; estudante < notas.length; estudante++){
            System.out.printf("Estudante %2d: %3d%n",
                    estudante + 1, notas[estudante]);
        }

    }
}
