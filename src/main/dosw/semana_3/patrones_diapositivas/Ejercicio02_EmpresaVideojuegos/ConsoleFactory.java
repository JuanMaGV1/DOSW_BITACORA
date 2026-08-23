package main.dosw.semana_3.patrones_diapositivas.Ejercicio02_EmpresaVideojuegos;

public interface ConsoleFactory {
    Controller creaController();
    Game createGame();
    UI createUI();
}
