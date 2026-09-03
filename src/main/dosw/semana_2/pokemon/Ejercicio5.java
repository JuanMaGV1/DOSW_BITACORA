package main.dosw.semana_2.pokemon;

import java.util.List;

public class Ejercicio5 {
    public static void main(String[] args) {
        List<Pokemon> pokemons = List.of(new Pokemon("Pikachu", null, 45), new Pokemon("Mewtwo", null, 88), new Pokemon("Dragonite", null, 82), new Pokemon("Squirtle", null, 38), new Pokemon("Mew", null, 85), new Pokemon("Charmander", null, 62));
        long resultado = pokemons.stream()
                             .filter(p -> p.getNivel() > 80)
                             .count();
        System.out.println("Pokémon con nivel > 80: " + resultado);
    }
}
