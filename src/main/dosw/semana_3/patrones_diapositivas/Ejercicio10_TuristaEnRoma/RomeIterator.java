package main.dosw.semana_3.patrones_diapositivas.Ejercicio10_TuristaEnRoma;

// Implementacion del iterador para recorrer lugares de Roma
public class RomeIterator implements Iterator<Place> {
    private int currentIndex = 0;
    private Place[] places; // Referencia al array de lugares

    public RomeIterator(Place[] places){
        this.places = places;
    }

    @Override
    public boolean hasNext() {
        return currentIndex <  places.length;
    }

    @Override
    public Place next() {
        return places[currentIndex++];
    }
    
}
