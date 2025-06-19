package SESION2.RETO_1;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws Exception {

        ExecutorService executor = Executors.newFixedThreadPool(4);

        Future<String> nav = executor.submit(new SistemaNavegacion());
        Future<String> com = executor.submit(new SistemaComunicaciones());
        Future<String> term = executor.submit(new SistemaControlTermico());
        Future<String> vital = executor.submit(new SistemaSoporteVial());

        System.out.println(nav.get());
        System.out.println(com.get());
        System.out.println(term.get());
        System.out.println(vital.get());

        System.out.println("✅ Todos los sistemas reportan estado operativo");

        executor.shutdown();
    }
}
