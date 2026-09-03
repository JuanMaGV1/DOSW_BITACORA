package main.dosw.semana_2.pokemon;

import java.util.List;

public class Ejercicio9 {
    public static void main(String[] args) {
        List<Pokemon> pokemons = List.of(
            new Pokemon(1,"Pikachu", "Eléctrico", 0, 320, "", false),
            new Pokemon(2,"Mewtwo", "Psíquico", 0, 680, "", false),
            new Pokemon(3,"Dragonite", "Dragon-Volador", 0, 530, "", false),
            new Pokemon(4,"Squirtle", "Agua", 0, 210, "", false),
            new Pokemon(5,"Gengar", "Fantasma-Veneno", 0, 495, "", false),
            new Pokemon(6,"Charizard", "Fuego-Volador", 0, 610, "", false)
        );
        List<Pokemon> equipoElite = pokemons.stream().filter(p->p.getPoderCombate()>500).toList();
        System.out.println("Equipo Élite (PC > 500): ");
        System.out.println(equipoElite);
    }
}
