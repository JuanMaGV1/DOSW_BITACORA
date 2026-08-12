package main.dosw.semana_2.pokemon;

import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args) {
        List<Integer> niveles = List.of(45, 62, 38, 71, 55, 29);
        int resultado = niveles.stream().reduce(0, Integer::sum);
        System.out.println(resultado);
    }
}