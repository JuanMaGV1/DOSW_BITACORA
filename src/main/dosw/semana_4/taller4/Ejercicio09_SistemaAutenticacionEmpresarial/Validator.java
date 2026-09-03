package main.dosw.semana_4.taller4.Ejercicio09_SistemaAutenticacionEmpresarial;

public abstract class Validator {
    private Validator next;
    
    public Validator setNext(Validator next) {
        this.next = next;
        return next;
    }
    
    public void handle(AuthResult result) {
        System.out.println("  " + this.getClass().getSimpleName() + " verificando...");
        if (check(result)) {
            System.out.println("   " + this.getClass().getSimpleName() + " aprobado");
            if (next != null) {
                next.handle(result);
            } else {
                System.out.println("   Todas las validaciones superadas - Acceso concedido!");
            }
        } else {
            System.out.println("   " + this.getClass().getSimpleName() + " falló - Acceso denegado!");
        }
    }
    
    protected abstract boolean check(AuthResult result);
}