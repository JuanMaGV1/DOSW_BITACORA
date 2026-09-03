package main.dosw.semana_4.taller4.Ejercicio08_SistemaPedidosRestaurante;


public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE PEDIDOS EN RESTAURANTE ===\n");
        
        // 1. Construcción del pedido con Builder
        System.out.println("PASO 1: Construyendo pedido personalizado");
        System.out.println("-".repeat(40));
        
        Order order = new OrderBuilder()
                .setSize(Size.LARGE)
                .setMeat(Meat.DOUBLE_BEEF)
                .addTopping("queso")
                .addTopping("lechuga")
                .addTopping("tomate")
                .addSide("papas fritas")
                .addSide("gaseosa")
                .build();
        
        System.out.println("Pedido construido exitosamente!");
        System.out.println("  " + order.toString());
        
        // 2. Registrar observers
        System.out.println("\nPASO 2: Registrando observers");
        System.out.println("-".repeat(40));
        
        KitchenService kitchen = new KitchenService();
        BillingService billing = new BillingService();
        DeliveryService delivery = new DeliveryService();
        
        order.addObserver(kitchen);
        order.addObserver(billing);
        order.addObserver(delivery);
        
        // 3. Confirmar pedido - esto dispara las notificaciones
        System.out.println("\nPASO 3: Confirmando pedido");
        System.out.println("-".repeat(40));
        
        order.confirm();
        
        System.out.println("\n" + "=".repeat(50));
        System.out.println("Pedido procesado exitosamente!");
    }
}