package main.dosw.semana_3.patrones_diapositivas.Ejercicio10_TuristaEnRoma;

// Interfaz que define el contrato para las colecciones que pueden ser iteradas
public interface Aggregate<T> {
    Iterator<T> createIterator();
}
