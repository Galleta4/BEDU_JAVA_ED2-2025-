import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AnalizadorDeLogs {
    public static void main(String[] args) {
        Path rutaLog = Paths.get("errores.log");
        Path rutaRegistroFallos = Paths.get("registrofallos.txt");

        int totalLineas = 0;
        int conteoErrores = 0;
        int conteoWarnings = 0;

        // Try-with-resources
        try (BufferedReader lector = Files.newBufferedReader(rutaLog)) {
            String linea;
            while ((linea=lector.readLine()) != null) {
                totalLineas++;
                if (linea.contains("ERROR")) {
                    conteoErrores++;
                }
                if (linea.contains("WARNING")) {
                    conteoWarnings++;
                }
            }

            double porcentajeErrores = (totalLineas == 0) ? 0 : (conteoErrores * 100.0) / totalLineas;
            double porcentajeWarnings = (totalLineas == 0) ? 0 : (conteoWarnings * 100.0) / totalLineas;

            // resumen
            System.out.println(">>>>> Resumen de Análisis de Log<<<<<");
            System.out.println("Total de líneas leídas: " + totalLineas);
            System.out.println("Cantidad de errores: " + conteoErrores);
            System.out.println("Cantidad de advertencias: " + conteoWarnings);


            System.out.printf("Porcentaje de líneas con errores: %.2f%%\n", porcentajeErrores);
            System.out.printf("Porcentaje de líneas con advertencias: %.2f%%\n", porcentajeWarnings);

        } catch (IOException e) {
            System.err.println("Ocurrió un error al leer el archivo de logs.");

            try (BufferedWriter escritor = Files.newBufferedWriter(rutaRegistroFallos)) {
                escritor.write("Error al leer el archivo errores.log: " + e.getMessage());
            } catch (IOException ex) {
                System.err.println("No se pudo escribir en el archivo de registro de fallos.");
            }
        }
    }
}
