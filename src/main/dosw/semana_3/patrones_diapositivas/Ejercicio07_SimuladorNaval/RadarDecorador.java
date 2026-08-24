package main.dosw.semana_3.patrones_diapositivas.Ejercicio07_SimuladorNaval;

public class RadarDecorador extends BarcoBaseDecorador{
    
    public RadarDecorador(Barco barco){
        super(barco);
    }

    @Override
    public String getDescripcion() {
        return barco.getDescripcion() + " + Radar avanzado";
    }

    @Override
    public int poderAtaque() {
        return barco.poderAtaque() + 10; // +10 en ataque
    }
}
