package main.dosw.semana_3.patrones_diapositivas.Ejercicio08_Migracion;

public class AntecedentesControl extends ControlMigratorioHandler{
    @Override
    protected void realizarControl(IngresoRequest request) {
        if(!request.isAntecedentesLimpios()){
            request.setAprobado(false);
            System.out.println("Rechazado");
        }
    }
}
