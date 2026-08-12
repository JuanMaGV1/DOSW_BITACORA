package main.dosw.semana_2.pokemon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ejercicio17 {
    public static void main(String[] args) {
        List<Pokemon> equipoAsh = Arrays.asList(
            new Pokemon(1, "Pikachu", "Eléctrico", 50, 850.0, "Kanto", false),
            new Pokemon(2, "Charizard", "Fuego", 60, 1000.0, "Kanto", false)
        );
        List<Pokemon> equipoGary = Arrays.asList(
            new Pokemon(3, "Blastoise", "Agua", 65, 1200.0, "Kanto", false),
            new Pokemon(4, "Arcanine", "Fuego", 58, 1140.0, "Kanto", false)
        );
        List<Pokemon> equipoBrock = Arrays.asList(
            new Pokemon(5, "Onix", "Roca", 45, 750.0, "Kanto", false),
            new Pokemon(6, "Geodude", "Roca", 40, 920.0, "Kanto", false)
        );

        List<Entrenador> entrenadores = List.of(new Entrenador((long) 1, "Ash", 0, equipoAsh), new Entrenador((long) 2, "Gary", 0, equipoGary), new Entrenador((long) 3, "Brock", 0, equipoBrock));

        Entrenador masPoderoso = entrenadores.stream().max(Comparator.comparingDouble(entrenador -> entrenador.getEquipo().stream().mapToDouble(Pokemon::getPoderCombate).sum())).orElse(null);
        double poderTotal = masPoderoso.getEquipo().stream().mapToDouble(Pokemon::getPoderCombate).sum();

        System.out.println("Entrenador más poderoso: " + masPoderoso.getNombre());
        System.out.println("Poder acumulado del equipo: " + poderTotal);
    }
}
