package main.dosw.semana_4.taller4.Ejercicio02_SistemaNotificaciones;

public class OrderEvent {
    private int orderId;
    private String oldStatus;
    private String newStatus;
    private String customer;

    public OrderEvent(int orderId, String oldStatus, String newStatus, String customer){
        this.orderId = orderId;
        this.oldStatus = oldStatus;
        this.newStatus = newStatus;
        this.customer = customer;
    }

    public int getOrderId() {return orderId;}
    public String getOldStatus() {return oldStatus;}
    public String getNewStatus() {return newStatus;}
    public String getCustomer() {return customer;}
}
