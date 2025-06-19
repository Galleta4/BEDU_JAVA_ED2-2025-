public class DialogoTexto implements GestorDialogo {
    @Override
    public void mostrarDialogo(PaqueteNarrativo paquete) {
        System.out.println("Escena actual: " + paquete.getEscenaActual());
        System.out.println("Caperucita se pierde y tiene dos caminos...");
    }
}