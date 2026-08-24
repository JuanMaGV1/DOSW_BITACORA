package main.dosw.semana_3.patrones_diapositivas.Ejercicio09_PersonajeVideojuegos;

public class WalkCommand implements Command{
    
    private GameCharacter character;

    public WalkCommand(GameCharacter character){
        this.character = character;
    }

    @Override
    public void execute() {
        character.walk();
    }
}
