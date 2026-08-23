package main.dosw.semana_3.patrones_diapositivas.Ejercicio01_PlataformaComercioPagos;

public class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.printf("Pagon con Tarjeta de credito por $%.2f%n", amount);
    }
}
