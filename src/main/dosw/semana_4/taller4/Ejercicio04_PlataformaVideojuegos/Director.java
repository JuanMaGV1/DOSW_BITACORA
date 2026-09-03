package main.dosw.semana_4.taller4.Ejercicio04_PlataformaVideojuegos;

public class Director {
    public Character constructEliteWarrior() {
        return new WarriorBuilder()
                .setArmor("steel")
                .setWeapon("sword")
                .setSkill("rage")
                .build();
    }
    
    public Character constructFireMage() {
        return new WarriorBuilder()
                .setArmor("robe")
                .setWeapon("staff")
                .setSkill("fireball")
                .build();
    }
}