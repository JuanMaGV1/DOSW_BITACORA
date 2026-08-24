package main.dosw.semana_3.patrones_diapositivas.Ejercicio10_TuristaEnRoma;

// Interfaz que define el contrato para los iteradores
public interface Iterator<T> {
    boolean hasNext();  // Verifica si hay mas elementos
    T next();           // Obtiene el siguiente elemento
}