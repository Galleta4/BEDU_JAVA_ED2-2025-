public class Principal {
    public static void main(String[] args) {

        Entrada e1 = new Entrada("Obra de Teatro 1", 450.0);
        Entrada e2 = new Entrada("Concierto 3BallMTY", 850.5);

        e1.mostrarInformacion();
        e2.mostrarInformacion();

        // Para <<Entrada_Record>
        Entrada_Record e3= new Entrada_Record("Concierto ElyXiOn -- Seúl",3000);

        e3.mostrarInformacion();

    }
}
