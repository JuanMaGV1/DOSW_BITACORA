package main.dosw.semana_4.taller4.Ejercicio09_SistemaAutenticacionEmpresarial;

public class TimeValidator extends Validator {
    @Override
    protected boolean check(AuthResult result) {
        // Simular verificación de horario laboral
        return true; // Siempre pasa en este ejemplo
    }
}
