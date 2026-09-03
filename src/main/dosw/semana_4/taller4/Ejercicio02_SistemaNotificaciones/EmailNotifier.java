package main.dosw.semana_4.taller4.Ejercicio02_SistemaNotificaciones;

public class EmailNotifier implements NotificationObserver {
    private MessageFactory factory;
    private boolean active;

    public EmailNotifier(boolean active) {
        this.factory = new EmailMessageFactory();
        this.active = active;
    }

    @Override
    public void notify(OrderEvent event) {
        if (!active) return;
        Message message = factory.build(event);
        System.out.println("CORREO: " + message);
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
