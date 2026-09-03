package main.dosw.semana_4.taller4.Ejercicio02_SistemaNotificaciones;

public class PushMessageFactory implements MessageFactory {
    @Override
    public Message build(OrderEvent event) {
        String content = String.format(
            "¡Actualización! Pedido #%d: %s -> %s",
            event.getOrderId(),
            event.getOldStatus(),
            event.getNewStatus()
        );
        return new Message(content, "device_token_123", "PUSH");
    }
}