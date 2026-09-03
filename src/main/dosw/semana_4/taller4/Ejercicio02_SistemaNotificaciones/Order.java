package main.dosw.semana_4.taller4.Ejercicio02_SistemaNotificaciones;

import java.util.List;
import java.util.ArrayList;

public class Order {
    private int id;
    private String status;
    private String customer;
    private List<NotificationObserver> observers;

    public Order(int id, String customer) {
        this.id = id;
        this.customer = customer;
        this.status = "PENDIENTE";
        this.observers = new ArrayList<>();
    }

    public void attach(NotificationObserver observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    public void detach(NotificationObserver observer) {
        observers.remove(observer);
    }

    public void setStatus(String newStatus) {
        String oldStatus = this.status;
        if (!oldStatus.equals(newStatus)) {
            this.status = newStatus;
            OrderEvent event = new OrderEvent(id, oldStatus, newStatus, customer);
            notifyObservers(event);
        }
    }

    private void notifyObservers(OrderEvent event) {
        for (NotificationObserver observer : observers) {
            observer.notify(event);
        }
    }

    public int getId() { return id; }
    public String getStatus() { return status; }
    public String getCustomer() { return customer; }
}