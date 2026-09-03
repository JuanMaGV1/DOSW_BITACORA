package main.dosw.semana_4.taller4.Ejercicio04_PlataformaVideojuegos;

public class SpeedDecorator extends CharacterDecorator{
    public SpeedDecorator(Character character){
        super(character);
    }

    @Override
    public void attack() {
        System.out.println("Velocidad extra activada");
        super.attack();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Velocidad extra";
    }
}
