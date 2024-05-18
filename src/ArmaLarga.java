public class ArmaLarga extends Arma implements IComparable {

    private String justifUso;
    private int nivelArma;
    private boolean tieneSello;

    public ArmaLarga(Policia policiaAsignado, int cantMuniciones, double alcance, String marca, int calibre, String estado, String justifUso, int nivelArma, boolean tieneSello) {
        super(policiaAsignado, cantMuniciones, alcance, marca, calibre, estado);
        this.justifUso = justifUso;
        this.nivelArma = nivelArma;//1 al 5
        this.tieneSello = tieneSello;
    }
    public int getNivelArma()
    {
        return nivelArma;
    }
    //Comparacion de dos armas largas. Es mayor la de mayor nivel (1-5).
    // compareTo toString

    //@Override
    public boolean esMayorQue(ArmaLarga otra) {
        return this.nivelArma > otra.nivelArma;
    }

}
