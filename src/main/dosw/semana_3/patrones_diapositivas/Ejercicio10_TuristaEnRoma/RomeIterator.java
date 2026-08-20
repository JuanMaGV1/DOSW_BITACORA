package main.dosw.semana_3.patrones_diapositivas.Ejercicio10_TuristaEnRoma;

public class RomeIterator implements Iterator<Place> {
    private int currentIndex = 0;

    //public boolean hasNext() {return currentIndex < places.length;}

    public Place next() {return places[currentIndex++]}
    
}
