package main.dosw.semana_2.pokemon;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ejercicio14 {
    public static void main(String[] args) {
        List<Pokemon> pokemons = List.of(
            new Pokemon(1,"Pikachu", "Eléctrico", 0, 320, "Kanto", false),
            new Pokemon(2,"Chikorita", "Planta", 0, 680, "Johto", false),
            new Pokemon(3,"Torchic", "Fuego", 0, 530, "Hoenn", false),
            new Pokemon(4,"Piplup", "Agua", 0, 210, "Sinnoh", false),
            new Pokemon(5,"Charmander", "Fuego", 0, 495, "Kanto", false),
            new Pokemon(6,"Totodile", "Agua", 0, 610, "Johto", false)
        );
        Map<String, List<Pokemon>> agrupadoPorRegion = pokemons.stream().collect(Collectors.groupingBy(Pokemon::getRegion));
        System.out.println(agrupadoPorRegion);
    }
}
