package main.dosw.semana_2.pokemon;

import java.util.Comparator;
import java.util.List;

public class Ejercicio15 {
    public static void main(String[] args) {
        List<Entrenador> entrenadores = List.of(
            new Entrenador((long) 1, "Ash", 8, null),
            new Entrenador((long) 2, "Misty", 5, null),
            new Entrenador((long) 3, "Brock", 6, null),
            new Entrenador((long) 4, "Gary", 10, null)
        );
        Entrenador maestroGimnasios = entrenadores.stream()
                                                  .max(Comparator.comparing(Entrenador::getMedallas))
                                                  .orElse(null);
        System.out.println("Campeón de gimnasios: " + maestroGimnasios.getNombre());
        System.out.println("Medallas obtenidas: " + maestroGimnasios.getMedallas());
    }
}
