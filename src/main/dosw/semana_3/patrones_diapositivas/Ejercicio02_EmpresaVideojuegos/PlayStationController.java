package main.dosw.semana_3.patrones_diapositivas.Ejercicio02_EmpresaVideojuegos;

public class PlayStationController implements Controller{
    @Override
    public void connect() {
        System.out.println("Conectando control de PlayStation...");
        System.out.println("Control de PlayStation listo para usar");
    }
}
