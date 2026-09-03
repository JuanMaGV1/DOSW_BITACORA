package main.dosw.semana_2.pokemon;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ejercicio20 {
    public static void main(String[] args) {
        List<Pokemon> pokemons = List.of(
            new Pokemon(1L, "Charizard", "Fuego", 65, 610.0, "Kanto", false),
            new Pokemon(2L, "Arcanine", "Fuego", 58, 550.0, "Kanto", false),
            new Pokemon(3L, "Blaziken", "Fuego", 60, 580.0, "Hoenn", false),
            new Pokemon(4L, "Infernape", "Fuego", 55, 530.0, "Sinnoh", false),
            new Pokemon(5L, "Blastoise", "Agua", 62, 590.0, "Kanto", false),
            new Pokemon(6L, "Gyarados", "Agua", 60, 570.0, "Kanto", false),
            new Pokemon(7L, "Greninja", "Agua", 58, 560.0, "Kalos", false),
            new Pokemon(8L, "Mewtwo", "Psíquico", 70, 680.0, "Kanto", true),
            new Pokemon(9L, "Rayquaza", "Dragón", 75, 700.0, "Hoenn", true),
            new Pokemon(10L, "Tyranitar", "Siniestro", 61, 600.0, "Johto", false)
        );
        
        Map<String, Long> porTipo = pokemons.stream().collect(Collectors.groupingBy(Pokemon::getTipo, Collectors.counting()));
        Map<String, Long> porRegion = pokemons.stream().collect(Collectors.groupingBy(Pokemon::getRegion, Collectors.counting()));
        long cantidadLegendarios = pokemons.stream().filter(Pokemon::Eslegendario).count();
        double promedioNivel = pokemons.stream().collect(Collectors.averagingDouble(Pokemon::getNivel));
        Pokemon masFuerte = pokemons.stream().max(Comparator.comparingDouble(Pokemon::getPoderCombate)).orElse(null);

        System.out.println("Por tipo:     " + porTipo);
        System.out.println("Por región:   " + porRegion);
        System.out.println("Legendarios:  " + cantidadLegendarios);
        System.out.printf("Promedio niv: %.1f%n", promedioNivel);
        System.out.printf("Más fuerte:   %s (PC: %.0f)%n", masFuerte.getNombre(), masFuerte.getPoderCombate());
    }
}
