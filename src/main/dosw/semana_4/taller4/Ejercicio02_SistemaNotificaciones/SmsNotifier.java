package main.dosw.semana_4.taller4.Ejercicio02_SistemaNotificaciones;

public class SmsNotifier implements NotificationObserver {
    private MessageFactory factory;
    private boolean active;

    public SmsNotifier(boolean active) {
        this.factory = new SmsMessageFactory();
        this.active = active;
    }

    @Override
    public void notify(OrderEvent event) {
        if (!active) return;
        Message message = factory.build(event);
        System.out.println("SMS: " + message);
        // Lógica real de envío de SMS
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
