package main.dosw.semana_1.streams;

import java.util.Arrays;
import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("1", "Carlos", 20, true),
                new User("2", "Ana", 22, false),
                new User("3", "Miguel", 19, true),
                new User("4", "Sofia", 25, true),
                new User("5", "Daniel", 21, false),
                new User("6", "Laura", 23, true)
        );
        List<String> sortedUsers = users.stream()
                                        .filter(User::isActive)
                                        .map(User::getName)
                                        .map(String::toUpperCase)
                                        .sorted()
                                        .toList();
        System.out.println("Usuarios activos, ordenados alfabeticamente: ");
        System.out.println(sortedUsers);
    }
}
