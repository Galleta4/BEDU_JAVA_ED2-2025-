public class PagoTarjeta extends MetodoPago implements Autenticable {
    private double saldodisponible;

    public PagoTarjeta(double monto, double saldodisponible) {
        super(monto);
        this.saldodisponible = saldodisponible;
    }

    @Override
    public boolean autenticar() {
        return saldodisponible >= monto;
    }

    @Override
    public void procesarPago() {
        System.out.println("Procesando pago con tarjeta por $" + monto);
    }
}
