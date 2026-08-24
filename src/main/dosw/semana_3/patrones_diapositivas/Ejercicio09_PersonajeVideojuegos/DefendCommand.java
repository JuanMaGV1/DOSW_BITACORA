package main.dosw.semana_3.patrones_diapositivas.Ejercicio09_PersonajeVideojuegos;

public class DefendCommand implements Command{
    
    private GameCharacter character;

    public DefendCommand(GameCharacter character){
        this.character = character;
    }

    @Override
    public void execute() {
        character.defend();
    }
}
