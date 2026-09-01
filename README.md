# DOSW_BITACORA

# SEMANA No 1 - DOSW Manejo de Streams
## Datos personales:
- Nombre y Apellido: Juan Garzón
- Codigo de Estudiante: 1000103731
- Curso: DOSW - 4

---

## Ejercicio 01 - Números Pares mayores a diez 

Dada una lista de números enteros, necesitamos obtener una nueva lista solo con los números pares mayores a 10.

**Código implementado:** 
```
public class Ejercicio1 {
    public static void main(String[] args) {
        Entrada1 entrada = new Entrada1();
        List<Integer> numeros = entrada.leerLista();
        List<Integer> resultado = numeros.stream().filter(n -> n%2==0 && n>10).toList();
        System.out.println(resultado);
    }
}
```
**Captura de ejecucion:** 

![alt text](/src/main/dosw/semana_1/images/Semana1-Ejercicio1.png)

**Explicación:** Creamos una clase para la manejar la entrada. Y con stream recorremos la lista de los números ingresados y usamos el metodo `filter()` para poder realizar el filtro de los números pares mayores a 10, con la condición `n%2==0` para obtener los números pares y la condición `n > 10` para que sean mayores a 10

## Ejercicio 02 - Cantidad de Palabras con más de 4 caracteres

Dada una lista de palabras, se requiere: 

- Filtrar las palabras que tengan más de 4 caracteres 
- Convertirlas en Mayúsculas 
- Ordenarlas alfabéticamente
- Obtener la cantidad total de palabras resultantes 

**Código implementado:**
```
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
```
**Captura de ejecucion:**

![alt text](/src/main/dosw/semana_1/images/Semana1-Ejercicio2.png)

**Explicación:** Creamos una clase para manejar la entrada, y con stream recorremos la lista de las palabras ingresadas. Usando el metodo `filter()` para poder filtrar las palabras con más de 4 caracteres, con la condición `n.legth() > 4`. Usando el metodo `map()` convertimos las palabras en máyusculas usando `String::toUpperCase` que es un metodo de la clase String. Usamos el metodo `sorted()` para ordenarlas alfabeticamente, no es necesario agregarle un parametro ya que por defecto ordena por orden alfabetico. Por ultimo el metodo `count()`, para la cantidad total de palabras resultantes.

## Ejercicio 03 - Obtener nombres de los Usuarios 

Dada una lista de usuarios con los atributos: id, name, age, active 

Filtra únicamente los usuarios activos, obtén una lista con los nombres en mayúscula y ordenada alfabéticamente.

**Código implementado:**
```
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
```
**Captura de ejecucion:**

![alt text](/src/main/dosw/semana_1/images/Semana1-Ejercicio3.png)

**Explicación:** Usando stream, hacemos el filtrado de usuarios activos con el metodo `filter` y aprovechando la función `isActive` que creamos en usuario. Despues usamos el primer `map()` para transformar los datos de la clase `User` a `String` obteniendo el nombre de los usuarios ya filtrados. Igualmente, usamos el segundo `map()` para transformar los nombres en mayuscula. Despues usamos el metodo `sorted()` para organizar de manera alfabetica (no es necesario escribir un comparador como argumento, ya que por defecto usa el orden alfabetico). Por ultimo, usamos el metood `toList()` para dejar todo en una lista.

## Ejercicio 04 - Personas mayores de edad

Dado un listado de Usuarios y utilizando los mismo atributos anteriores, filtrar las personas mayores de edad y obtener sus nombres. 

**Código implementado:**
```
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
```
**Captura de ejecucion:**

![alt text](/src/main/dosw/semana_1/images/Semana1-Ejercicio4.png)

**Explicación:** Usando stream, hacemos el filtrado de usuarios mayores de edad con el metodo `filter` con la condición `u -> u.getAge() > 18`. Despues usamos `map()` para transformar los datos de la clase `User` a `String` obteniendo el nombre de los usuarios ya filtrados. Por ultimo, usamos el metood `toList()` para dejar todo en una lista.

## Ejercicio 05 - Transacciones Bancarias

Dada una lista de transacciones bancarias representadas por objetos: 

`class Transaction { String id; double amount; boolean approved; }`
Se requiere procesar la lista usando Streams para: 

- Usar peek para ver cada transacción procesada (Utilizar System.out.println para ver la transacción) 
- Verificar si existe al menos una transacción no aprobada 
- Retornar true o false indicando si el lote de transacciones es válido. 

**Código implementado:**
```
public class Reto5 {
    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
                new Transaction("T001", 500000, true),
                new Transaction("T002", 250000, true),
                new Transaction("T003", 800000, false),
                new Transaction("T004", 150000, true)
        );
        boolean loteValido = transactions.stream()
                                         .peek(transaction -> System.out.println("Procesando: " + transaction))
                                         .anyMatch(transaction ->!transaction.isApproved());
                                         
        System.out.println("\n¿El lote es válido? " + !loteValido);
    }
}
```
**Captura de ejecucion:**

![alt text](/src/main/dosw/semana_1/images/Semana1-Ejercicio5.png)

**Explicación:** Usando stream, hacemos la revision de cada transacción con el metodo `peek()` y haciendo un override a la clase `Transaction` para poder ver la información de mejor manera. Despues usamos el metodo `anymatch()` para verificar si existe al menos una transacción no aprobada. Y en el mensaje final invertimos el resultado del anymatch porque se tuvo en cuenta que el lote de transacciones es valido si todas las transacciones fueron aprobadas.


# SEMANA No 2 - Bitácora Pokémon

## Datos de Entrenador:
- Nombre y Apellido: Juan Garzón
- Código de Estudiante: 1000103731
- Curso: DOSW - 4

---

