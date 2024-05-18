public class ArmaCorta extends Arma {
    private boolean esAutomatica;

    public ArmaCorta(Policia policiaAsignado, int cantMuniciones, double alcance, String marca, int calibre, String estado, boolean esAutomatica) {
        super(policiaAsignado, cantMuniciones, alcance, marca, calibre, estado);
        this.esAutomatica = esAutomatica;
    }

    //Metodo alcance del Arma mayor a 200m.
    public boolean efectividadMts() {
        return getAlcance() > 200;
    }

}
