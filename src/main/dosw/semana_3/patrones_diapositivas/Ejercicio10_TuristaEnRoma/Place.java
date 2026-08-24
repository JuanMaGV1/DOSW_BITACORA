package main.dosw.semana_3.patrones_diapositivas.Ejercicio10_TuristaEnRoma;

public class Place {
    private final String name;

    public Place(String name){
        this.name = name;
    }

    public String getName(){return name;}

    @Override
    public String toString() {
        return "Place{name='" + name +"'}";
    }
}
