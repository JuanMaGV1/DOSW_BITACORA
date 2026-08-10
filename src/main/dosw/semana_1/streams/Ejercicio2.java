package main.dosw.semana_1.streams;

import java.util.List;

public class Ejercicio2 {
    public static void main(String[] args) {
        Entrada2 entrada = new Entrada2();
        List<String> palabras = entrada.leerLista();
        long palabrasResultantes = palabras.stream()
                                           .filter(n -> n.length() > 4)
                                           .map(String::toUpperCase)
                                           .sorted()
                                           .count();
        System.out.println("Cantidad de palabras resultantes: "+palabrasResultantes);
    }
}