### Ejercicio 01 - Pokémon Tipo Fuego

Dada una lista de Pokémon con nombre y tipo, obtener únicamente aquellos cuyo tipo sea Fuego.

**Código implementado:** 

```
public class Ejercicio1 {
    public static void main(String[] args) {
        List<Pokemon> pokemons = List.of(new Pokemon("Pikachu","Eléctrico"), new Pokemon("Charmander", "Fuego"), new Pokemon("Squirtle", "Agua"), new Pokemon("Vulpix", "Fuego"), new Pokemon("Bulbasaur", "Planta"), new Pokemon("Flareon", "Fuego"));
        List<String> resultado = pokemons.stream()
                                         .filter(p -> p.getTipo().equals("Fuego"))
                                         .map(Pokemon::getNombre) //Necesario para poder obtener el nombre de los pokemons
                                         .toList();
        System.out.println(resultado);    
    }
}
```

**Captura de ejecución:**

![alt text](/src/main/dosw/semana_2/images/Semana2-Ejercicio1.png)

**Explicación:** Realizamos el filtrado de los pokemones tipo Fuego usando el metodo `filter()` y llamando al metodo `getTipo()`. Y usamos un `map()` para poder transformar de clase Pokemon a clase String y poder guardarlos en la lista.

### Ejercicio 02 - Pokédex Gritona

Transformar todos los nombres de Pokémon a mayúsculas.

**Código implementado:**

```
public class Ejercicio2 {
    public static void main(String[] args) {
        List<String> nombres = List.of("Pikachu", "Charmander", "Squirtle", "Bulbasaur" );
        List<String> resultado = nombres.stream()
                                        .map(String::toUpperCase)
                                        .toList();
        System.out.println(resultado);
    }
}
```

**Captura de ejecución:**

![alt text](/src/main/dosw/semana_2/images/Semana2-Ejercicio2.png)

**Explicación:** Usando el metodo `map()` de los streams, podemos transformar la lista de nombres a mayusculas con el metodo `toUpperCase()` que tiene integrado la clase String.

### Ejercicio 03 - Poder Total del Equipo

Dada una lista de niveles de Pokémon, calcular la suma total de niveles del equipo. 

**Código implementado:**

```
public class Ejercicio3 {
    public static void main(String[] args) {
        List<Integer> niveles = List.of(45, 62, 38, 71, 55, 29);
        int resultado = niveles.stream().reduce(0, Integer::sum);
        System.out.println(resultado);
    }
}
```

**Captura de ejecución:**

![alt text](/src/main/dosw/semana_2/images/Semana2-Ejercicio3.png)

**Explicación:** Usando el metodo `reduce()` para sumar los elementos de la lista de niveles, y utilizando azucar sintactico podemos reducir la expresión a `Integer::sum`.

### Ejercicio 04 - Pokémon Alfa

Encontrar el Pokémon con el nivel más alto dentro del equipo.

**Código implementado:**

```
public class Ejercicio4 {
    public static void main(String[] args) {
        List<Pokemon> pokemons = List.of(new Pokemon("Pikachu", null, 45), new Pokemon("Charmander", null, 62), new Pokemon("Squirtle", null, 32), new Pokemon("Snorlax", null, 90), new Pokemon("Mewtwo", null, 88));
        Pokemon resultado = pokemons.stream().max(Comparator.comparingInt(Pokemon::getNivel)).orElse(null);
        System.out.println("Pokémon Alfa: " + resultado.getNombre() + " (nivel " + resultado.getNivel() + ")");
    }
}

```

**Captura de ejecución:**

![alt text](/src/main/dosw/semana_2/images/Semana2-Ejercicio4.png)

**Explicación:** Usando el metodo `max()` de streams y un `Comparator` podemos comparar todos los pokemons de la lista por su nivel. Y resultara un pokemon el cual tiene el nivel mas alto.

### Ejercicio 05 - Pokémon Legendarios

Contar cuántos Pokémon del equipo tienen nivel superior a 80.

**Código implementado:**

```
public class Ejercicio5 {
    public static void main(String[] args) {
        List<Pokemon> pokemons = List.of(new Pokemon("Pikachu", null, 45), new Pokemon("Mewtwo", null, 88), new Pokemon("Dragonite", null, 82), new Pokemon("Squirtle", null, 38), new Pokemon("Mew", null, 85), new Pokemon("Charmander", null, 62));
        long resultado = pokemons.stream()
                             .filter(p -> p.getNivel() > 80)
                             .count();
        System.out.println("Pokémon con nivel > 80: " + resultado);
    }
}
```

**Captura de ejecución:**

![alt text](/src/main/dosw/semana_2/images/Semana2-Ejercicio5.png)

**Explicación:** Primero realizamos el filtrado de los pokemons con el metodo `filter()` para verificar que pokemons tienen nivel superior a 80. Y realizamos un `count()` posterior a ese filtrado.

### Ejercicio 06 - Pokédex Sin duplicados

Dada una lista de Pokémon con elementos repetidos, generar una nueva colección donde cada Pokémon aparezca una sola vez. 

**Código implementado:**

```
public class Ejercicio6 {
    public static void main(String[] args) {
        List<String> pokemons = List.of("Pikachu","Charmander","Pikachu","Squirtle","Charmander","Mewtwo");
        List<String> resultado = pokemons.stream().distinct().toList();
        System.out.println(resultado);
    }
}
```

**Captura de ejecución:**

![alt text](/src/main/dosw/semana_2/images/Semana2-Ejercicio5.png)

**Explicación:** Usamos el metodo `distinct()` de los streams, para eliminar los elementos repetidos y el `toList()` para generar la nueva colección donde cada Pokemón aparece una sola vez.

### Ejercicio 07 - Orden del Profesor Oak

