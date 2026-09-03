package main.dosw.semana_4.taller4.Ejercicio09_SistemaAutenticacionEmpresarial;

public class LocationValidator extends Validator {
    @Override
    protected boolean check(AuthResult result) {
        // Simular verificación de ubicación
        return true; // Siempre pasa en este ejemplo
    }
}