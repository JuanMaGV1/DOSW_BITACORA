package main.dosw.semana_2.pokemon;

import java.util.List;

public class Ejercicio1 {
    public static void main(String[] args) {
        List<Pokemon> pokemons = List.of(new Pokemon("Pikachu","Eléctrico"), new Pokemon("Charmander", "Fuego"), new Pokemon("Squirtle", "Agua"), new Pokemon("Vulpix", "Fuego"), new Pokemon("Bulbasaur", "Planta"), new Pokemon("Flareon", "Fuego"));
        List<String> resultado = pokemons.stream()
                                         .filter(p -> p.getTipo().equals("Fuego"))
                                         .map(Pokemon::getNombre) //Necesario para poder obtener el nombre de los pokemons
                                         .toList();
        System.out.println(resultado);    
    }
}