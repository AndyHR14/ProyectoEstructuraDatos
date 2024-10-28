package jugadores;

public class NodosCola {
    private String partida;
    private NodosCola atras;

    public NodosCola(String partida) {
        this.partida = partida;
    }

    public String getPartida() {
        return partida;
    }

    public void setPartida(String partida) {
        this.partida = partida;
    }

    public NodoCola getAtras() {
        return atras;
    }

    public void setAtras(NodoCola atras) {
        this.atras = atras;
    }

    @Override
    public String toString() {
        return partida;
    }
}
