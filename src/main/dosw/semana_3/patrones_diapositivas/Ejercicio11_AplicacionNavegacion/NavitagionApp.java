package main.dosw.semana_3.patrones_diapositivas.Ejercicio11_AplicacionNavegacion;

public class NavitagionApp {
    private RouteStrategy routeStrategy;

    public NavitagionApp(RouteStrategy routeStrategy){
        this.routeStrategy = routeStrategy;
    }

    public void setRouteStrategy(RouteStrategy routeStrategy){
        this.routeStrategy = routeStrategy;
        System.out.println("Estrategia de ruta cambiada a: " + routeStrategy.getStrategyName());
    }

    public void startNavigation(){
        System.out.println("Iniciando navegacion...");
        System.out.println("Navegacion iniciada correctamente, con estrategia: " + routeStrategy.getStrategyName());
    }
}
