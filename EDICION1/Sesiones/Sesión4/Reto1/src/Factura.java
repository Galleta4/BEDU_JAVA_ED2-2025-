
// Clase con los atributos declarados
public class Factura {
    String folio;
    String cliente;
    double tot;

// Constructor de la clase con paramétros
    public Factura(String folio, String cliente, double tot){
        this.folio = folio;
        this.cliente=cliente;
        this.tot = 0.0;
        }

        //Método toString
    @Override
    public String toString() {
        return "Factura [folio=" + folio + ", cliente=" + cliente + ", total=$" + tot + "]";

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Factura otra = (Factura) obj;
        return this.folio.equals(otra.folio);
    }

    @Override
    public int hashCode() {
        return folio.hashCode();
    }
}
