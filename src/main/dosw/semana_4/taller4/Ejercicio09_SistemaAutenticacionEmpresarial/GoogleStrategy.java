package main.dosw.semana_4.taller4.Ejercicio09_SistemaAutenticacionEmpresarial;

public class GoogleStrategy implements AuthStrategy {
    @Override
    public AuthResult authenticate(Credentials credentials) {
        System.out.println("  GoogleStrategy: Validando token de Google...");
        if (credentials.getToken() != null && credentials.getToken().startsWith("google_")) {
            return new AuthResult(true, "Autenticación exitosa por Google", credentials.getUsername());
        }
        return new AuthResult(false, "Token de Google inválido", null);
    }
}
