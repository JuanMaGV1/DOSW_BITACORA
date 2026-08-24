package main.dosw.semana_3.patrones_diapositivas.Ejercicio04_GasolineriaInteligente;

// Cargador lento de proveedor externo (interfaz incompatible)
public class SlowElectricCharger {
    public void slowCharge(double kWh) {
        System.out.printf("Cargador LENTO: Suministrando %.2f kWh de energía eléctrica%n", kWh);
        System.out.println("Carga lenta completada\n");
    }
}