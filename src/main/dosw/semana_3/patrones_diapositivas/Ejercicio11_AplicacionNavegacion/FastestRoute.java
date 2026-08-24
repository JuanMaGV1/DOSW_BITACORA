package main.dosw.semana_3.patrones_diapositivas.Ejercicio11_AplicacionNavegacion;

public class FastestRoute implements RouteStrategy{
    @Override
    public void calculateRoute() {
        System.out.println("Calculando ruta mas rapida...");
    }

    @Override
    public String getStrategyName() {
        return "Ruta panoramica";
    }
}
