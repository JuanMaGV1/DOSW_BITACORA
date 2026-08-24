package main.dosw.semana_3.patrones_diapositivas.Ejercicio11_AplicacionNavegacion;

public class ScenicRoute implements RouteStrategy{
    @Override
    public void calculateRoute() {
        System.out.println("Calculando ruta Panoramica...");
    }

    @Override
    public String getStrategyName() {
        return "Ruta mas economica";
    }
}