El Profesor Oak quiere su Pokédex organizada. Ordenar alfabéticamente los nombres de los Pokémon.

**Código implementado:**

```
public class Ejercicio7 {
    public static void main(String[] args) {
        List<String> pokemons = List.of("Squirtle","Pikachu","Mewtwo","Bulbasaur","Charmander","Abra");
        List<String> pokemonsOrdenado = pokemons.stream().sorted().toList();
        System.out.println(pokemonsOrdenado);
    }
}
```
**Captura de ejecución:**

![alt text](/src/main/dosw/semana_2/images/Semana2-Ejercicio7.png)

**Explicación:** Utilizando el metodo `sorted()` podemos ordenar de manera alfabetica la Pokédex del Profesor Oak. (No es necesario un argumento en `sorted()` ya que por defecto organiza en orden alfabetico).

### Ejercicio 08 - Evoluciones Preparadas

Dada una lista de Pokémon que incluye si pueden evolucionar (boolean puedeEvolucionar), obtener únicamente los que estén listos para evolucionar. 

**Código implementado:** 

```
public class Ejercicio8 {
    public static void main(String[] args) {
        List<Pokemon> pokemons = List.of(new Pokemon("Pikachu", true), new Pokemon("Raichu", false), new Pokemon("Charmander", true), new Pokemon("Charizard", false), new Pokemon("Squirtle", true), new Pokemon("Blastoise", false));
        List<Pokemon> listaEvolucion = pokemons.stream().filter(p -> p.puedeEvolucionar()).toList();
        System.out.println("Listos para evolucionar:");
        System.out.print(listaEvolucion);
    }
}
```
**Captura de ejecución:**

![alt text](/src/main/dosw/semana_2/images/Semana2-Ejercicio8.png)

**Explicación:** Usamos el metodo `filter()` para filtrar los Pokémon que esten listos para evolucionar, utilizando el metodo implementado de la clase Pokemon: `puedeEvolucionar()`.

### Ejercicio 09 - Equipo Élite

Mostrar únicamente los Pokémon cuyo poderCombate sea superior a 500. 

**Código implementado:** 

```
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
```

**Captura de ejecución:** 

![alt text](/src/main/dosw/semana_2/images/Semana2-Ejercicio9.png)

**Explicación:** Usando el metodo `filter()` podemos filtrar de nuestra lista de Pokémon por poder de combate cuando es superior a 500.

### Ejercicio 10 - Pokédex Compacta

Generar una lista que contenga únicamente los nombres de todos los Pokémon del equipo.

**Código implementado:**

```
public class Ejercicio10 {
    public static void main(String[] args) {
        List<Pokemon> pokemons = List.of(
            new Pokemon(1,"Pikachu", "Eléctrico", 0, 320, "", false),
            new Pokemon(2,"Mewtwo", "Psíquico", 0, 680, "", false),
            new Pokemon(3,"Dragonite", "Dragon-Volador", 0, 530, "", false),
            new Pokemon(4,"Squirtle", "Agua", 0, 210, "", false),
            new Pokemon(5,"Gengar", "Fantasma-Veneno", 0, 495, "", false),
            new Pokemon(6,"Charizard", "Fuego-Volador", 0, 610, "", false)
        );
        List<String> nombresPokemon = pokemons.stream()
                                              .map(Pokemon::getNombre)
                                              .collect(Collectors.toList());
        System.out.println(nombresPokemon);
    }
}
```

**Captura de ejecución:**

![alt text](/src/main/dosw/semana_2/images/Semana2-Ejercicio10.png)

**Explicación:** Usando el metodo `map()` podemos transforar los pokemons de clase Pokemon a String, y usando un `collect()` generamos una lista que contenga solo los nombres.

### Ejercicio 11 - Poder Promedio

Calcular el promedio de poderCombate de todos los Pokémon del equipo.

**Código implementado:** 

```
public class Ejercicio11 {
    public static void main(String[] args) {
        List<Pokemon> pokemons = List.of(
            new Pokemon(1,"Pikachu", "Eléctrico", 0, 320, "", false),
            new Pokemon(2,"Mewtwo", "Psíquico", 0, 680, "", false),
            new Pokemon(3,"Dragonite", "Dragon-Volador", 0, 530, "", false),
            new Pokemon(4,"Squirtle", "Agua", 0, 210, "", false),
            new Pokemon(5,"Gengar", "Fantasma-Veneno", 0, 495, "", false),
            new Pokemon(6,"Charizard", "Fuego-Volador", 0, 610, "", false)
        );
        double promedioPoderCombate = pokemons.stream()
                                              .mapToDouble(Pokemon::getPoderCombate)
                                              .average()
                                              .orElse(0.0);
        System.out.println("Poder de combate promedio: " + promedioPoderCombate);
    }
}
```

**Captura de ejecución:** 

![alt text](/src/main/dosw/semana_2/images/Semana2-Ejercicio11.png)

**Explicación:** Usando el metodo `mapToDouble()` (que esta especializado para trabajar con los datos primitivos double), obtenemos el poderCombate de cada Pokémon. Con el metodo `average()` calculamos automaticamente el promedio del poderCombate (es necesario agregar el `orElse()` para que sepa que valor tomar en caso que la lista este vacia).

### Ejercicio 12 - Campeón Regional

Obtener el Pokémon con mayor poderCombate de toda la lista.

**Código implementado:**

