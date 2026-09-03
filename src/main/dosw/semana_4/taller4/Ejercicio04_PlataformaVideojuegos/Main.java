package main.dosw.semana_4.taller4.Ejercicio04_PlataformaVideojuegos;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== CONSTRUCCIÓN CON BUILDER ===\n");
        
        // Usando Builder directamente
        Character warrior = new WarriorBuilder()
                .setArmor("steel")
                .setWeapon("sword")
                .setSkill("rage")
                .build();
        
        System.out.println("Personaje base: " + warrior.getDescription());
        warrior.attack();
        System.out.println();
        
        // Usando Director con arquetipos predefinidos
        Director director = new Director();
        Character eliteWarrior = director.constructEliteWarrior();
        Character fireMage = director.constructFireMage();
        
        System.out.println("Arquetipo: " + eliteWarrior.getDescription());
        eliteWarrior.attack();
        System.out.println();
        
        System.out.println("Arquetipo: " + fireMage.getDescription());
        fireMage.attack();
        System.out.println();
        
        System.out.println("=== DECORATOR - PODERES DINÁMICOS ===\n");
        
        // Decoradores anidados (poderes combinados)
        Character poweredWarrior = new ShieldDecorator(
                                   new SpeedDecorator(
                                   warrior));
        
        System.out.println("Personaje con poderes: " + poweredWarrior.getDescription());
        poweredWarrior.attack();
        System.out.println();
        
        // Otro ejemplo con diferentes combinaciones
        Character invisiblePowered = new InvisibilityDecorator(
                                     new SpeedDecorator(
                                     eliteWarrior));
        
        System.out.println("Personaje invisible + velocidad: " + invisiblePowered.getDescription());
        invisiblePowered.attack();
        System.out.println();
        
        // Poderes combinados en diferentes órdenes
        Character fullPower = new ShieldDecorator(
                              new SpeedDecorator(
                              new InvisibilityDecorator(
                              warrior)));
        
        System.out.println("Personaje con todos los poderes: " + fullPower.getDescription());
        fullPower.attack();
    }
}