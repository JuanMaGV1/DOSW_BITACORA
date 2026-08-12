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

### Ejercicio 03 - Nombre del Ejercicio

Enunciado del Ejercicio

**Código implementado:** (pegar el código aquí)
**Captura de ejecución:** (imagen)
**Explicación:** (breve descripción)

### Ejercicio 04 - Nombre del Ejercicio

Enunciado del Ejercicio

**Código implementado:** (pegar el código aquí)
**Captura de ejecución:** (imagen)
**Explicación:** (breve descripción)

### Ejercicio 05 - Nombre del Ejercicio

Enunciado del Ejercicio

**Código implementado:** (pegar el código aquí)
**Captura de ejecución:** (imagen)
**Explicación:** (breve descripción)

### Ejercicio 06 - Nombre del Ejercicio

Enunciado del Ejercicio

**Código implementado:** (pegar el código aquí)
**Captura de ejecución:** (imagen)
**Explicación:** (breve descripción)

### Ejercicio 06 - Nombre del Ejercicio

Enunciado del Ejercicio

**Código implementado:** (pegar el código aquí)
**Captura de ejecución:** (imagen)
**Explicación:** (breve descripción)

### Ejercicio 07 - Nombre del Ejercicio

Enunciado del Ejercicio

**Código implementado:** (pegar el código aquí)
**Captura de ejecución:** (imagen)
**Explicación:** (breve descripción)

### Ejercicio 08 - Nombre del Ejercicio

Enunciado del Ejercicio

**Código implementado:** (pegar el código aquí)
**Captura de ejecución:** (imagen)
**Explicación:** (breve descripción)

### Ejercicio 09 - Nombre del Ejercicio

Enunciado del Ejercicio

**Código implementado:** (pegar el código aquí)
**Captura de ejecución:** (imagen)
**Explicación:** (breve descripción)

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