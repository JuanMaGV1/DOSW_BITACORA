package main.dosw.semana_3.patrones_diapositivas.Ejercicio01_PlataformaComercioPagos;

public abstract class PaymentProcessor {
    public abstract Payment createPayment();

    public void processPayment(double amount){
        Payment payment = createPayment();
        payment.pay(amount);
    }
}
