package main.dosw.semana_3.patrones_diapositivas.Ejercicio10_TuristaEnRoma;

public interface Aggregate<T> {
    Iterator<T> createIterator();
}
