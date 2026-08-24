package main.dosw.semana_3.patrones_diapositivas.Ejercicio07_SimuladorNaval;

public class BarcoBase implements Barco{
    @Override
    public String getDescripcion() {
        return "Barco base";
    }

    @Override
    public int poderAtaque() {
        return 50; // Ataque base
    }

    @Override
    public int defensa() {
        return 30; // Defensa base
    }
}
