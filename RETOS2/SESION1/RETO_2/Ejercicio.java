package RETO_2;

public class Ejercicio extends MaterialCurso {

    private boolean revisado;

    public Ejercicio(String titulo, String autor, boolean revisado) {
        super(titulo, autor);
        this.revisado = revisado;
    }

    public boolean isRevisado() {
        return revisado;
    }

    public void setRevisado(boolean revisado) {
        this.revisado = revisado;
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("📝 Ejercicio: " + getTitulo() + " - Autor:" + getAutor() +
                " - Revisado: " + revisado);
    }
}