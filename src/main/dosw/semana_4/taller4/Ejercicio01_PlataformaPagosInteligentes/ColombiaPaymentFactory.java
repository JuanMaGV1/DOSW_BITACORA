package main.dosw.semana_4.taller4.Ejercicio01_PlataformaPagosInteligentes;

public class ColombiaPaymentFactory implements PaymentFactory{
    @Override
    public PaymentStrategy create(String type) {
        switch (type.toLowerCase()) {
            case "pse": return new PseStrategy();
            case "nequi": return new NequiStrategy();
            case "tarjeta": return new TarjetaStrategy();
            default: return null;
        }
    }
}
