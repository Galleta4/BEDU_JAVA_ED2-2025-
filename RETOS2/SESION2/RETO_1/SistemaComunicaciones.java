package SESION2.RETO_1;

import java.util.concurrent.Callable;

public class SistemaComunicaciones implements Callable<String> {
    @Override
    public String call() throws Exception {

        // simulamos que la comunic. es de 1 seg
        Thread.sleep(1000);

        return "📡 Comunicaciones: enlace con estación terrestre establecido.";

    }

}