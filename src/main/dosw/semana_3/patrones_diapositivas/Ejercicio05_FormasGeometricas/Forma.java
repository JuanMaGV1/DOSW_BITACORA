package main.dosw.semana_3.patrones_diapositivas.Ejercicio05_FormasGeometricas;

// Clase abstracta Forma - La "abstracción" en el patrón Bridge
public abstract class Forma {
    protected Color color;  // Composición: Forma TIENE UN Color
    
    public Forma(Color color) {
        this.color = color;
    }
    
    // Método abstracto que será implementado por las subclases
    public abstract void dibujar();
}