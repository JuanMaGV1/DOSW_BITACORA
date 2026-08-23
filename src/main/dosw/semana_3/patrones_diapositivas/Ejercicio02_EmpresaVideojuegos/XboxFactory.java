package main.dosw.semana_3.patrones_diapositivas.Ejercicio02_EmpresaVideojuegos;

public class XboxFactory implements ConsoleFactory{
    @Override
    public Controller creaController() {
        return new XboxController();
    }

    @Override
    public Game createGame() {
        return new XboxGame();
    }

    @Override
    public UI createUI() {
        return new XboxUI();
    }
}
