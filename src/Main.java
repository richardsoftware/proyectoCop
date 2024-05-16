public class Main {
    public static void main(String[] args) {


        //Policia nombre apellido legajo.
        Policia policia1 = new Policia("Juan", "Perez", 123);
        Policia policia2 = new Policia("Maria", "Gomez", 456);
        Policia policia3 = new Policia("Pedro", "Fernandez", 207);
        Policia policia4 = new Policia("Angel", "Garcilazo", 145);

        //Arma policiaAsignado cantMuniciones alcance marca calibre estado
        //Arma Corta esAutomatica
        //Arma Larga descripción justificando su uso, el nivel del arma (1 al 5) y sello del RENAR.
        ArmaCorta armaCorta1 = new ArmaCorta(policia1, 15, 70.50, "Glock", 9, "EN USO", true);
        ArmaCorta armaCorta2 = new ArmaCorta(policia2, 12, 250.25, "Matagato", 22, "EN MANTENIMIENTO", true);
        ArmaLarga armaLarga1 = new ArmaLarga(policia3, 30, 300.00, "Remington", 38, "NUEVA", "Uso para patrullaje rural", 4 , true);
        ArmaLarga armaLarga2 = new ArmaLarga(policia4, 25, 500.00, "M16", 9, "EN USO", "Uso para situaciones de alta peligrosidad", 3, false);


        System.out.println("Programa Policia Prueba");


        System.out.println("¿El arma corta 1 puede disparar a más de 200m? " + armaCorta1.efectividadMts());
        System.out.println("¿El arma corta 2 puede disparar a más de 200m? " + armaCorta2.efectividadMts());
        System.out.println("¿El arma larga 1 es mayor que el arma larga 2? " + armaLarga1.esMayorQue(armaLarga2));
        System.out.println("¿El arma larga 2 está en condiciones para ser usada? " + armaLarga2.enCondicion());

    }
}