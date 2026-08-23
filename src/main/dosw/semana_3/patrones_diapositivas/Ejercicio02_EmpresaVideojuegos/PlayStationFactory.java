package main.dosw.semana_3.patrones_diapositivas.Ejercicio02_EmpresaVideojuegos;

public class PlayStationFactory implements ConsoleFactory{
    @Override
    public Controller creaController() {
        return new PlayStationController();
    }

    @Override
    public Game createGame() {
        return new PlayStationGame();
    }

    @Override
    public UI createUI() {
        return new PlayStationUI();
    }
}
