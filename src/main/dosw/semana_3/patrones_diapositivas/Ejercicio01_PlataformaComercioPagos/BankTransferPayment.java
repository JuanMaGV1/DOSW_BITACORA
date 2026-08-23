package main.dosw.semana_3.patrones_diapositivas.Ejercicio01_PlataformaComercioPagos;

public class BankTransferPayment implements Payment{
    @Override
    public void pay(double amount) {
        System.out.printf("Pago con Transferencia bancaria por $%.2f%n", amount);
    }
}
