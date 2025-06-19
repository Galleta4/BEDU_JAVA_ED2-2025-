public class Main {
    public static void main(String[] args) {

        // facturas con el mismo folio
        Factura f1 = new Factura("FAC001", "Juan Pérez", 1450.00);
        Factura f2 = new Factura("FAC001", "Comercial XYZ", 1450.00);

        System.out.println(f1);
        System.out.println(f2);

        System.out.println("¿Facturas iguales?: " + f1.equals(f2));
    }
}
