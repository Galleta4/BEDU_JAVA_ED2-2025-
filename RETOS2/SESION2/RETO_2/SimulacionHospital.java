package SESION2.RETO_2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimulacionHospital {

    public static void main(String[] args) {

        System.out.println("🏥 Iniciando acceso a la Sala de cirugía...");

        RecursoMedico salaCirugia = new RecursoMedico("Sala de cirugía");

        ExecutorService executor = Executors.newFixedThreadPool(4);

        // profesionales
        Runnable draSanchez = () -> salaCirugia.usar("👩‍⚕️ Dra. Sánchez");
        Runnable drGomez = () -> salaCirugia.usar("👨‍⚕️ Dr. Gómez");
        Runnable enfermeraLopez = () -> salaCirugia.usar("👩‍⚕️ Enfermera López");
        Runnable drMartinez = () -> salaCirugia.usar("👨‍⚕️ Dr. Martínez");

        // executor
        executor.submit(draSanchez);
        executor.submit(drGomez);
        executor.submit(enfermeraLopez);
        executor.submit(drMartinez);

        executor.shutdown();
    }
}
