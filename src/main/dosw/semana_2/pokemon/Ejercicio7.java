package main.dosw.semana_2.pokemon;

import java.util.List;

public class Ejercicio7 {
    public static void main(String[] args) {
        List<String> pokemons = List.of("Squirtle","Pikachu","Mewtwo","Bulbasaur","Charmander","Abra");
        List<String> pokemonsOrdenado = pokemons.stream().sorted().toList();
        System.out.println(pokemonsOrdenado);
    }
}
