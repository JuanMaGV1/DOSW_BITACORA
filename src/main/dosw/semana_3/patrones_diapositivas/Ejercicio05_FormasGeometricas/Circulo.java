package main.dosw.semana_3.patrones_diapositivas.Ejercicio05_FormasGeometricas;

// Círculo - Abstracción refinada
public class Circulo extends Forma {
    
    public Circulo(Color color) {
        super(color);  // Pasa el color a la clase base
    }
    
    @Override
    public void dibujar() {
        System.out.print("Dibujando un CÍRCULO con ");
        color.applyColor();  // Delega en el color
        System.out.println(" - Círculo de color " + color.getColorName());
    }
}