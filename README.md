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

![alt text](Semana1-Ejercicio1.png)

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

![alt text](Semana1-Ejercicio2.png)

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

![alt text](Semana1-Ejercicio3.png)

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

![alt text](Semana1-Ejercicio4.png)

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

![alt text](Semana1-Ejercicio5.png)

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

![alt text](Semana2-Ejercicio1.png)

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

![alt text](Semana2-Ejercicio2.png)

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

![alt text](Semana2-Ejercicio3.png)

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

![alt text](Semana2-Ejercicio4.png)

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

![alt text](Semana2-Ejercicio5.png)

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

![alt text](Semana2-Ejercicio5.png)

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

![alt text](Semana2-Ejercicio7.png)

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

![alt text](Semana2-Ejercicio8.png)

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

![alt text](Semana2-Ejercicio9.png)

**Explicación:** Usando el metodo `filter()` podemos filtrar de nuestra lista de Pokémon por poder de combate cuando es superior a 500.

### Ejercicio 10 - Nombre del Ejercicio

Enunciado del Ejercicio

**Código implementado:** (pegar el código aquí)
**Captura de ejecución:** (imagen)
**Explicación:** (breve descripción)

### Ejercicio 11 - Nombre del Ejercicio

Enunciado del Ejercicio

**Código implementado:** (pegar el código aquí)
**Captura de ejecución:** (imagen)
**Explicación:** (breve descripción)

### Ejercicio 12 - Nombre del Ejercicio

Enunciado del Ejercicio

**Código implementado:** (pegar el código aquí)
**Captura de ejecución:** (imagen)
**Explicación:** (breve descripción)

### Ejercicio 13 - Nombre del Ejercicio

Enunciado del Ejercicio

**Código implementado:** (pegar el código aquí)
**Captura de ejecución:** (imagen)
**Explicación:** (breve descripción)

### Ejercicio 14 - Nombre del Ejercicio

Enunciado del Ejercicio

**Código implementado:** (pegar el código aquí)
**Captura de ejecución:** (imagen)
**Explicación:** (breve descripción)

### Ejercicio 15 - Nombre del Ejercicio

Enunciado del Ejercicio

**Código implementado:** (pegar el código aquí)
**Captura de ejecución:** (imagen)
**Explicación:** (breve descripción)

### Ejercicio 16 - Nombre del Ejercicio

Enunciado del Ejercicio

**Código implementado:** (pegar el código aquí)
**Captura de ejecución:** (imagen)
**Explicación:** (breve descripción)

### Ejercicio 17 - Nombre del Ejercicio

Enunciado del Ejercicio

**Código implementado:** (pegar el código aquí)
**Captura de ejecución:** (imagen)
**Explicación:** (breve descripción)

### Ejercicio 17 - Nombre del Ejercicio

Enunciado del Ejercicio

**Código implementado:** (pegar el código aquí)
**Captura de ejecución:** (imagen)
**Explicación:** (breve descripción)

### Ejercicio 18 - Nombre del Ejercicio

Enunciado del Ejercicio

**Código implementado:** (pegar el código aquí)
**Captura de ejecución:** (imagen)
**Explicación:** (breve descripción)

### Ejercicio 19 - Nombre del Ejercicio

Enunciado del Ejercicio

**Código implementado:** (pegar el código aquí)
**Captura de ejecución:** (imagen)
**Explicación:** (breve descripción)

### Ejercicio 20 - Nombre del Ejercicio

Enunciado del Ejercicio

**Código implementado:** (pegar el código aquí)
**Captura de ejecución:** (imagen)
**Explicación:** (breve descripción)