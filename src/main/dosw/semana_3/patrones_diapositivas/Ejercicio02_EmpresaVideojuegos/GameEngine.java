package main.dosw.semana_3.patrones_diapositivas.Ejercicio02_EmpresaVideojuegos;

public class GameEngine {
    private Controller controller;
    private Game game;
    private UI ui;

    //Constructor que recibe la fabrica
    public GameEngine(ConsoleFactory consoleFactory){
        this.controller = consoleFactory.creaController();
        this.game = consoleFactory.createGame();
        this.ui = consoleFactory.createUI();
    }

    public void run() {
        System.out.println("\n=== Iniciando Motor del Juego ===\n");
        
        // Ejecutar todos los componentes en orden
        controller.connect();
        System.out.println();
        
        game.start();
        System.out.println();
        
        ui.render();
        System.out.println();
        
        System.out.println("=== Juego en ejecución correctamente ===\n");
    }
}
