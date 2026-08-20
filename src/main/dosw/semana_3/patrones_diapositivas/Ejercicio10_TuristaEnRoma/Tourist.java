package main.dosw.semana_3.patrones_diapositivas.Ejercicio10_TuristaEnRoma;

public class Tourist {

    public void exploreTour(Aggregate<Place> route){
        Iterator<Place> iterator = route.createIterator();

        while (iterator.hasNext()) {
            Place p = iterator.next();
            System.out.println("Visiting " + p.getName());
        }
    }
    
}
