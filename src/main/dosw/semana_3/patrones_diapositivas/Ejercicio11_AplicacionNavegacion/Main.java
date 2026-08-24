package main.dosw.semana_3.patrones_diapositivas.Ejercicio11_AplicacionNavegacion;

public class Main {
    public static void main(String[] args) {
        NavitagionApp app = new NavitagionApp(new FastestRoute());
        app.startNavigation();

        app.setRouteStrategy(new ScenicRoute());
        app.startNavigation();

        app.setRouteStrategy(new CheapestRoute());
        app.startNavigation();
    }
}
