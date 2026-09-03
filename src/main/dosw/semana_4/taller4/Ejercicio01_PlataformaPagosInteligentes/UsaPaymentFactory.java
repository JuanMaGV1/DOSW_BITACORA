package main.dosw.semana_4.taller4.Ejercicio01_PlataformaPagosInteligentes;

public class UsaPaymentFactory implements PaymentFactory{
    @Override
    public PaymentStrategy create(String type) {
        switch (type.toLowerCase()) {
            case "tarjeta": return new TarjetaStrategy();
            case "pse": return new PseStrategy();
            default: return null;
        }
    }
}
