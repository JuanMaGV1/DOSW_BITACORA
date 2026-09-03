package main.dosw.semana_1.streams;

import java.util.Arrays;
import java.util.List;

public class Ejercicio4 {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("1", "Carlos", 20, true),
                new User("2", "Ana", 13, false),
                new User("3", "Miguel", 19, true),
                new User("4", "Sofia", 25, true),
                new User("5", "Daniel", 11, false),
                new User("6", "Laura", 16, true)
        );
        List<String> adultsUsers = users.stream()
                                        .filter(u -> u.getAge() > 18)
                                        .map(User::getName)
                                        .toList();
        System.out.println("Usuarios mayores de edad: ");
        System.out.println(adultsUsers);
    }
}