```
public class Ejercicio12 {
    public static void main(String[] args) {
        List<Pokemon> pokemons = List.of(
            new Pokemon(1,"Pikachu", "Eléctrico", 0, 320, "", false),
            new Pokemon(2,"Mewtwo", "Psíquico", 0, 680, "", false),
            new Pokemon(3,"Dragonite", "Dragon-Volador", 0, 530, "", false),
            new Pokemon(4,"Charizard", "Fuego-Volador", 0, 610, "", false)
        );
        Pokemon pokemonMayorPoderCombate = pokemons.stream()
                                                   .max(Comparator.comparing(Pokemon::getPoderCombate))
                                                   .orElse(null);
        System.out.println("Campeón: "+ pokemonMayorPoderCombate + " con PC: " + pokemonMayorPoderCombate.getPoderCombate());
    }
}
```

**Captura de ejecución:** 

![alt text](/src/main/dosw/semana_2/images/Semana2-Ejercicio12.png)

**Explicación:** Usando el metodo `max()` podemos saber cuál es el Pokémon con mayor poderCombate, utilizando tambien el comparador `comparing(Pokemon::getPoderCombate)` para obtener el poderCombate de los Pokémon.

### Ejercicio 13 - Organizar por Tipo

Agrupar todos los Pokémon por su tipo y mostrar el listado por grupo.

**Código implementado:**

```
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
    }
}
```

**Captura de ejecución:**

![alt text](/src/main/dosw/semana_2/images/Semana2-Ejercicio13.png)

**Explicación:** Para poder implementar el metodo `groupingBy()` debe estar primero un `collect(Collectors.groupingBy)` y como argumento podemos definir el tipo de los Pokémon y este hará la agrupación por defecto.

### Ejercicio 14 - Organizar por Región

Agrupar los Pokémon según su región de origen.

**Código implementado:**

```
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

```

**Captura de ejecución:**

![alt text](/src/main/dosw/semana_2/images/Semana2-Ejercicio14.png)

**Explicación:** Para poder implementar el metodo `groupingBy()` debe estar primero un `collect(Collectors.groupingBy)` y como argumento podemos definir la región de los Pokémon y este hará la agrupación por defecto.

### Ejercicio 15 - Maestro de Gimnasios

Dado un listado de entrenadores con sus medallas, encontrar el entrenador con más medallas.

**Código implementado:** 

```
public class Ejercicio15 {
    public static void main(String[] args) {
        List<Entrenador> entrenadores = List.of(
            new Entrenador((long) 1, "Ash", 8, null),
            new Entrenador((long) 2, "Misty", 5, null),
            new Entrenador((long) 3, "Brock", 6, null),
            new Entrenador((long) 4, "Gary", 10, null)
        );
        Entrenador maestroGimnasios = entrenadores.stream()
                                                  .max(Comparator.comparing(Entrenador::getMedallas))
                                                  .orElse(null);
        System.out.println("Campeón de gimnasios: " + maestroGimnasios.getNombre());
        System.out.println("Medallas obtenidas: " + maestroGimnasios.getMedallas());
    }
}
```

**Captura de ejecución:**

![alt text](/src/main/dosw/semana_2/images/Semana2-Ejercicio15.png)

**Explicación:** Usando el metodo `max()` podemos saber cuál es el Entrenador con más medallas, utilizando tambien el comparador `comparing(Entrenador::getMedallas)` para poder comparar a los entrenadores por medallas

### Ejercicio 16 - Entrenadores Experimentados

Mostrar únicamente los entrenadores que posean más de 5 medallas.

**Código implementado:**
```
public class Ejercicio16 {
    public static void main(String[] args) {
        List<Entrenador> entrenadores = List.of(
            new Entrenador((long) 1, "Ash", 8, null),
            new Entrenador((long) 2, "Misty", 5, null),
            new Entrenador((long) 3, "Brock", 6, null),
            new Entrenador((long) 4, "Gary", 10, null),
            new Entrenador((long) 5, "May", 3, null),
            new Entrenador((long) 6, "Dawn", 7, null)
        );
        List<Entrenador> entrenadoresExperimentados = entrenadores.stream()
                                                                  .filter(p -> p.getMedallas() > 5)
                                                                  .toList();
        System.out.println("Entrenadores con > 5 medallas: ");
        System.out.println(entrenadoresExperimentados);
    }
}

```
**Captura de ejecución:** 

![alt text](/src/main/dosw/semana_2/images/Semana2-Ejercicio16.png)

**Explicación:** Utilizando el metodo `filter()` podemos filtrar de nuestra lista de entrenadores con la expresión lambda `p -> p.getMedallas() > 5` para cumplir nuestra condición de mostrar únicamente los entrenadores que posean más de 5 medallas.

### Ejercicio 17 - Equipo Más Poderoso

Calcular cuál entrenador tiene la suma total de poderCombate más alta entre todos sus Pokémon.

**Código implementado:**

```
public class Ejercicio17 {
    public static void main(String[] args) {
        List<Pokemon> equipoAsh = Arrays.asList(
            new Pokemon(1, "Pikachu", "Eléctrico", 50, 850.0, "Kanto", false),
            new Pokemon(2, "Charizard", "Fuego", 60, 1000.0, "Kanto", false)
        );
        List<Pokemon> equipoGary = Arrays.asList(
            new Pokemon(3, "Blastoise", "Agua", 65, 1200.0, "Kanto", false),
            new Pokemon(4, "Arcanine", "Fuego", 58, 1140.0, "Kanto", false)
        );
        List<Pokemon> equipoBrock = Arrays.asList(
            new Pokemon(5, "Onix", "Roca", 45, 750.0, "Kanto", false),
            new Pokemon(6, "Geodude", "Roca", 40, 920.0, "Kanto", false)
        );

        List<Entrenador> entrenadores = List.of(new Entrenador((long) 1, "Ash", 0, equipoAsh), new Entrenador((long) 2, "Gary", 0, equipoGary), new Entrenador((long) 3, "Brock", 0, equipoBrock));

        Entrenador masPoderoso = entrenadores.stream().max(Comparator.comparingDouble(entrenador -> entrenador.getEquipo().stream().mapToDouble(Pokemon::getPoderCombate).sum())).orElse(null);
        double poderTotal = masPoderoso.getEquipo().stream().mapToDouble(Pokemon::getPoderCombate).sum();

        System.out.println("Entrenador más poderoso: " + masPoderoso.getNombre());
        System.out.println("Poder acumulado del equipo: " + poderTotal);
    }
}

```
**Captura de ejecución:** 

