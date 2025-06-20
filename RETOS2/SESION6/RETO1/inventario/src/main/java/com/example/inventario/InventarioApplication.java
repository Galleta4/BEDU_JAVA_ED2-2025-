package com.example.inventario;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventarioApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventarioApplication.class, args);
    }

    @Bean
    CommandLineRunner run(ProductoRepository repo) {
        return args -> {
            repo.save(new Producto("ASUS TUF A15 GAMING", "Portátil", 20000));
            repo.save(new Producto("Laptop Lenovo", "Portátil", 12500));
            repo.save(new Producto("Mouse Logitech", "Mouse inalámbrico", 950));
            repo.save(new Producto("Teclado Mecánico", "RGB", 350));
            repo.save(new Producto("Monitor", "24 pulgadas", 3200));

            System.out.println("📦 Productos con precio mayor a 500:");
            repo.findByPrecioGreaterThan(500).forEach(System.out::println);

            System.out.println("🔍 Productos que contienen 'lap':");
            repo.findByNombreContainingIgnoreCase("lap").forEach(System.out::println);

            System.out.println("🎯 Productos con precio entre 400 y 1000:");
            repo.findByPrecioBetween(400, 1000).forEach(System.out::println);

            System.out.println("📘 Productos cuyo nombre empieza con 'm':");
            repo.findByNombreStartingWithIgnoreCase("m").forEach(System.out::println);
        };
    }
}