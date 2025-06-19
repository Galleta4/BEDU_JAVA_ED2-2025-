package RETO_1;

//clase abstracta
public abstract class OrdenProduccion {

    // Atributos

    private final String codigo;
    private final int cantidad;

    public OrdenProduccion(String codigo, int cantidad) {
        this.codigo = codigo;
        this.cantidad = cantidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    // Mètodo resumen

    public abstract void mostrarResumen();
}