package main.dosw.semana_4.taller4.Ejercicio01_PlataformaPagosInteligentes;

public class Main {
    public static void main(String[] args) {
        // Cliente selecciona país y tipo de pago
        String country = "Colombia";
        String paymentType = "nequi";

        // Factory según país
        PaymentFactory factory;
        if (country.equalsIgnoreCase("Colombia")) {
            factory = new ColombiaPaymentFactory();
        } else if (country.equalsIgnoreCase("USA")) {
            factory = new UsaPaymentFactory();
        } else {
            throw new IllegalArgumentException("País no soportado");
        }

        // Crear la estrategia concreta
        PaymentStrategy strategy = factory.create(paymentType);

        // Checkout solo recibe la estrategia y ejecuta
        Checkout checkout = new Checkout();
        checkout.setStrategy(strategy);
        checkout.pay(150.75);
    }
}