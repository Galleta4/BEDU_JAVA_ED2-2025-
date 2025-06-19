package SESION3.RETO_1;

import java.util.*;

public class ConfimacionPedidos {
    public static void main(String[] args) {

        // pedidos
        List<Pedido> pedidos = Arrays.asList(
                new Pedido("Ana", "domicilio", "555-1234"),
                new Pedido("Luis", "local", null),
                new Pedido("Mario", "domicilio", null),
                new Pedido("Laura", "domicilio", "555-5678"),
                new Pedido("Pedro", "local", "555-9999"));

        // Stream API
        pedidos.stream()
                .filter(p -> p.getTipoEntrega().equals("domicilio"))
                .map(Pedido::getTelefono)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .map(tel -> "📞 Confirmación enviada al número: " + tel)
                .forEach(System.out::println);
    }
}