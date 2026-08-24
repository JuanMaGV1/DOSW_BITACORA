package main.dosw.semana_3.patrones_diapositivas.Ejercicio08_Migracion;

public class PasaporteControl extends ControlMigratorioHandler{
    
    @Override
    protected void realizarControl(IngresoRequest request) {
        if(!request.isPasaporteValido()){
            request.setAprobado(false);

            System.out.println("Rechazado.");
        }
    }
}
