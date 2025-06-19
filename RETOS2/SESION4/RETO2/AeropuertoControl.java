package SESION4.RETO2;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class AeropuertoControl {

    private void simularLatencia() {
        try {
            TimeUnit.SECONDS.sleep(ThreadLocalRandom.current().nextInt(2, 4));
        } catch (InterruptedException e) {
            throw new RuntimeException("Interrupción en la latencia");
        }
    }

    public CompletableFuture<Boolean> verificarPista() {
        return CompletableFuture.supplyAsync(() -> {
            simularLatencia();
            boolean disponible = ThreadLocalRandom.current().nextInt(100) < 80; // 80% disponible
            System.out.println("🛣️ Pista disponible: " + disponible);
            return disponible;
        });
    }

    public CompletableFuture<Boolean> verificarClima() {
        return CompletableFuture.supplyAsync(() -> {
            simularLatencia();
            boolean disponible = ThreadLocalRandom.current().nextInt(100) < 85; // 85% disponible
            System.out.println("🌦️ Clima favorable: " + disponible);
            return disponible;
        });
    }

    public CompletableFuture<Boolean> verificarTraficoAereo() {
        return CompletableFuture.supplyAsync(() -> {
            simularLatencia();
            boolean disponible = ThreadLocalRandom.current().nextInt(100) < 90; // 90% disponible
            System.out.println("🚦 Tráfico aéreo despejado:" + disponible);
            return disponible;
        });
    }

    public CompletableFuture<Boolean> verificarPersonalTierra() {
        return CompletableFuture.supplyAsync(() -> {
            simularLatencia();
            boolean disponible = ThreadLocalRandom.current().nextInt(100) < 95; // 95% disponible
            System.out.println("👷‍♂️ Personal disponible:" + disponible);
            return disponible;
        });
    }

    public void autorizarAterrizaje() {

        System.out.println("🛫 Verificando condiciones para aterrizaje...\n");

        CompletableFuture<Boolean> pista = verificarPista();
        CompletableFuture<Boolean> clima = verificarClima();
        CompletableFuture<Boolean> trafico = verificarTraficoAereo();
        CompletableFuture<Boolean> personal = verificarPersonalTierra();

        CompletableFuture.allOf(pista, clima, trafico, personal)
                .thenRun(() -> {
                    try {
                        boolean condicionesOptimas = pista.get() && clima.get() && trafico.get() && personal.get();
                        if (condicionesOptimas) {
                            System.out.println("\n🛬 Aterrizaje autorizado: todas las condiciones óptimas.");
                        } else {
                            System.out.println("\n🚫 Aterrizaje denegado: condiciones no óptimas.");
                        }
                    } catch (Exception e) {
                        System.out.println("\n❌ Error al combinar resultados: " + e.getMessage());
                    }
                });

    }

    // Main para probar
    public static void main(String[] args) {
        AeropuertoControl control = new AeropuertoControl();
        control.autorizarAterrizaje();

        // Esperar suficiente para que terminen todas las tareas asincrónicas
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
