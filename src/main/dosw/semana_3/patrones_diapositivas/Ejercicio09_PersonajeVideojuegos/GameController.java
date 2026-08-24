package main.dosw.semana_3.patrones_diapositivas.Ejercicio09_PersonajeVideojuegos;

public class GameController {
    
    public GameController(){}
    
    public void pressButton(Command command){
        System.out.println("Presionando boton...");
        command.execute();
        System.out.println("--------------");
    }
}
