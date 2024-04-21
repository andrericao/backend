package cap7.exemplos.exemplo7_9_cartas;

public class Carta {
    private final String valor;
    private final String naipe;

    public Carta(String cartaValor, String naipeCarta){
        this.valor = cartaValor;
        this.naipe = naipeCarta;
    }

    public String toString(){
        return valor + " de " + naipe;
    }
}
