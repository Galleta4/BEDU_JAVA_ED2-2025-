public class TransicionSimple implements TransicionHistoria {
    @Override
    public void realizarTransicion(String decision) {
        if (decision.equalsIgnoreCase("A")) {
            System.out.println("Caperucita decide entrar al bosque...");
        } else {
            System.out.println("El lobo intercepta en la casa de la abuela...");
        }
    }
}