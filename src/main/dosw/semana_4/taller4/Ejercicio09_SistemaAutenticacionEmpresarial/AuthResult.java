package main.dosw.semana_4.taller4.Ejercicio09_SistemaAutenticacionEmpresarial;

public class AuthResult {
    private boolean success;
    private String message;
    private String user;
    
    public AuthResult(boolean success, String message, String user) {
        this.success = success;
        this.message = message;
        this.user = user;
    }
    
    public boolean isSuccess() { return success; }
    public String getMessage() { return message; }
    public String getUser() { return user; }
}