package main.dosw.semana_3.patrones_diapositivas.Ejercicio05_FormasGeometricas;

// Cuadrado - Abstracción refinada
public class Cuadrado extends Forma {
    
    public Cuadrado(Color color) {
        super(color);  // Pasa el color a la clase base
    }
    
    @Override
    public void dibujar() {
        System.out.print("Dibujando un CUADRADO con ");
        color.applyColor();  // Delega en el color
        System.out.println(" - Cuadrado de color " + color.getColorName());
    }
}