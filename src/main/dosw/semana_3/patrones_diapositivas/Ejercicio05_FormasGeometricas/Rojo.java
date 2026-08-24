package main.dosw.semana_3.patrones_diapositivas.Ejercicio05_FormasGeometricas;

public class Rojo implements Color{
    @Override
    public void applyColor() {
        System.out.println("aplicando color ROJO");
    }

    @Override
    public String getColorName() {
        return "Rojo";
    }
}
