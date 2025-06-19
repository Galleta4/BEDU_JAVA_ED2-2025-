package RETO_2;

//clase abstracta
public abstract class MaterialCurso {

    private final String titulo, autor;

    public MaterialCurso(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    // Mètodo mostrarDetalle

    public abstract void mostrarDetalle();
}