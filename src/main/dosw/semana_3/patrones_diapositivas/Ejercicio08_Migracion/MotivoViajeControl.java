package main.dosw.semana_3.patrones_diapositivas.Ejercicio08_Migracion;

public class MotivoViajeControl extends ControlMigratorioHandler{
    
    @Override
    protected void realizarControl(IngresoRequest request) {
        if(!request.isMotivoValido()){
            request.setAprobado(false);
            System.out.println("Rechazado");
        }
    }
}
