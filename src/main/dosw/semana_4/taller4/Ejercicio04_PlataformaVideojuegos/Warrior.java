package main.dosw.semana_4.taller4.Ejercicio04_PlataformaVideojuegos;

public class Warrior implements Character{
    private String armor;
    private String weapon;
    private String skill;

    public Warrior(String armor, String weapon, String skill){
        this.armor = armor;
        this.weapon = weapon;
        this.skill = skill;
    }

    @Override
    public void attack() {
        System.out.println("Guerrero ataca con "+ weapon);
    }

    @Override
    public String getDescription() {
        return "Guerrero [Armadura: " + armor + ", Arma: " + weapon + ", Habilidad: " + skill + "]";
    }
}
