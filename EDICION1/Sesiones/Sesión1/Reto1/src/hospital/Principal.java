package hospital;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Paciente paciente = new Paciente();
        Scanner paci = new Scanner(System.in);

        System.out.println(">>>>> INGRESO DE DATOS DEL PACIENTE <<<<<");
        System.out.println("----> Ingrese el nombre del paciente:");
        paciente.nomPaciente = paci.nextLine();
        System.out.println("----> Ingrese la edad del paciente:");
        paciente.edadPaciente = paci.nextInt();
        paci.nextLine();
        System.out.println("----> Ingrese el expediente del paciente:");
        paciente.expePaciente = paci.nextLine();

        paciente.mostrarInformacion();
    }
}
