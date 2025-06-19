import java.util.Scanner;

public class SimuladorFarmacia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos al usuario

        System.out.print("Ingrese el nombre del medicamento --> ");
        String nom = scanner.nextLine();
        System.out.print("Ingrese la cantidad de piezas --> ");
        int cantp = scanner.nextInt();
        System.out.print("Ingrese el precio unitario -->");
        double prec = scanner.nextDouble();

        // Cálculo sin el descuento
        double sindesc= prec * cantp;
        // Si necesita descuento
        boolean sidesc= sindesc > 500.0;
        double totdesc= sidesc ? sindesc * 0.15 : 0;
        // Total a pagar
        double totalPagar = sidesc ? sindesc - totdesc : sindesc;

        System.out.println(".... F A R M A C I A   S A N  J U A N  ....");
        System.out.println("Medicamento: " + nom);
        System.out.println("Cantidad de piezas: " + cantp);
        System.out.println("Precio unitario: $" + prec);
        System.out.println("Total sin descuento: $" + sindesc);
        System.out.println("¿Aplica descuento?: " + sidesc);
        System.out.println("Descuento: $" + totdesc);
        System.out.println("Total a pagar: $" + totalPagar);

        scanner.close();

    }

}
