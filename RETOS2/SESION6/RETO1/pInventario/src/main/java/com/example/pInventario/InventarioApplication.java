package com.example.pInventario;


import com.ejemplo.inventario.entity.Producto;
import com.ejemplo.inventario.repository.ProductoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class InventarioApplication implements CommandLineRunner {

	private final ProductoRepository productoRepository;

	public InventarioApplication(ProductoRepository productoRepository) {
		this.productoRepository = productoRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(InventarioApplication.class, args);
	}

	@Override
	public void run(String... args) {
		// guardar productos
		productoRepository.save(new Producto("Laptop Lenovo", "Laptop potente", 12500));
		productoRepository.save(new Producto("Mouse Logitech", "Mouse óptico", 350));
		productoRepository.save(new Producto("Teclado Mecánico", "Con luces LED", 950));
		productoRepository.save(new Producto("Monitor", "Monitor 24 pulgadas", 3200));

		// Consultas realizadas
		System.out.println("📦 Productos con precio mayor a 500:");
		productoRepository.findByPrecioGreaterThan(500).forEach(System.out::println);
		System.out.println("\n🔍 Productos que contienen 'lap':");
		productoRepository.findByNombreContainingIgnoreCase("lap").forEach(System.out::println);
		System.out.println("\n🎯 Productos con precio entre 400 y 1000:");
		productoRepository.findByPrecioBetween(400, 1000).forEach(System.out::println);
		System.out.println("\n📘 Productos cuyo nombre empieza con 'm':");
		productoRepository.findByNombreStartingWithIgnoreCase("m").forEach(System.out::println);
	}
}
