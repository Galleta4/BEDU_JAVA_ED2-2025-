import java.util.Scanner;

public class DecisionBinaria implements LogicaDecision {
    @Override
    public String tomarDecision() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Caperucita qué deseas hacer?");
        System.out.println("A: Hacerle caso a su mamá");
        System.out.println("B: Hacerle caso al lobo ");
        System.out.print("Selecciona A o B: ");
        String input = scanner.nextLine();
        return input.toUpperCase();
    }
}