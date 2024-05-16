public class ArmaLarga extends Arma {

    private String justifUso;
    private int nivelArma;
    private boolean tieneSello;

    public ArmaLarga(Policia policiaAsignado, int cantMuniciones, double alcance, String marca, int calibre, String estado, String justifUso, int nivelArma, boolean tieneSello) {
        super(policiaAsignado, cantMuniciones, alcance, marca, calibre, estado);
        this.justifUso = justifUso;
        this.nivelArma = nivelArma;//1 al 5
        this.tieneSello = tieneSello;
    }
    //Comparacion de dos armas largas. Es mayor la de mayor nivel
    // compareTo toString
    public boolean esMayorQue(ArmaLarga otraArma) {
        return this.nivelArma > otraArma.getNivel();
    }
    //Getters y Setters

    public int getNivel() {
        return nivelArma;
    }
}
