package SESION2.RETO_1;

import java.util.concurrent.Callable;

public class SistemaControlTermico implements Callable<String> {
    @Override
    public String call() throws Exception {

        // simulamos que el control termico es de 0.8 seg
        Thread.sleep(800);

        return "🔥 Control térmico: temperatura estable (22°C).";

    }

}