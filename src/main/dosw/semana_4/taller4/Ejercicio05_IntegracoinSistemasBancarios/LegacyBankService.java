package main.dosw.semana_4.taller4.Ejercicio05_IntegracoinSistemasBancarios;

public class LegacyBankService {
     // Sistema legacy con métodos incompatibles
    
    public void initConnection() {
        System.out.println("  Paso 1: Inicializando conexión...");
    }
    
    public void createSession() {
        System.out.println("  Paso 2: Creando sesión segura...");
    }
    
    public void setContext() {
        System.out.println("  Paso 3: Configurando contexto...");
    }
    
    public void authenticate() {
        System.out.println("  Paso 4: Autenticando credenciales...");
    }
    
    public void loadAccount(String account) {
        System.out.println("  Paso 5: Cargando cuenta: " + account);
    }
    
    public void verifyBalance(int cents) {
        System.out.println("  Paso 6: Verificando saldo de " + cents + " centavos...");
    }
    
    public void executeTransaction(String account, int cents) {
        System.out.println("  Paso 7: Ejecutando transacción de " + cents + " centavos en cuenta " + account);
    }
    
    public void closeConnection() {
        System.out.println("  Paso 8: Cerrando conexión...");
    }
}
