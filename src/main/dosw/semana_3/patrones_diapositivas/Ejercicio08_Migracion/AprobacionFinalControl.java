package main.dosw.semana_3.patrones_diapositivas.Ejercicio08_Migracion;

public class AprobacionFinalControl extends ControlMigratorioHandler{
    
    @Override
    protected void realizarControl(IngresoRequest request) {
        if(request.isAprobado()){
            System.out.println("Aprovado, ingreso autorizado");
        } else {
            System.out.println("Rechazado");
        }
    }
}
