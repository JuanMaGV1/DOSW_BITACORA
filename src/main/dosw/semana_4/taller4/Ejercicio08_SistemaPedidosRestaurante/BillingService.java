package main.dosw.semana_4.taller4.Ejercicio08_SistemaPedidosRestaurante;

public class BillingService implements Observer {
    @Override
    public void update(Order order) {
        System.out.println("  BillingService: Generando factura...");
        double total = calculateTotal(order);
        System.out.println("    - Total a pagar: $" + total);
        System.out.println("    - Factura generada para el pedido");
    }
    
    private double calculateTotal(Order order) {
        double base = 10.0;
        switch (order.getSize()) {
            case SMALL: base += 0; break;
            case MEDIUM: base += 5; break;
            case LARGE: base += 10; break;
        }
        base += order.getToppings().size() * 1.5;
        base += order.getSides().size() * 2.0;
        return base;
    }
}