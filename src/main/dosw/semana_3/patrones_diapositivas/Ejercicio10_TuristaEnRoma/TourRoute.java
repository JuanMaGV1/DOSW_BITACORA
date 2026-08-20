package main.dosw.semana_3.patrones_diapositivas.Ejercicio10_TuristaEnRoma;

public class TourRoute implements Aggregate<Place>{
    private final Place[] places;

    public TourRoute(){
        places = new Place[] {
            new Place("Colosseum"),
            new Place("Roman Forum"),
            new Place("Trevi Fountain"),
            new Place("Pantheon"),
            new Place("Spanish Steps")
        };
    }

    public Iterator<Place> createIterator(){
        return new RomeIterator();
    }

}

