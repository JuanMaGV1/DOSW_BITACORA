package main.dosw.semana_4.taller4.Ejercicio05_IntegracoinSistemasBancarios;

public class LegacyBankAdapter implements PaymentProcessor {
    private LegacyBankService legacy;
    private String account;
    
    public LegacyBankAdapter(LegacyBankService legacy, String account) {
        this.legacy = legacy;
        this.account = account;
    }
    
    @Override
    public void pay(double amount) {
        // Traducción: amount → cents
        int cents = (int) (amount * 100);
        System.out.println("  Adapter traduciendo: $" + amount + " -> " + cents + " centavos");
        legacy.executeTransaction(account, cents);
    }
}
