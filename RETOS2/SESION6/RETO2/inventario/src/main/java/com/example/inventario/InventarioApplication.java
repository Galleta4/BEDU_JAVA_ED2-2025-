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
    CommandLineRunner run(ProductoRepository prepo, MarcaRepository mrepo) {
        return args -> {

            //marcas
            Marca samsung = new Marca("Samsung");
            Marca apple = new Marca("Apple");
            Marca asus = new Marca("ASUS");

            mrepo.save(apple);
            mrepo.save(samsung);
            mrepo.save(asus);

            //marcas
            prepo.save(new Producto("ASUS TUF A15 GAMING", "Portátil", 20000, asus));
            prepo.save(new Producto("iPhone 15", "Smartphone", 24000, apple));
            prepo.save(new Producto("iPad Pro", "Tablet", 19000, apple));
            prepo.save(new Producto("Galaxy S23", "Smartphone", 22000, samsung));
            prepo.save(new Producto("Smart TV", "Televisor 55''", 18000, samsung));

            System.out.println("📚 Productos por marca:");
            mrepo.findAll().forEach(marca -> {
                System.out.println("🏷️ " + marca.getNombre() + ":");
                prepo.findAll().stream()
                        .filter(p -> p.getMarca().getId().equals(marca.getId()))
                        .forEach(p -> System.out.println("   - " + p.getNombre()));
            });
        };
    }
}