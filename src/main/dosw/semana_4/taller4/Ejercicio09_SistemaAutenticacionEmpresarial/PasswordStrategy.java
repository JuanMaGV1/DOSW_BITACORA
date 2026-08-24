package main.dosw.semana_4.taller4.Ejercicio09_SistemaAutenticacionEmpresarial;

public class PasswordStrategy implements AuthStrategy {
    @Override
    public AuthResult authenticate(Credentials credentials) {
        System.out.println("  PasswordStrategy: Validando usuario y contraseña...");
        if (credentials.getUsername().equals("admin") && credentials.getPassword().equals("1234")) {
            return new AuthResult(true, "Autenticación exitosa por contraseña", credentials.getUsername());
        }
        return new AuthResult(false, "Credenciales inválidas", null);
    }
}
