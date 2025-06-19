package RETO_2;

public class Video extends MaterialCurso {

    private final double duracion;

    public Video(String titulo, String autor, double duracion) {
        super(titulo, autor);
        this.duracion = duracion;
    }

    public double getDuracion() {
        return duracion;
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("🎥 Video: " + getTitulo() + " - Autor:" + getAutor() +
                " - Duracion: " + duracion + "min");
    }
}