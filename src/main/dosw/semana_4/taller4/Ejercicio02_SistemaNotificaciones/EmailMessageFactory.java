package main.dosw.semana_4.taller4.Ejercicio02_SistemaNotificaciones;

public class EmailMessageFactory implements MessageFactory {
    @Override
    public Message build(OrderEvent event) {
        String content = String.format(
            "Hola %s, su pedido #%d cambió de %s a %s",
            event.getCustomer(),
            event.getOrderId(),
            event.getOldStatus(),
            event.getNewStatus()
        );
        return new Message(content, event.getCustomer() + "@email.com", "EMAIL");
    }
}