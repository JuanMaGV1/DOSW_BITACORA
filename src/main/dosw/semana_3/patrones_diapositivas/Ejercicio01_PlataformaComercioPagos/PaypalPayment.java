package main.dosw.semana_3.patrones_diapositivas.Ejercicio01_PlataformaComercioPagos;

public class PaypalPayment implements Payment{
    @Override
    public void pay(double amount) {
        System.out.printf("Pago con PayPal por $%.2f%n", amount);
    }
}
