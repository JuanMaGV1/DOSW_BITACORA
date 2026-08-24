package main.dosw.semana_3.patrones_diapositivas.Ejercicio08_Migracion;

public interface ControlMigratorio {
    void setSiguiente(ControlMigratorio siguiente);
    void procesar(IngresoRequest request);
}
