package main.dosw.semana_2.pokemon;

import java.util.Comparator;
import java.util.List;

public class Ejercicio12 {
    public static void main(String[] args) {
        List<Pokemon> pokemons = List.of(
            new Pokemon(1,"Pikachu", "Eléctrico", 0, 320, "", false),
            new Pokemon(2,"Mewtwo", "Psíquico", 0, 680, "", false),
            new Pokemon(3,"Dragonite", "Dragon-Volador", 0, 530, "", false),
            new Pokemon(4,"Charizard", "Fuego-Volador", 0, 610, "", false)
        );
        Pokemon pokemonMayorPoderCombate = pokemons.stream()
                                                   .max(Comparator.comparing(Pokemon::getPoderCombate))
                                                   .orElse(null);
        System.out.println("Campeón: "+ pokemonMayorPoderCombate + " con PC: " + pokemonMayorPoderCombate.getPoderCombate());
    }
}
