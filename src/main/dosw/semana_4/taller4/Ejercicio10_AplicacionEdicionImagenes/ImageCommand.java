package main.dosw.semana_4.taller4.Ejercicio10_AplicacionEdicionImagenes;

public interface ImageCommand {
    void execute();
    void undo();
    String getDescription();
}
