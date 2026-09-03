package main.dosw.semana_4.taller4.Ejercicio09_SistemaAutenticacionEmpresarial;

public class AuthService {
    private AuthStrategy strategy;
    private Validator validator;
    
    public void setStrategy(AuthStrategy strategy) {
        this.strategy = strategy;
        System.out.println("  Estrategia configurada: " + strategy.getClass().getSimpleName());
    }
    
    public void setValidator(Validator validator) {
        this.validator = validator;
    }
    
    public void login(Credentials credentials) {
        System.out.println("\n=== PROCESO DE AUTENTICACIÓN ===");
        System.out.println("Usuario: " + credentials.getUsername());
        System.out.println("Tipo: " + credentials.getUserType());
        System.out.println("-".repeat(40));
        
        // Fase 1: Autenticación con Strategy
        System.out.println("FASE 1: Autenticación");
        AuthResult result = strategy.authenticate(credentials);
        System.out.println("  Resultado: " + result.getMessage());
        
        if (!result.isSuccess()) {
            System.out.println("   Autenticación fallida - Acceso denegado!");
            return;
        }
        
        // Fase 2: Validaciones con Chain of Responsibility
        System.out.println("\nFASE 2: Validaciones post-autenticación");
        if (validator != null) {
            validator.handle(result);
        }
    }
}
