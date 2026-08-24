package main.dosw.semana_3.patrones_diapositivas.Ejercicio04_GasolineriaInteligente;

public class FastChargerAdapter implements FuelService{
    private FastElectricCharger charger;

    public FastChargerAdapter(FastElectricCharger charger){
        this.charger = charger;
    }

    @Override
    public void supply(int liters) {
        System.out.printf("Adaptando %d litros a KWh (factor rapido: 8.0)%n", liters);
        double kWh = convertLitersToKWh(liters);
        System.out.printf("Conversion: %d × 8.0 = %.2f kWh%n", liters, kWh);
        charger.fastCharge(kWh);
    }

    private double convertLitersToKWh(int liters){
        return liters * 8.0; //Factor de conversion para carga rapida
    }
}
