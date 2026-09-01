package main.dosw.semana_4.taller4.Ejercicio02_SistemaNotificaciones;

public class Main {
    public static void main(String[] args) {
        // Crear pedido
        Order order = new Order(1001, "Juan Pérez");

        // Crear notificadores según preferencias del usuario
        EmailNotifier emailNotifier = new EmailNotifier(true);   // Activado
        SmsNotifier smsNotifier = new SmsNotifier(true);        // Activado
        PushNotifier pushNotifier = new PushNotifier(false);    // Desactivado

        // Registrar observers en el pedido
        order.attach(emailNotifier);
        order.attach(smsNotifier);
        order.attach(pushNotifier);

        // Cambiar estado del pedido (esto dispara las notificaciones)
        System.out.println("=== Pedido #1001: PENDIENTE -> ENVIADO ===");
        order.setStatus("ENVIADO");

        System.out.println("\n=== Pedido #1001: ENVIADO -> ENTREGADO ===");
        order.setStatus("ENTREGADO");
    }
}