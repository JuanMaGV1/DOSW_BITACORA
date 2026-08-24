package main.dosw.semana_3.patrones_diapositivas.Ejercicio07_SimuladorNaval;

public class BlindajeDecorador extends BarcoBaseDecorador{
    
    public BlindajeDecorador(Barco barco){
        super(barco);
    }

    @Override
    public String getDescripcion() {
        return barco.getDescripcion() + " + Blindaje reforzado";
    }

    @Override
    public int defensa() {
        return barco.defensa() + 30; // +30 en defensa
    }
}
