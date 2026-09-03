package main.dosw.semana_2.pokemon;

import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class Ejercicio19 {
    public static void main(String[] args) {
        List<Pokemon> equipoGary = List.of(
            new Pokemon(1L, "Blastoise", "Agua", 65, 1200.0, "Kanto", false),
            new Pokemon(2L, "Arcanine", "Fuego", 58, 1140.0, "Kanto", false)
        );
        List<Pokemon> equipoAsh = List.of(
            new Pokemon(3L, "Pikachu", "Eléctrico", 50, 850.0, "Kanto", false),
            new Pokemon(4L, "Charizard", "Fuego", 60, 1000.0, "Kanto", false)
        );
        List<Pokemon> equipoDawn = List.of(
            new Pokemon(5L, "Empoleon", "Agua/Acero", 62, 1100.0, "Sinnoh", false),
            new Pokemon(6L, "Mamoswine", "Hielo/Tierra", 59, 1000.0, "Sinnoh", false)
        );
        List<Pokemon> equipoBrock = List.of(
            new Pokemon(7L, "Onix", "Roca", 45, 750.0, "Kanto", false),
            new Pokemon(8L, "Geodude", "Roca", 40, 920.0, "Kanto", false)
        );
        List<Entrenador> entrenadores = List.of(
            new Entrenador(1L, "Brock", 6, equipoBrock),
            new Entrenador(2L, "Gary", 10, equipoGary),
            new Entrenador(3L, "Dawn", 7, equipoDawn),
            new Entrenador(4L, "Ash", 8, equipoAsh)
        );

        List<Entrenador> rankingEntrenadores = entrenadores.stream()
                                                           .sorted(Comparator.comparingInt(Entrenador::getMedallas).reversed()
                                                                   .thenComparing(Comparator.comparingDouble(entrenador -> entrenador.getEquipo().stream().mapToDouble(Pokemon::getPoderCombate).sum()))
                                                                   .thenComparing(Comparator.comparing(Entrenador::getNombre)))
                                                           .limit(3)
                                                           .toList();
        IntStream.range(0, rankingEntrenadores.size())
            .forEach(i -> {
                Entrenador e = rankingEntrenadores.get(i);
                double poderTotal = e.getEquipo().stream().mapToDouble(Pokemon::getPoderCombate).sum();
                System.out.printf("#%d %-6s - %d medallas, PC: %.0f%n", 
                    (i + 1), e.getNombre(), e.getMedallas(), poderTotal);
            });
    }
}
