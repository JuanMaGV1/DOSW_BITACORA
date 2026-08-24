package main.dosw.semana_3.patrones_diapositivas.Ejercicio07_SimuladorNaval;

public class AntiTorpedosDecorador extends BarcoBaseDecorador{
    
    public AntiTorpedosDecorador(Barco barco){
        super(barco);
    }

    @Override
    public String getDescripcion() {
        return barco.getDescripcion() + " + Sistema antitorpedos";
    }

    @Override
    public int poderAtaque() {
        return barco.poderAtaque() + 20; // +20 en ataque
    }
}
