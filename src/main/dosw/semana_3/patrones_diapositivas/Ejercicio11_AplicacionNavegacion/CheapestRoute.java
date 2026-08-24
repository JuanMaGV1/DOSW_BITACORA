package main.dosw.semana_3.patrones_diapositivas.Ejercicio11_AplicacionNavegacion;

public class CheapestRoute implements RouteStrategy{
    @Override
    public void calculateRoute() {
        System.out.println("Calculando la ruta mas economica...");
    }

    @Override
    public String getStrategyName() {
        return "Ruta mas rapida";
    }
}
