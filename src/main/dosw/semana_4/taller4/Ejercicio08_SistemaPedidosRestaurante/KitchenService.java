package main.dosw.semana_4.taller4.Ejercicio08_SistemaPedidosRestaurante;

public class KitchenService implements Observer {
    @Override
    public void update(Order order) {
        System.out.println("  KitchenService: Preparando pedido...");
        System.out.println("    - Carne: " + order.getMeat());
        System.out.println("    - Tamaño: " + order.getSize());
        System.out.println("    - Ingredientes: " + order.getToppings());
        System.out.println("    - Acompañamientos: " + order.getSides());
    }
}
