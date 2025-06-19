
public class Principal {
    public static void main(String[] args) {
        // Con RFC
        Factura facturaConRFC = new Factura(2500.0, "Servicio de consultoría", "ABCC010101XYZ");

        // Sin RFC
        Factura facturaSinRFC = new Factura(1800.0, "Reparación de equipo", null);

        System.out.println(facturaConRFC.getResumen());
        System.out.println(facturaSinRFC.getResumen());
    }
}