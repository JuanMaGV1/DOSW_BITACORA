package main.dosw.semana_4.taller4.Ejercicio08_SistemaPedidosRestaurante;

class DeliveryService implements Observer {
    @Override
    public void update(Order order) {
        System.out.println("  DeliveryService: Preparando ruta de entrega...");
        System.out.println("    - Estimado de preparación: " + getPreparationTime(order) + " minutos");
        System.out.println("    - Ruta optimizada calculada");
    }
    
    private int getPreparationTime(Order order) {
        int time = 10;
        time += order.getToppings().size() * 2;
        time += order.getSides().size() * 3;
        if (order.getSize() == Size.LARGE) time += 5;
        return time;
    }
}