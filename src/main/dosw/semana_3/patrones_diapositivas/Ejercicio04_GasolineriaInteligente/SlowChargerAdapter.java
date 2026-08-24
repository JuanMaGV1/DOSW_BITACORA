package main.dosw.semana_3.patrones_diapositivas.Ejercicio04_GasolineriaInteligente;

public class SlowChargerAdapter implements FuelService {
    private SlowElectricCharger charger;
    
    public SlowChargerAdapter(SlowElectricCharger charger) {
        this.charger = charger;
    }
    
    @Override
    public void supply(int liters) {
        System.out.printf("Adaptando: %d litros a kWh (factor lento: 7.0)%n", liters);
        double kWh = convertLitersToKWh(liters);
        System.out.printf("Conversión: %d litros × 7.0 = %.2f kWh%n", liters, kWh);
        charger.slowCharge(kWh);
    }
    
    private double convertLitersToKWh(int liters) {
        return liters * 7.0;  // Factor de conversión para carga lenta
    }
}