public record Entrada_Record(String nombreEvento, double precEntr) {
    //Puedes no poner lo siguiente y en principal poner
    // un System.out prinlin(e3) en la clase Principal.java
    public void mostrarInformacion() {
        System.out.println("---> Evento: " + nombreEvento + "---> Precio: $" + precEntr);
    }
}
