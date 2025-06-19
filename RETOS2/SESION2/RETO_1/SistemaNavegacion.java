package SESION2.RETO_1;

import java.util.concurrent.Callable;

public class SistemaNavegacion implements Callable<String> {
    @Override
    public String call() throws Exception {

        // simulamos que la trayectoria es de 1.5 seg
        Thread.sleep(1500);

        return "🛰️ Navegación: trayectoria corregida con éxito.";

    }

}
