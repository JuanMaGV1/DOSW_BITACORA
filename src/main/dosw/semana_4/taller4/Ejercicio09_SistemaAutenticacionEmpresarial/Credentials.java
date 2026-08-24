package main.dosw.semana_4.taller4.Ejercicio09_SistemaAutenticacionEmpresarial;

public class Credentials {
    private String username;
    private String password;
    private String token;
    private String userType;
    
    public Credentials(String username, String password, String token, String userType) {
        this.username = username;
        this.password = password;
        this.token = token;
        this.userType = userType;
    }
    
    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public String getToken() { return token; }
    public String getUserType() { return userType; }
}