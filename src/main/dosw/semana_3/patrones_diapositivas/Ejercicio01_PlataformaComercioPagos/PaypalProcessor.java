package main.dosw.semana_3.patrones_diapositivas.Ejercicio01_PlataformaComercioPagos;

public class PaypalProcessor extends PaymentProcessor{
    @Override
    public Payment createPayment() {
        return new PaypalPayment();
    }
}
