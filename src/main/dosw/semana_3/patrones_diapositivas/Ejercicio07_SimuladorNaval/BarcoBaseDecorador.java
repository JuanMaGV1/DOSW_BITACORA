package main.dosw.semana_3.patrones_diapositivas.Ejercicio07_SimuladorNaval;

public abstract class BarcoBaseDecorador implements Barco{
    protected Barco barco; // El barco que sera decorado

    BarcoBaseDecorador(Barco barco){
        this.barco = barco;
    }

    @Override
    public String getDescripcion() {
        return barco.getDescripcion();
    }

    @Override
    public int poderAtaque() {
        return barco.poderAtaque();
    }

    @Override
    public int defensa() {
        return barco.defensa();
    }
}
