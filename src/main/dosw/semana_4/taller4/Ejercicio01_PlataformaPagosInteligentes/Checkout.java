package main.dosw.semana_4.taller4.Ejercicio01_PlataformaPagosInteligentes;

public class Checkout {
    private PaymentStrategy strategy;

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void pay(double amount) {
        if (strategy == null) {
            throw new IllegalStateException("Estrategia de pago no configurada");
        }
        strategy.process(amount);
    }
}
