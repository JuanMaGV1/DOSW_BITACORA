package main.dosw.semana_3.patrones_diapositivas.Ejercicio09_PersonajeVideojuegos;

public class AttackCommand implements Command{
    
    private GameCharacter character;

    public AttackCommand(GameCharacter character){
        this.character = character;
    }

    @Override
    public void execute() {
        character.attack();
    }
}
