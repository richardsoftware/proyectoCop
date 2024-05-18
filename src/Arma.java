public class Arma {
    private Policia policiaAsignado;
    private int cantMuniciones;
    private double alcance;
    private String marca;
    private int calibre;
    private String estado;


    //Constructor
    public Arma(Policia policiaAsignado, int cantMuniciones, double alcance, String marca, int calibre, String estado) {
        this.policiaAsignado = policiaAsignado;
        this.cantMuniciones = cantMuniciones;
        this.alcance = alcance;
        this.marca = marca;
        this.calibre = calibre;
        this.estado = estado;//NUEVA EN MANTENIMIENTO EN USO
    }
    //Getters

    public double getAlcance() {
        return alcance;

    }
    @Override
    public String toString() {
        return  " Arma: " + marca + " Alcance: " + alcance + " Mts.";
    }

    //Se debe poder saber si el arma está en condiciones para poder ser usada por un policía en un
    //enfrentamiento. Para que pueda estar en condiciones debe estar en estado “EN USO” y ser un calibre >=9.

    //Metodo
    public boolean enCondicion() {
        return estado.compareTo("EN USO") == 0 && calibre >= 9;
    }

}
