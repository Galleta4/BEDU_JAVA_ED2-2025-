public abstract class UnidadEmergencia {
    protected String nombre;

    public UnidadEmergencia(String nombre){
        this.nombre = nombre;
    }

    public void activarUnidad(){
        System.out.println("ACTIVANDO UNIDAD: " + nombre);
    }

    // Método abstracto
    public abstract void responder();
}
