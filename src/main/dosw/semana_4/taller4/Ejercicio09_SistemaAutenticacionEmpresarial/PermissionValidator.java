package main.dosw.semana_4.taller4.Ejercicio09_SistemaAutenticacionEmpresarial;

public class PermissionValidator extends Validator {
    @Override
    protected boolean check(AuthResult result) {
        // Simular verificación de permisos
        return result.getUser() != null && !result.getUser().isEmpty();
    }
}