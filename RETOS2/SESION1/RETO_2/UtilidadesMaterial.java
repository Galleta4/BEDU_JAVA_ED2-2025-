package RETO_2;

import java.util.*;
import java.util.function.Predicate;

public class UtilidadesMaterial {

    public static void mostrarMateriales(List<? extends MaterialCurso> lista) {
        for (MaterialCurso material : lista) {
            material.mostrarDetalle();
        }
    }

    // Contar duración total de videos
    public static void contarDuracionVideos(List<? extends Video> lista) {
        double total = 0;
        for (Video video : lista) {
            total += video.getDuracion();
        }
        System.out.println("\n🎥 Duración total de videos: " + total + " minutos");
    }

    // Marcar ejercicios como revisados
    public static void marcarEjerciciosRevisados(List<? super Ejercicio> lista) {
        for (Object obj : lista) {
            if (obj instanceof Ejercicio) {
                Ejercicio ejercicio = (Ejercicio) obj;
                ejercicio.setRevisado(true);
                System.out.println("✅ Ejercicio '" + ejercicio.getTitulo() + "' marcado como revisado.");
            }
        }
    }

    // Desafío adicional: Filtrar por autor usando Predicate
    public static void filtrarPorAutor(List<? extends MaterialCurso> lista, Predicate<MaterialCurso> filtro) {
        System.out.println("\n🔍 Filtrando materiales por autor:");
        for (MaterialCurso material : lista) {
            if (filtro.test(material)) {
                material.mostrarDetalle();
            }
        }
    }

    public static void main(String[] args) {
        // Crear materiales
        List<MaterialCurso> materiales = new ArrayList<>();
        System.out.println("📚 Materiales del curso:");
        materiales.add(new Video("POO en Java", "Carlos", 20));
        materiales.add(new Articulo("Historia de Java", "Ana", 1200));
        materiales.add(new Articulo("Tipos de datos", "Luis", 800));
        materiales.add(new Ejercicio("Variables y tipos", "Luis", false));
        materiales.add(new Ejercicio("Condicionales", "Mario", false));

        // Mostrar todos los materiales
        mostrarMateriales(materiales);

        // Filtrar solo los videos
        List<Video> videos = new ArrayList<>();
        for (MaterialCurso m : materiales) {
            if (m instanceof Video) {
                videos.add((Video) m);
            }
        }
        contarDuracionVideos(videos);

        // Marcar ejercicios como revisados
        marcarEjerciciosRevisados(materiales);

        // Filtrar materiales por autor (ej. Mario)
        filtrarPorAutor(materiales, m -> m.getAutor().equals("Mario"));
    }
}
