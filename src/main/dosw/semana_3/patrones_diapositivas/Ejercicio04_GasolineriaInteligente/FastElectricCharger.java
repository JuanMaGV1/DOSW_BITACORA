package main.dosw.semana_3.patrones_diapositivas.Ejercicio04_GasolineriaInteligente;

// Cargador rápido de proveedor externo (interfaz incompatible)
public class FastElectricCharger {
    public void fastCharge(double kWh) {
        System.out.printf("Cargador RÁPIDO: Suministrando %.2f kWh de energía eléctrica%n", kWh);
        System.out.println("Carga rápida completada\n");
    }
}