import java.util.Objects;

public class CuentaFiscal {
    private final String rfc;
    private double saldoDisponible;

    // Constructor (Los constructores se llaman igual a la clase declarada)
    public CuentaFiscal(String rfc, double saldoDisponible) {
        this.rfc = rfc;
        if (saldoDisponible >= 0) {
            this.saldoDisponible = saldoDisponible;
        } else {
            System.out.println("El saldo no puede ser negativo.");
            this.saldoDisponible = 0;
        }
    }

    // Getters
    public String getRfc() {
        return rfc;
    }

    public double getSaldoDisponible() {
        return saldoDisponible;
    }

    // Método para válidar RFC
    public boolean validarRFC(DeclaracionImpuestos d) {
        return Objects.equals(this.rfc, d.rfcContribuyente());
    }

    // Mostrar la información
    public void mostrarCuenta() {
        System.out.println(" --> Cuenta fiscal registrada con RFC: " + rfc + ", saldo disponible: $" + saldoDisponible);
    }
}
