package main.dosw.semana_4.taller4.Ejercicio10_AplicacionEdicionImagenes;

import java.util.List;
import java.util.ArrayList;

public class ImageEditor {
    private Image image;
    private List<ImageCommand> history;
    private List<ImageCommand> redoStack;
    
    public ImageEditor(Image initialImage) {
        this.image = initialImage;
        this.history = new ArrayList<>();
        this.redoStack = new ArrayList<>();
    }
    
    public void applyFilter(String filterName) {
        applyFilter(filterName, null);
    }
    
    public void applyFilter(String filterName, Object param) {
        ImageCommand command = new ApplyFilterCommand(this, filterName, param);
        command.execute();
        history.add(command);
        redoStack.clear(); // Limpiar redo al hacer nueva acción
        showState();
    }
    
    public void undo() {
        if (history.isEmpty()) {
            System.out.println("  No hay operaciones para deshacer");
            return;
        }
        ImageCommand command = history.remove(history.size() - 1);
        command.undo();
        redoStack.add(command);
        showState();
    }
    
    public void redo() {
        if (redoStack.isEmpty()) {
            System.out.println("  No hay operaciones para rehacer");
            return;
        }
        ImageCommand command = redoStack.remove(redoStack.size() - 1);
        command.execute();
        history.add(command);
        showState();
    }
    
    public void setImage(Image image) {
        this.image = image;
    }
    
    public Image getImage() {
        return image;
    }
    
    public void showState() {
        System.out.println("  Imagen actual: " + image.render());
        System.out.println("  Historial: " + history.size() + " comandos");
        if (!history.isEmpty()) {
            System.out.println("  Último comando: " + history.get(history.size() - 1).getDescription());
        }
    }
    
    public void showHistory() {
        System.out.println("\n=== HISTORIAL DE COMANDOS ===");
        if (history.isEmpty()) {
            System.out.println("  No hay comandos en el historial");
            return;
        }
        history.stream().forEach(cmd -> {
            System.out.println("  - " + cmd.getDescription());
        });
    }
}