import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;

public class RegistroSimulacion {

    public static void main(String[] args) {
        // Parametros.txt dentro de la carpeta config/
        Path rutaSrc = Paths.get("C:\\Users\\phzno\\IdeaProjects\\Sesiones\\Sesión7\\Reto1\\src");
        Path rutaConfig = rutaSrc.resolve("config");
        Path rutaArchivo = rutaConfig.resolve("parametros.txt");

        // Parámetros de simulación
        String param = "Tiempo de ciclo: 55.8 segundos\n"
                + "Velocidad de línea: 1.2 m/s\n"
                + "Número de estaciones: 8\n";

        try {
            // Creación de la carpeta config, si esta no existe
            if (!Files.exists(rutaConfig)) {
                Files.createDirectories(rutaConfig);
                System.out.println("Carpeta config creada.");
            }

            // Escribe en el archivo
            Files.write(rutaArchivo, param.getBytes());
            System.out.println("Archivo de parámetros escrito correctamente.");

            // Verifica y muestra el archivo más su contenido
            if (Files.exists(rutaArchivo)) {
                System.out.println("El archivo fue creado exitosamente en: " + rutaArchivo.toAbsolutePath());
                String contenidoLeido = Files.readString(rutaArchivo);
                System.out.println("Contenido del archivo:");
                System.out.println(contenidoLeido);
            } else {
                System.out.println("El archivo NO fue creado.");
            }

        } catch (IOException e) {
            System.out.println("Error al trabajar con el archivo: " + e.getMessage());
        }
    }
}