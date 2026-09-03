package main.dosw.semana_2.pokemon;

import java.util.Comparator;
import java.util.List;

public class Ejercicio4 {
    public static void main(String[] args) {
        List<Pokemon> pokemons = List.of(new Pokemon("Pikachu", null, 45), new Pokemon("Charmander", null, 62), new Pokemon("Squirtle", null, 32), new Pokemon("Snorlax", null, 90), new Pokemon("Mewtwo", null, 88));
        Pokemon resultado = pokemons.stream().max(Comparator.comparingInt(Pokemon::getNivel)).orElse(null);
        System.out.println("Pokémon Alfa: " + resultado.getNombre() + " (nivel " + resultado.getNivel() + ")");
    }
}
