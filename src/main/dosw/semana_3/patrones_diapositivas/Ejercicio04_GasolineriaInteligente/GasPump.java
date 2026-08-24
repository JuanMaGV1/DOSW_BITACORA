package main.dosw.semana_3.patrones_diapositivas.Ejercicio04_GasolineriaInteligente;

public class GasPump implements FuelService{
    @Override
    public void supply(int liters) {
        System.out.printf("Abasteciendo %d litros de combustible tradicional%n", liters);
        System.out.printf("Costo estimado: $%.2f%n", liters *1.20);
        System.out.println("Tanque llenado con gasolina\n");
    }
}
