package main.dosw.semana_3.patrones_diapositivas.Ejercicio02_EmpresaVideojuegos;

public class XboxController implements Controller{
    @Override
    public void connect() {
        System.out.println("Conectando control de Xbox...");
        System.out.println("Control de Xbox listo para usar.");
    }
}
