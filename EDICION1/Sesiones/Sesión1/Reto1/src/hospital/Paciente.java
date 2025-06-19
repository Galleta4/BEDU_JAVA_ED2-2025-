package hospital;

public class Paciente {

    String nomPaciente;
    int edadPaciente;
    String expePaciente;

    public void mostrarInformacion() {
        System.out.println(">>>>> DATOS DEL PACIENTE <<<<<");
        System.out.println(" ---> Nombre: " + nomPaciente);
        System.out.println(" ---> Edad: " + edadPaciente);
        System.out.println(" ---> Expediente: " + expePaciente);
    }
}
