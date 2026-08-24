package main.dosw.semana_3.patrones_diapositivas.Ejercicio08_Migracion;

public abstract class ControlMigratorioHandler implements ControlMigratorio{
    protected ControlMigratorio siguiente;

    @Override
    public void setSiguiente(ControlMigratorio siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public void procesar(IngresoRequest request) {
        // Si el request ya fue rechazado, no continuamos
        if(!request.isAprobado()){
            return;
        }

        realizarControl(request);

        if (request.isAprobado() && siguiente != null){
            siguiente.procesar(request);
        }
    }

    // Metodo abstracto que cada control especifico debe implementar
    protected abstract void realizarControl(IngresoRequest request);
}
