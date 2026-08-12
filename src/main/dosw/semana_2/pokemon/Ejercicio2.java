package main.dosw.semana_2.pokemon;

import java.util.List;

public class Ejercicio2 {
    public static void main(String[] args) {
        List<String> nombres = List.of("Pikachu", "Charmander", "Squirtle", "Bulbasaur" );
        List<String> resultado = nombres.stream()
                                        .map(String::toUpperCase)
                                        .toList();
        System.out.println(resultado);
    }
}
