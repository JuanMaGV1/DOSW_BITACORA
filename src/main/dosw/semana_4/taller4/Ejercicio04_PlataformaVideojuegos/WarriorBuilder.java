package main.dosw.semana_4.taller4.Ejercicio04_PlataformaVideojuegos;

public class WarriorBuilder implements CharacterBuilder {
    private String armor = "leather";
    private String weapon = "fists";
    private String skill = "none";
    
    @Override
    public WarriorBuilder setArmor(String armor) {
        this.armor = armor;
        return this;
    }
    
    @Override
    public WarriorBuilder setWeapon(String weapon) {
        this.weapon = weapon;
        return this;
    }
    
    @Override
    public WarriorBuilder setSkill(String skill) {
        this.skill = skill;
        return this;
    }
    
    @Override
    public Character build() {
        return new Warrior(armor, weapon, skill);
    }
}