![alt text](/src/main/dosw/semana_2/images/Semana2-Ejercicio17.png)

**Explicación:** Al solicitarnos la suma total más alta, el método `max()` en el que como argumento tenemos un comparador que realiza un segundo stream sobre la lista de Pokémon de cada entrenador y poder calcular la suma del poderCombate con los metodos `mapToDouble()` y `sum()`.


### Ejercicio 18 - Top 5 Pókemon Más Fuertes

Generar un ranking de los cinco Pokémon con mayor poderCombate de toda la Pokédex.

**Código implementado:**

```
public class Ejercicio18 {
    public static void main(String[] args) {
        List<Pokemon> pokedex = Arrays.asList(
            new Pokemon(1, "Bulbasaur", "Planta/Veneno", 15, 150.0, "Kanto", false),
            new Pokemon(2, "Charizard", "Fuego/Volador", 65, 610.0, "Kanto", false),
            new Pokemon(3, "`kachu", "Eléctrico", 45, 320.0, "Kanto", false),
            new Pokemon(4, "Rayquaza", "Dragón/Volador", 75, 100.0, "Hoenn", true),
            new Pokemon(5, "Gengar", "Fantasma/Veneno", 58, 495.0, "Kanto", false),
            new Pokemon(6, "Lucario", "Lucha/Acero", 50, 420.0, "Sinnoh", false),
            new Pokemon(7, "Mewtwo", "Psíquico", 70, 680.0, "Kanto", true),
            new Pokemon(8, "Snorlax", "Normal", 55, 460.0, "Kanto", false),
            new Pokemon(9, "Dragonite", "Dragón/Volador", 62, 530.0, "Kanto", false),
            new Pokemon(10, "Gyarados", "Agua/Volador", 60, 480.0, "Kanto", false)
        );
        List<Pokemon> ranking = pokedex.stream()
                                       .sorted(Comparator.comparing(Pokemon::getPoderCombate).reversed())
                                       .limit(5)
                                       .toList();

        IntStream.range(0, ranking.size()).forEach(i -> {
            Pokemon p = ranking.get(i);
            System.out.printf("#%d %-12s - PC: %.0f%n", (i + 1), p.getNombre(), p.getPoderCombate());
        });
    }
}
```

**Captura de ejecución:** 

![alt text](/src/main/dosw/semana_2/images/Semana2-Ejercicio18.png)

**Explicación:** Utilizando el método `sorted()` y un comparador para poder comparar el poder de combate de cada Pokémon, además aplicamos un `reversed()` para que el ordenamiento lo haga de manera descendente. Agregamos un `limit(5)` para limitar el resultado a los primeros 5 Pokémon

### Ejercicio 19 - Top 3 Entrenadores

Generar un ranking de los 3 mejores entrenadores considerando: 1° más medallas, 2° mayor poder acumulando, 3° orden alfabético como criterio de desempate

**Código implementado:**

```
public class Ejercicio19 {
    public static void main(String[] args) {
        List<Pokemon> equipoGary = List.of(
            new Pokemon(1L, "Blastoise", "Agua", 65, 1200.0, "Kanto", false),
            new Pokemon(2L, "Arcanine", "Fuego", 58, 1140.0, "Kanto", false)
        );
        List<Pokemon> equipoAsh = List.of(
            new Pokemon(3L, "Pikachu", "Eléctrico", 50, 850.0, "Kanto", false),
            new Pokemon(4L, "Charizard", "Fuego", 60, 1000.0, "Kanto", false)
        );
        List<Pokemon> equipoDawn = List.of(
            new Pokemon(5L, "Empoleon", "Agua/Acero", 62, 1100.0, "Sinnoh", false),
            new Pokemon(6L, "Mamoswine", "Hielo/Tierra", 59, 1000.0, "Sinnoh", false)
        );
        List<Pokemon> equipoBrock = List.of(
            new Pokemon(7L, "Onix", "Roca", 45, 750.0, "Kanto", false),
            new Pokemon(8L, "Geodude", "Roca", 40, 920.0, "Kanto", false)
        );
        List<Entrenador> entrenadores = List.of(
            new Entrenador(1L, "Brock", 6, equipoBrock),
            new Entrenador(2L, "Gary", 10, equipoGary),
            new Entrenador(3L, "Dawn", 7, equipoDawn),
            new Entrenador(4L, "Ash", 8, equipoAsh)
        );

        List<Entrenador> rankingEntrenadores = entrenadores.stream()
                                                           .sorted(Comparator.comparingInt(Entrenador::getMedallas).reversed()
                                                                   .thenComparing(Comparator.comparingDouble(entrenador -> entrenador.getEquipo().stream().mapToDouble(Pokemon::getPoderCombate).sum()))
                                                                   .thenComparing(Comparator.comparing(Entrenador::getNombre)))
                                                           .limit(3)
                                                           .toList();
        IntStream.range(0, rankingEntrenadores.size())
            .forEach(i -> {
                Entrenador e = rankingEntrenadores.get(i);
                double poderTotal = e.getEquipo().stream().mapToDouble(Pokemon::getPoderCombate).sum();
                System.out.printf("#%d %-6s - %d medallas, PC: %.0f%n", 
                    (i + 1), e.getNombre(), e.getMedallas(), poderTotal);
            });
    }
}
```

**Captura de ejecución:**

![alt text](/src/main/dosw/semana_2/images/Semana2-Ejercicio19.png)

**Explicación:** Utilizando el metodo `sorted()` podemos utilizar más de un criterio de orden, con el metodo `thenComparing()`. Además utilizamos al final el `limit(3)` para obtener solo los primeros 3.

### Ejercicio 20 - Pokédex Analítica

Construir una estructura que muestre: cantidad de Pokémon por tipo, por región, cantidad de legendarios, promedio de nivel y el Pokémon más fuerte. Todo usando únicamente Streams.

**Código implementado:**

```
public class Ejercicio20 {
    public static void main(String[] args) {
        List<Pokemon> pokemons = List.of(
            new Pokemon(1L, "Charizard", "Fuego", 65, 610.0, "Kanto", false),
            new Pokemon(2L, "Arcanine", "Fuego", 58, 550.0, "Kanto", false),
            new Pokemon(3L, "Blaziken", "Fuego", 60, 580.0, "Hoenn", false),
            new Pokemon(4L, "Infernape", "Fuego", 55, 530.0, "Sinnoh", false),
            new Pokemon(5L, "Blastoise", "Agua", 62, 590.0, "Kanto", false),
            new Pokemon(6L, "Gyarados", "Agua", 60, 570.0, "Kanto", false),
            new Pokemon(7L, "Greninja", "Agua", 58, 560.0, "Kalos", false),
            new Pokemon(8L, "Mewtwo", "Psíquico", 70, 680.0, "Kanto", true),
            new Pokemon(9L, "Rayquaza", "Dragón", 75, 700.0, "Hoenn", true),
            new Pokemon(10L, "Tyranitar", "Siniestro", 61, 600.0, "Johto", false)
        );
        
        Map<String, Long> porTipo = pokemons.stream().collect(Collectors.groupingBy(Pokemon::getTipo, Collectors.counting()));
        Map<String, Long> porRegion = pokemons.stream().collect(Collectors.groupingBy(Pokemon::getRegion, Collectors.counting()));
        long cantidadLegendarios = pokemons.stream().filter(Pokemon::Eslegendario).count();
        double promedioNivel = pokemons.stream().collect(Collectors.averagingDouble(Pokemon::getNivel));
        Pokemon masFuerte = pokemons.stream().max(Comparator.comparingDouble(Pokemon::getPoderCombate)).orElse(null);

        System.out.println("Por tipo:     " + porTipo);
        System.out.println("Por región:   " + porRegion);
        System.out.println("Legendarios:  " + cantidadLegendarios);
        System.out.printf("Promedio niv: %.1f%n", promedioNivel);
        System.out.printf("Más fuerte:   %s (PC: %.0f)%n", masFuerte.getNombre(), masFuerte.getPoderCombate());
    }
}
```

**Captura de ejecución:**

![alt text](/src/main/dosw/semana_2/images/Semana2-Ejercicio20.png)

**Explicación:** Se utilizó la estructura de `Map` para las agrupaciones, porque es el que está por defecto en el método `groupingBy()`. Además de utilizar el metodo `counting()` para contabilizar la cantidad de elementos de las agrupaciones generadas.



# SEMANA No 4 - Taller 4 (Patrones de diseño combinados)

## Ejercicio 01 - PlataformaPagosInteligentes

### Rol de cada patrón

- **Strategy:** Encapsula cada algoritmo de pago en clases independientes (TarjetaStrategy, PseStrategy, NequiStrategy). El Checkout trabaja con la interfaz PaymentStrategy sin importar qué medio se use.

- **Factory Method:** Crea el proveedor correcto según el país del usuario. ColombiaPaymentFactory, UsaPaymentFactory. El cliente no sabe qué objeto concreto se construye.

### Interacción entre patrones

El usuario selecciona su país -> Factory construye el gateway correcto -> ese gateway implementa PaymentStrategy -> el Checkout llama strategy.process(amount). 
La Factory decide qué Strategy instanciar; el Checkout nunca cambia.

### Justificación

Sin Factory, el Checkout conocería qué Strategy instanciar, generando acoplamiento. Sin Strategy, cada medio de pago tendría lógica dispersa en el Checkout. La combinación permite:

- Bajo acoplamiento: Checkout solo conoce la interfaz

- Alta cohesión: Cada clase tiene una sola responsabilidad

- Extensibilidad: Nuevos países o medios solo requieren nuevas clases

### Esquema de codigo

![alt text](/src/main/dosw/semana_4/taller4/Ejercicio01_PlataformaPagosInteligentes/DiagramaClase.drawio.png)

### Demostración de ejecución

![alt text](/src/main/dosw/semana_4/taller4/Ejercicio01_PlataformaPagosInteligentes/Ejercicio01.png)


## Ejercicio 02 - Sistemas de notificaciones Multicanal

### Rol de cada patron

- **Observer:** Desacopla el Pedido de los canales. El Pedido es el Subject. EmailNotifier, SmsNotifier y PushNotifier son Observers. Agregar un canal nuevo no modifica el Pedido.

- **Factory Method:** Crea el mensaje correcto para cada canal. EmailMessageFactory genera HTML, SmsMessageFactory genera texto plano de 160 chars, PushMessageFactory genera payload JSON.

### Interacción entre patrones

El Pedido cambia de estado -> notifica a todos los Observers activos -> cada Observer llama a su Factory para construir el mensaje correcto para ese canal -> envía.

### Justificación

Sin Factory, cada Observer construiría el mensaje a su manera con lógica dispersa. Sin Observer, el Pedido conocería todos los canales. La combinación permite:

- Desacoplamiento: El Pedido no conoce los canales

- Reutilización: La construcción del mensaje está centralizada

- Extensibilidad: Nuevos canales solo requieren nuevas clases

### Esquema de codigo

![alt text](/src/main/dosw/semana_4/taller4/Ejercicio02_SistemaNotificaciones/DiagramaClase.drawio.png)

### Demostración de ejecución

![alt text](/src/main/dosw/semana_4/taller4/Ejercicio02_SistemaNotificaciones/Ejercicio02.png)


## Ejercicio 03 - Sistema de reportes empresariales

### Rol de cada patron

- **Template Method:** Define la estructura del algoritmo en la clase base ReportGenerator con un método final generate() que llama en orden los 4 pasos. Las subclases sobreescriben solo los pasos variables (applyFormat, export).

- **Factory Method:** Crea la instancia correcta según la solicitud. ReportFactory.create('PDF') retorna PdfReport. ReportFactory.create('CSV') retorna CsvReport. El cliente no instancia directamente.

### Interacción entre patrones

El cliente pide 'reporte PDF' -> Factory construye PdfReport -> el cliente llama report.generate() -> Template Method ejecuta los 4 pasos en orden, usando la implementación PDF para los pasos variables.

### Justificación

Sin Template Method, cada formato repetiría el flujo completo. Sin Factory, el cliente instanciaría directamente las clases concretas. La combinación permite:

- Reutilización: Los pasos fijos se implementan una sola vez

- Consistencia: Todos los reportes siguen el mismo flujo

- Desacoplamiento: El cliente solo conoce la Factory

### Esquema de codigo

![alt text](/src/main/dosw/semana_4/taller4/Ejercicio03_SistemaReportesEmpresarial/DiagramaClase.png)

### Demostración de ejecución

![alt text](/src/main/dosw/semana_4/taller4/Ejercicio03_SistemaReportesEmpresarial/Ejercicio03.png)



## Ejercicio 04 - Plataforma de Videojuegos

### Rol de cada patron

- **Builder:** Construye el personaje paso a paso al inicio. WarriorBuilder permite setArmor().setWeapon().setSkill(). El Director puede construir arquetipos predefinidos (guerrero élite, mago de fuego). Evita constructores con 10 parámetros.

- **Decorator:** Agrega poderes dinámicamente sin modificar la clase base del personaje. ShieldDecorator, SpeedDecorator e InvisibilityDecorator envuelven el personaje y añaden comportamiento en runtime.

### Interacción entre patrones

Builder crea el personaje base configurable -> durante la partida, Decorator envuelve el personaje con poderes temporales ->  al terminar el efecto, el wrapper se descarta sin afectar la clase base del personaje.

### Justificación

Sin Decorator: 2^5 = 32 subclases para 5 poderes combinables. Con Decorator: 5 wrappers + 1 base = 6 clases. La explosión combinatoria es la señal inequívoca para usar Decorator.

### Esquema de codigo

![alt text](/src/main/dosw/semana_4/taller4/Ejercicio04_PlataformaVideojuegos/DiagramaClase.drawio.png)

### Demostración de ejecución

![alt text](/src/main/dosw/semana_4/taller4/Ejercicio04_PlataformaVideojuegos/Ejercicio04.png)


## Ejercicio 05 - Integración con Sistema Bancario Antiguo

### Rol de cada patron

- **Adapter:** 	Hace que LegacyBankService sea compatible con la interfaz PaymentProcessor. LegacyBankAdapter implementa PaymentProcessor e internamente traduce las llamadas: amount -> cents, pay() -> executeTransaction().

- **Facade:** Expone un método simple procesarPago(monto) que internamente orquesta los 8 pasos de inicialización y uso del LegacyBankService (o del Adapter). Los desarrolladores usan la Facade y no conocen los detalles.

### Interacción entre patrones

Desarrollador llama BankFacade.procesarPago(monto) -> Facade inicializa conexión, sesión y contexto -> delega al LegacyBankAdapter -> Adapter traduce al formato legacy -> LegacyBankService ejecuta. El desarrollador nunca toca LegacyBankService.

### Justificación

Adapter = 'hablar el idioma del otro'. Facade = 'no me cuentes todo, dame lo simple'. Puedes tener ambos: la Facade usa el Adapter internamente. Son complementarios, no excluyentes.

### Esquema de codigo

![alt text](/src/main/dosw/semana_4/taller4/Ejercicio05_IntegracoinSistemasBancarios/DiagramaClase.drawio.png)

### Demostración de ejecución

![alt text](/src/main/dosw/semana_4/taller4/Ejercicio05_IntegracoinSistemasBancarios/Ejercicio05.png)


## Ejercicio 06 - Motor de recomendaciones

### Rol de cada patron

- **Strategy:** 	Permite intercambiar el algoritmo de recomendación en tiempo de ejecución. GenreStrategy, HistoryStrategy, PopularityStrategy y SimilarityStrategy implementan RecommendationAlgorithm.

- **Observer:** Notifica automáticamente a todos los componentes cuando cambian las preferencias. HomePageComponent, NotificationService y SuggestedListComponent son Observers del evento 'preferencias cambiadas'.

### Interacción entre patrones

Usuario cambia preferencias -> el perfil de usuario es el Subject, notifica a sus Observers -> cada Observer reactualiza su contenido usando el nuevo algoritmo Strategy que fue configurado -> la UI se actualiza sin polling.

### Justificación

Strategy responde 'cómo recomendar'; Observer responde 'a quién avisar que cambió el cómo'. Son ortogonales: cambiar el algoritmo (Strategy) dispara el aviso (Observer) a los componentes que deben re-renderizarse.

### Esquema de codigo

![alt text](/src/main/dosw/semana_4/taller4/Ejercicio06_MotorRecomendaciones/DiagramaClase.drawio.png)

### Demostración de ejecución

![alt text](/src/main/dosw/semana_4/taller4/Ejercicio06_MotorRecomendaciones/Ejercicio06.png)


## Ejercicio 07 - Flujo de Aprobración de Documentos

### Rol de cada patron

- **Chain of Responsability:** Encadena los validadores. Cada handler (AutorHandler, LiderHandler, JuridicoHandler) decide si procesa el documento o lo pasa al siguiente. La cadena puede configurarse distinto según el tipo de documento.

- **State:** Maneja las transiciones de estado del documento. DraftState, InReviewState, ApprovedState, RejectedState. Cada estado sabe a qué estado puede transicionar y qué operaciones permite. Elimina los switch/if de estado.

### Interacción entre patrones

Un handler de la cadena procesa el documento -> según su resultado, invoca document.approve() o document.reject() -> el objeto State actual del documento ejecuta la transición correspondiente -> el documento nunca tiene un switch de estados.

### Justificación

Sin State: cada método de Document tendría switch(estado){case DRAFT: ... case IN_REVIEW:...}. Con State: cada estado encapsula su propio comportamiento. El documento no sabe en qué estado está — su estado sabe qué hacer.

### Esquema de codigo

![alt text](/src/main/dosw/semana_4/taller4/Ejercicio07_FlujoAprobacionDocumentos/DiagramaClase.drawio.png)

### Demostración de ejecución

![alt text](/src/main/dosw/semana_4/taller4/Ejercicio07_FlujoAprobacionDocumentos/Ejercicio07.png)



## Ejercicio 08 - Sistema de pedidos de Restaurante

### Rol de cada patron

- **Builder:** Construye el pedido personalizado paso a paso. OrderBuilder permite setSize().setMeat().setToppings().addSide(). El pedido resultante es inmutable una vez construido. Evita el constructor caótico con todos los ingredientes.

- **Observer:** Notifica a los subsistemas cuando el pedido se confirma. KitchenService, BillingService y DeliveryService son Observers. El pedido solo hace pedido.confirm() - no sabe a quién avisar.

### Interacción entre patrones

Cliente configura el pedido con Builder -> llama build() que retorna un Order inmutable -> el sistema hace order.confirm() -> el Order notifica a todos sus Observers -> cada subsistema reacciona de manera independiente.

### Justificación

Builder garantiza que el pedido esté completo y válido antes de existir (invariantes en build()). Observer garantiza que la confirmación desencadene reacciones sin acoplamiento. Son momentos distintos del ciclo de vida del pedido.

### Esquema de codigo

![alt text](/src/main/dosw/semana_4/taller4/Ejercicio08_SistemaPedidosRestaurante/DiagramaClase.drawio.png)

### Demostración de ejecución

![alt text](/src/main/dosw/semana_4/taller4/Ejercicio08_SistemaPedidosRestaurante/Ejercicio08.png)


## Ejercicio 09 - Sistema de Autenticación Empresarial

### Rol de cada patron

- **Strategy:** Selecciona el mecanismo de autenticación. PasswordStrategy, GoogleStrategy, BiometricStrategy implementan AuthStrategy. El AuthService recibe la estrategia correcta según el tipo de usuario y llama authenticate().

- **Chain of Responsability:** Procesa las validaciones en secuencia. CredentialValidator -> PermissionValidator -> LocationValidator -> TimeValidator. Cada uno decide si pasa al siguiente o lanza un AccessDeniedException.

### Interacción entre patrones

Usuario intenta acceder -> AuthService selecciona la Strategy correcta -> autenticación exitosa -> el resultado pasa por la cadena de validadores -> si todos aprueban, se concede acceso. Strategy decide 'cómo autentico'; Chain decide 'si tengo acceso'.

### Justificación

Strategy = 'qué llave uso para entrar'. Chain = 'pasar los controles de seguridad después de entrar'. Son fases distintas: autenticación (quién eres) -> autorización (qué puedes hacer).

### Esquema de codigo

![alt text](/src/main/dosw/semana_4/taller4/Ejercicio09_SistemaAutenticacionEmpresarial/DiagramaClase.drawio.png)

### Demostración de ejecución

![alt text](/src/main/dosw/semana_4/taller4/Ejercicio09_SistemaAutenticacionEmpresarial/Ejercicio09.png)


## Ejercicio 10 - Aplicación de Edición de Imágenes

### Rol de cada patron

- **Decorator:** Aplica filtros de forma acumulativa. GrayscaleDecorator, SepiaDecorator, BrightnessDecorator envuelven la imagen. Se pueden apilar en cualquier orden. Agregar un filtro nuevo no modifica los existentes.

- **Command:** 	Encapsula cada operación del usuario como un objeto (ApplyFilterCommand, RemoveFilterCommand). El historial de comandos permite undo individual. El comando tiene execute() y undo().

### Interacción entre patrones

Usuario aplica filtro -> se crea un ApplyFilterCommand que envuelve la imagen con un Decorator -> el comando se agrega al historial -> usuario hace undo -> el Command quita el Decorator de la cadena y restaura la imagen anterior.

### Justificación

Command para undo: necesitas dos stacks — uno de 'ejecutados' y uno de 'deshechos'. Decorator para filtros: la imagen base nunca cambia, solo se envuelve. Undo = quitar el último wrapper. Son el complemento perfecto.

### Esquema de codigo

![alt text](/src/main/dosw/semana_4/taller4/Ejercicio10_AplicacionEdicionImagenes/DiagramaClase.drawio.png)

### Demostración de ejecución

![alt text](/src/main/dosw/semana_4/taller4/Ejercicio10_AplicacionEdicionImagenes/Ejercicio10.png)