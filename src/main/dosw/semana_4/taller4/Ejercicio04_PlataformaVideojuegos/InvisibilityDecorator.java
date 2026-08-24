package main.dosw.semana_4.taller4.Ejercicio04_PlataformaVideojuegos;

public class InvisibilityDecorator extends CharacterDecorator{
    public InvisibilityDecorator(Character character){
        super(character);
    }

    @Override
    public void attack() {
        System.out.println("Invisibilidad aplicada");
        super.attack();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Invisibilidad";
    }
}
