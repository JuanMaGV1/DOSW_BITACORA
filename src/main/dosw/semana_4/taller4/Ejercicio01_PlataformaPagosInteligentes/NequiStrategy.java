package main.dosw.semana_4.taller4.Ejercicio01_PlataformaPagosInteligentes;

public class NequiStrategy implements PaymentStrategy{
    @Override
    public void process(double amount) {
        System.out.println("Procesando pago con Nequi por $" + amount);
    }
}
