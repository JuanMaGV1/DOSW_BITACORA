package main.dosw.semana_2.pokemon;

import java.util.List;

public class Ejercicio16 {
    public static void main(String[] args) {
        List<Entrenador> entrenadores = List.of(
            new Entrenador((long) 1, "Ash", 8, null),
            new Entrenador((long) 2, "Misty", 5, null),
            new Entrenador((long) 3, "Brock", 6, null),
            new Entrenador((long) 4, "Gary", 10, null),
            new Entrenador((long) 5, "May", 3, null),
            new Entrenador((long) 6, "Dawn", 7, null)
        );
        List<Entrenador> entrenadoresExperimentados = entrenadores.stream()
                                                                  .filter(p -> p.getMedallas() > 5)
                                                                  .toList();
        System.out.println("Entrenadores con > 5 medallas: ");
        System.out.println(entrenadoresExperimentados);
    }
}
