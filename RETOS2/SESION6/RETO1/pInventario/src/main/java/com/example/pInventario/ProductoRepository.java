package SESION6.RETO1.pInventario.src.main.java.com.example.pInventario;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

    List<Producto> findByPrecioGreaterThan(double precio);

    List<Producto> findByNombreContainingIgnoreCase(String nombre);

    List<Producto> findByPrecioBetween(double min, double max);

    List<Producto> findByNombreStartingWithIgnoreCase(String prefijo);
}
