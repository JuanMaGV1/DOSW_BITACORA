package main.dosw.semana_4.taller4.Ejercicio09_SistemaAutenticacionEmpresarial;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE AUTENTICACIÓN EMPRESARIAL ===\n");
        
        // Configurar cadena de validadores
        Validator chain = new CredentialValidator();
        Validator permission = new PermissionValidator();
        Validator location = new LocationValidator();
        Validator time = new TimeValidator();
        
        chain.setNext(permission).setNext(location).setNext(time);
        
        System.out.println("Cadena configurada: Credential -> Permission -> Location -> Time\n");
        
        // Crear servicio
        AuthService authService = new AuthService();
        authService.setValidator(chain);
        
        System.out.println("=".repeat(60));
        
        // Caso 1: Usuario con contraseña
        System.out.println("\nCASO 1: Usuario administrativo con contraseña");
        System.out.println("-".repeat(40));
        
        Credentials cred1 = new Credentials("admin", "1234", null, "admin");
        authService.setStrategy(new PasswordStrategy());
        authService.login(cred1);
        
        System.out.println("\n" + "=".repeat(60));
        
        // Caso 2: Usuario con Google
        System.out.println("\nCASO 2: Usuario con Google");
        System.out.println("-".repeat(40));
        
        Credentials cred2 = new Credentials("juan", "pass", "google_token_123", "employee");
        authService.setStrategy(new GoogleStrategy());
        authService.login(cred2);
        
        System.out.println("\n" + "=".repeat(60));
        
        // Caso 3: Usuario con biometría
        System.out.println("\nCASO 3: Usuario con biometría");
        System.out.println("-".repeat(40));
        
        Credentials cred3 = new Credentials("maria", null, "bio_scan_456", "manager");
        authService.setStrategy(new BiometricStrategy());
        authService.login(cred3);
        
        System.out.println("\n" + "=".repeat(60));
        
        // Caso 4: Intento fallido con contraseña incorrecta
        System.out.println("\nCASO 4: Intento fallido - Contraseña incorrecta");
        System.out.println("-".repeat(40));
        
        Credentials cred4 = new Credentials("admin", "wrong", null, "admin");
        authService.setStrategy(new PasswordStrategy());
        authService.login(cred4);
    }
}