package main.dosw.semana_2.pokemon;

import java.util.List;

public class Ejercicio8 {
    public static void main(String[] args) {
        List<Pokemon> pokemons = List.of(new Pokemon("Pikachu", true), new Pokemon("Raichu", false), new Pokemon("Charmander", true), new Pokemon("Charizard", false), new Pokemon("Squirtle", true), new Pokemon("Blastoise", false));
        List<Pokemon> listaEvolucion = pokemons.stream().filter(p -> p.puedeEvolucionar()).toList();
        System.out.println("Listos para evolucionar:");
        System.out.print(listaEvolucion);
    }
}
