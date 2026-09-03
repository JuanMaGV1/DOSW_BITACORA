package main.dosw.semana_4.taller4.Ejercicio05_IntegracoinSistemasBancarios;

public class Main {
    public static void main(String[] args) {
        // El desarrollador solo conoce la Facade
        System.out.println("=== SISTEMA MODERNO INTEGRADO CON BANCO LEGACY ===\n");
        
        BankFacade facade = new BankFacadeImpl();
        
        // El desarrollador solo llama a un método simple
        System.out.println("Desarrollador: Quiero pagar $150.75");
        System.out.println("Desarrollador: Llamo a facade.procesarPago(150.75)\n");
        
        facade.procesarPago(150.75);
        
        System.out.println("\n" + "=".repeat(50));
        System.out.println("Desarrollador: ¡Listo! No tuve que hacer los 8 pasos");
    }
}