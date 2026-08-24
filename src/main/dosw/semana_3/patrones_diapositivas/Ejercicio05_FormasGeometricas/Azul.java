package main.dosw.semana_3.patrones_diapositivas.Ejercicio05_FormasGeometricas;

public class Azul implements Color{
    @Override
    public void applyColor() {
        System.out.println("Aplicando color AZUL");
    }

    @Override
    public String getColorName() {
        return "Azul";
    }
}
