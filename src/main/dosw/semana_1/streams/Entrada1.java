package main.dosw.semana_1.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Entrada1 {
    private Scanner sc = new Scanner(System.in);
    public List<Integer> leerLista () {
        System.out.println("Escribe los numeros de la lista separados por comas: ");
        String entrada = sc.nextLine();
        return Arrays.stream(entrada.split(",")).map(String::trim).map(Integer::parseInt).toList();
    }
}
