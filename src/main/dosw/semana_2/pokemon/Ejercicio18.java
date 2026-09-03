package main.dosw.semana_2.pokemon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class Ejercicio18 {
    public static void main(String[] args) {
        List<Pokemon> pokedex = Arrays.asList(
            new Pokemon(1, "Bulbasaur", "Planta/Veneno", 15, 150.0, "Kanto", false),
            new Pokemon(2, "Charizard", "Fuego/Volador", 65, 610.0, "Kanto", false),
            new Pokemon(3, "`kachu", "Eléctrico", 45, 320.0, "Kanto", false),
            new Pokemon(4, "Rayquaza", "Dragón/Volador", 75, 100.0, "Hoenn", true),
            new Pokemon(5, "Gengar", "Fantasma/Veneno", 58, 495.0, "Kanto", false),
            new Pokemon(6, "Lucario", "Lucha/Acero", 50, 420.0, "Sinnoh", false),
            new Pokemon(7, "Mewtwo", "Psíquico", 70, 680.0, "Kanto", true),
            new Pokemon(8, "Snorlax", "Normal", 55, 460.0, "Kanto", false),
            new Pokemon(9, "Dragonite", "Dragón/Volador", 62, 530.0, "Kanto", false),
            new Pokemon(10, "Gyarados", "Agua/Volador", 60, 480.0, "Kanto", false)
        );
        List<Pokemon> ranking = pokedex.stream()
                                       .sorted(Comparator.comparing(Pokemon::getPoderCombate).reversed())
                                       .limit(5)
                                       .toList();

        IntStream.range(0, ranking.size()).forEach(i -> {
            Pokemon p = ranking.get(i);
            System.out.printf("#%d %-12s - PC: %.0f%n", (i + 1), p.getNombre(), p.getPoderCombate());
        });
    }
}
