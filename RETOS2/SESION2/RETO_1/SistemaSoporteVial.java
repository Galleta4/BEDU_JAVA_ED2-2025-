package SESION2.RETO_1;

import java.util.concurrent.Callable;

public class SistemaSoporteVial implements Callable<String> {
    @Override
    public String call() throws Exception {

        // simulamos el monitoro de presion, oxigeno y condiciones termicas en 0.5 seg
        Thread.sleep(500);

        return "🧪 Soporte vital: presión y oxígeno dentro de parámetros normales.";

    }
}