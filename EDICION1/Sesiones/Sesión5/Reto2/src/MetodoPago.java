public abstract class MetodoPago {
    protected double monto;

    public MetodoPago(double monto){
        this.monto=monto;
    }

    public abstract boolean autenticar();
    public abstract void procesarPago();

    public void mostrarResumen(){
        System.out.println("Tipo -->" + this.getClass().getSimpleName()+"Monto: $" + monto);
    }

}
