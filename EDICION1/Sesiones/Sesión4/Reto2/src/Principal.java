public class Principal{
    public static void main(String[] args) {

        // declaración de impuestos
        DeclaracionImpuestos declaracion = new DeclaracionImpuestos("XAXX010101000", 8700.0);

        // cuenta fiscal
        CuentaFiscal cuenta = new CuentaFiscal("XAXX010101023", 9500.0);

        // información
        System.out.println("Declaración enviada por RFC: " + declaracion.rfcContribuyente() + " por $" + declaracion.montoDeclarado());
        cuenta.mostrarCuenta();

        // Validar si el RFC
        boolean rfcValido = cuenta.validarRFC(declaracion);
        System.out.println("¿RFC válido para esta cuenta?: " + rfcValido);
    }
}
