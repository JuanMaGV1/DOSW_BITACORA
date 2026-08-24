package main.dosw.semana_3.patrones_diapositivas.Ejercicio09_PersonajeVideojuegos;

public class JumpCommand implements Command{
    
    private GameCharacter character;

    public JumpCommand(GameCharacter character){
        this.character = character;
    }

    @Override
    public void execute() {
        character.jump();
    }
}
