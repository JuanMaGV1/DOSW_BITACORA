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

## Ejercicio 03 -

Enunciado del Ejercicio

**Código implementado:** (codigo)
**Captura de ejecucion:** (imagen)
**Explicación:** (breve descripcion de la solucion)

## Ejercicio 04 -

Enunciado del Ejercicio

**Código implementado:** (codigo)
**Captura de ejecucion:** (imagen)
**Explicación:** (breve descripcion de la solucion)

## Ejercicio 05 -

Enunciado del Ejercicio

**Código implementado:** (codigo)
**Captura de ejecucion:** (imagen)
**Explicación:** (breve descripcion de la solucion)


# SEMANA No 2 - Bitácora Pokémon

## Datos de Entrenador:
- Nombre y Apellido: Juan Garzón
- Código de Estudiante: 1000103731
- Curso: DOSW - 4

---

### Ejercicio 01 - Nombre del Ejercicio

Enunciado del Ejercicio

**Código implementado:** (pegar el código aquí)
**Captura de ejecución:** (imagen)
**Explicación:** (breve descripción)

### Ejercicio 02 - Nombre del Ejercicio

Enunciado del Ejercicio

**Código implementado:** (pegar el código aquí)
**Captura de ejecución:** (imagen)
**Explicación:** (breve descripción)

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