package main.dosw.semana_3.patrones_diapositivas.Ejercicio03_FabricaJuguetes;

public class ToyFactory {
    // Método que construye el muñeco siguiendo los pasos
    public void constructDoll(ToyBuilder builder) {
        System.out.println("\n=== INICIANDO CONSTRUCCIÓN DEL MUÑECO ===\n");
        
        System.out.println("Paso 1: Construyendo cabeza...");
        builder.buildHead();
        
        System.out.println("Paso 2: Construyendo cuerpo...");
        builder.buildBody();
        
        System.out.println("Paso 3: Construyendo brazos...");
        builder.buildArms();
        
        System.out.println("Paso 4: Construyendo piernas...");
        builder.buildLegs();
        
        System.out.println("Paso 5: Agregando accesorios...");
        builder.addAccessories();
        
        System.out.println("\n=== CONSTRUCCIÓN COMPLETADA ===\n");
    }
}