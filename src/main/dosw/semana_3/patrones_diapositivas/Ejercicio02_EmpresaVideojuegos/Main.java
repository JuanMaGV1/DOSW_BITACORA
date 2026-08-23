package main.dosw.semana_3.patrones_diapositivas.Ejercicio02_EmpresaVideojuegos;

public class Main {
    public static void main(String[] args) {
        
        ConsoleFactory factory;

        factory = new PlayStationFactory();
        GameEngine psEngine = new GameEngine(factory);
        psEngine.run();

        System.out.println("----------------");

        factory = new XboxFactory();
        GameEngine xboxEngine = new GameEngine(factory);
        xboxEngine.run();
    }
}
