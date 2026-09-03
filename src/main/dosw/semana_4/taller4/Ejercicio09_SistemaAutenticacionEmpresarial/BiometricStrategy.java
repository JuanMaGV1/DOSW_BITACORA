package main.dosw.semana_4.taller4.Ejercicio09_SistemaAutenticacionEmpresarial;

public class BiometricStrategy implements AuthStrategy {
    @Override
    public AuthResult authenticate(Credentials credentials) {
        System.out.println("  BiometricStrategy: Validando datos biométricos...");
        if (credentials.getToken() != null && credentials.getToken().startsWith("bio_")) {
            return new AuthResult(true, "Autenticación exitosa por biometría", credentials.getUsername());
        }
        return new AuthResult(false, "Datos biométricos inválidos", null);
    }
}