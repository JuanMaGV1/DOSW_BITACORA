package main.dosw.semana_3.patrones_diapositivas.Ejercicio01_PlataformaComercioPagos;

public class MainClass {
    public static void main(String[] args) {
        
        PaymentProcessor processor;

        processor = new CreditCardProcessor();
        processor.processPayment(100);

        processor = new PaypalProcessor();
        processor.processPayment(250);

        processor = new BankTransferProcessor();
        processor.processPayment(500);
    }
}