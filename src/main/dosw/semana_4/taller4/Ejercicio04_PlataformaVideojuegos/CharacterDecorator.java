package main.dosw.semana_4.taller4.Ejercicio04_PlataformaVideojuegos;

public abstract class CharacterDecorator implements Character{
    protected Character character;

    public CharacterDecorator(Character character){
        this.character = character;
    }

    @Override
    public void attack() {
        character.attack();
    }

    @Override
    public String getDescription() {
        return character.getDescription();
    }
}
