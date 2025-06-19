import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 1000.0;
        int op;

        System.out.println("BIENVENIDO AL CAJERO AUTOMÁTICO");

        // solo para una vez uso do-while
        do {
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Porfavor elija una de las opciones disponibles : ");
            op = scanner.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Tu saldo actual es: $" + saldo);
                    break;
                case 2:
                    System.out.print("Ingresa el monto a depositar: ");
                    double depo = scanner.nextDouble();
                    if (depo <= 0) {
                        System.out.println("Monto inválido");
                        continue;
                    }
                    saldo += depo;
                    System.out.println("Depósito exitoso. Saldo actual $:" + saldo);
                    break;
                case 3:
                    System.out.print("Ingresa el monto a retirar: ");
                    double retiro = scanner.nextDouble();
                    if (retiro <= 0) {
                        System.out.println("Monto inválido.");
                        continue;
                    }
                    if (retiro > saldo) {
                        System.out.println("Fondo insuficiente.");
                        continue;
                    }
                    saldo -= retiro;
                    System.out.println("Retiro exitoso. Saldo actual: $" + saldo);
                    break;
                case 4:
                    System.out.println("Gracias por usar el cajero automático <3");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
                    break;
            }

        } while (op != 4);
    }
}
