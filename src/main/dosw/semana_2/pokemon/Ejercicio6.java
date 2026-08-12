package main.dosw.semana_2.pokemon;

import java.util.List;

public class Ejercicio6 {
    public static void main(String[] args) {
        List<String> pokemons = List.of("Pikachu","Charmander","Pikachu","Squirtle","Charmander","Mewtwo");
        List<String> resultado = pokemons.stream().distinct().toList();
        System.out.println(resultado);
    }
}
