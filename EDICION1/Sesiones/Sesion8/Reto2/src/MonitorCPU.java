import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class MonitorCPU {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> cpuregistros = new HashSet<>();

        try {
            System.out.println("Ingrese los consumos de CPU de los servidores en %. Escriba -1 para terminar.");

            while (true) {
                System.out.print("CPU (%): ");
                int consumo = scanner.nextInt();

                if (consumo == -1) {
                    break;
                }

                if (consumo < 0 || consumo > 100) {
                    System.out.println("Valor fuera de rango. Debe estar entre 0 y 100.");
                    continue;
                }

                if (!cpuregistros.add(consumo)) {
                    System.out.println("Valor duplicado: " + consumo + "%");
                    continue;
                }

                if (consumo > 95) {
                    throw new ConsumoCriticoException("ALERTA: Consumo crítico detectado (" + consumo + "%)");
                }

                System.out.println("Registro aceptado: " + consumo + "%");
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: Debes ingresar un número entero válido.");
        } catch (ConsumoCriticoException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Recursos cerrados correctamente.");
        }
    }
}
