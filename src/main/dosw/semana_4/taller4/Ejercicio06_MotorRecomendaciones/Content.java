package main.dosw.semana_4.taller4.Ejercicio06_MotorRecomendaciones;

public class Content {
    private int id;
    private String title;
    private String genre;
    
    public Content(int id, String title, String genre) {
        this.id = id;
        this.title = title;
        this.genre = genre;
    }
    
    @Override
    public String toString() {
        return title + " (" + genre + ")";
    }

    public String getGenre(){return genre;}
    public String getTitle(){return title;}
}
