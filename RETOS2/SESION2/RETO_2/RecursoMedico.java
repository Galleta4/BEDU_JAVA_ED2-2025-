package SESION2.RETO_2;

import java.util.concurrent.locks.ReentrantLock;

public class RecursoMedico {

    private final String nombre;
    private final ReentrantLock lock = new ReentrantLock();

    public RecursoMedico(String nombre) {
        this.nombre = nombre;
    }

    public void usar(String profesional) {
        lock.lock();
        try {
            System.out.println(profesional + " ha entrado a " + nombre);
            Thread.sleep(1000);
            System.out.println(profesional + " ha salido de " + nombre);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
