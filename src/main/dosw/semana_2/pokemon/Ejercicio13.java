package main.dosw.semana_2.pokemon;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ejercicio13 {
    public static void main(String[] args) {
        List<Pokemon> pokemons = List.of(
            new Pokemon(1,"Squirtle", "Agua", 0, 210, "", false),
            new Pokemon(2,"Psyduck", "Agua", 0, 0, "", false),
            new Pokemon(3,"Charizard", "Fuego", 0, 610, "", false),
            new Pokemon(4,"Vulpix", "Fuego", 0, 0, "", false),
            new Pokemon(5,"Bulbasaur", "Planta", 0, 0, "", false)
        );
        Map<String, List<Pokemon>> agrupadosPorTipo = pokemons.stream().collect(Collectors.groupingBy(Pokemon::getTipo)); //Version alterna para guardar solo strings: Map<String, List<String>> agrupadosPorTipo = pokemones.stream().collect(Collectors.groupingBy(Pokemon::getTipo, Collectors.mapping(Pokemon::getNombre, Collectors.toList())));
        System.out.println(agrupadosPorTipo);
        /*
        Otro tipo para poder recorrer es usando
        agrupadosPorTipo.entrySet().stream().forEach(entry -> System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue()));
        agrupadosPorTipo.forEach((tipo, nombres) -> System.out.println(tipo + ": " + nombres));
        */
    }
}
