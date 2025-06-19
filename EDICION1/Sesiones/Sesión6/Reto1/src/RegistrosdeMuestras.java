import java.util.*;

public class RegistrosdeMuestras {
    public static void main(String[] args) {

        ArrayList<String> muestrasRecibidos = new ArrayList<>();

        muestrasRecibidos.add("Homo Sapiens");
        muestrasRecibidos.add("Mus musculus");
        muestrasRecibidos.add("Arabidopsis thaliana");
        muestrasRecibidos.add("Homo sapiens");

        System.out.println("Muestras recibidas:");
        for (int i = 0; i < muestrasRecibidos.size(); i++) {
            System.out.println((i + 1) + ". " + muestrasRecibidos.get(i));
        }

        HashSet<String> muestras = new HashSet<>(muestrasRecibidos);

        System.out.println("Especies únicas procesadas:");
        for (String especie : muestras) {
            System.out.println("---> " + especie);
        }

        HashMap<String, String> muestrasInvestigador = new HashMap<>();

        muestrasInvestigador.put("M-001", "Dra. López");
        muestrasInvestigador.put("M-002", "Dr. Hernández");
        muestrasInvestigador.put("M-003", "Dra. Rivera");

        System.out.println("Asignación de muestras a investigadores:");
        for (Map.Entry<String, String> entry : muestrasInvestigador.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        String idBuscar = "M-002";
        System.out.println("Investigador responsable de la muestra " + idBuscar + ": " + muestrasInvestigador.get(idBuscar));
    }
}
