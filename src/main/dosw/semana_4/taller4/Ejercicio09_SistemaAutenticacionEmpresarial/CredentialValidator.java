package main.dosw.semana_4.taller4.Ejercicio09_SistemaAutenticacionEmpresarial;

public class CredentialValidator extends Validator {
    @Override
    protected boolean check(AuthResult result) {
        return result.isSuccess();
    }
}