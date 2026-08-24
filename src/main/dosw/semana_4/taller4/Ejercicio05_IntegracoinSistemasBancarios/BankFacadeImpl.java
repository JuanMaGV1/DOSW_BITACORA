package main.dosw.semana_4.taller4.Ejercicio05_IntegracoinSistemasBancarios;

class BankFacadeImpl implements BankFacade {
    private PaymentProcessor adapter;
    
    public BankFacadeImpl() {
        // Inicializa el adapter con el servicio legacy
        LegacyBankService legacy = new LegacyBankService();
        this.adapter = new LegacyBankAdapter(legacy, "ACC-12345");
    }
    
    @Override
    public void procesarPago(double monto) {
        System.out.println(" Iniciando proceso de pago con banco legacy...");
        
        // Obtener el servicio legacy a través del adapter
        LegacyBankService legacy = getLegacyServiceFromAdapter();
        
        // 8 pasos de inicialización orquestados por la Facade
        System.out.println("\n Ejecutando 8 pasos de inicialización:");
        legacy.initConnection();
        legacy.createSession();
        legacy.setContext();
        legacy.authenticate();
        legacy.loadAccount("ACC-12345");
        legacy.verifyBalance((int)(monto * 100));
        
        // Delegar al adapter para la transacción
        System.out.println("\n Procesando pago:");
        adapter.pay(monto);
        
        legacy.closeConnection();
        
        System.out.println("\n Pago procesado exitosamente");
    }
    
    // Método auxiliar para obtener el servicio legacy desde el adapter
    private LegacyBankService getLegacyServiceFromAdapter() {
        // En un caso real, se podría obtener mediante reflexión o un getter
        // Simplemente creamos uno nuevo para este ejemplo
        return new LegacyBankService();
    }
}
