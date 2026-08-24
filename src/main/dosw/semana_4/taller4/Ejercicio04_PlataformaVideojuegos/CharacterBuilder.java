package main.dosw.semana_4.taller4.Ejercicio04_PlataformaVideojuegos;

public interface CharacterBuilder {
    CharacterBuilder setArmor(String armor);
    CharacterBuilder setWeapon(String weapon);
    CharacterBuilder setSkill(String skill);
    Character build();
}
