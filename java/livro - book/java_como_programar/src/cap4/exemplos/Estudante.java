package cap4.exemplos;

public class Estudante {

    private String nome;
    private double media;

    public Estudante(String nome, double media){
        this.nome = nome;
        this.media = media;
    }

    public String getNota(){

        String nota = "";

        if (media >= 90.0){
            nota = "A";
        } else if(media >= 80.0){
            nota = "B";
        } else if (media >= 70.0){
            nota = "C";
        } else if (media >= 60.0){
            nota = "D";
        } else {
            nota = "F";
        }
        return nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        if(media > 0.0){
            if(media <= 100.0){
                this.media = media;
            }
        }
    }
}
