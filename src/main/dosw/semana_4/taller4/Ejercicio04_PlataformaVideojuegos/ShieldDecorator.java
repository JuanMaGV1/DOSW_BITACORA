package main.dosw.semana_4.taller4.Ejercicio04_PlataformaVideojuegos;

public class ShieldDecorator extends CharacterDecorator{
    public ShieldDecorator(Character character){
        super(character);
    }
    
    @Override
    public void attack() {
        System.out.println("Escudo de hielo activado - daño reducido");
        super.attack();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Escudo de hielo";
    }
}
