package main.dosw.semana_4.taller4.Ejercicio10_AplicacionEdicionImagenes;

public class RemoveFilterCommand implements ImageCommand {
    private ImageEditor editor;
    private Image oldImage;
    private Image newImage;
    private int index;
    
    public RemoveFilterCommand(ImageEditor editor, int index) {
        this.editor = editor;
        this.index = index;
    }
    
    @Override
    public void execute() {
        oldImage = editor.getImage();
        newImage = removeDecoratorAt(oldImage, index);
        editor.setImage(newImage);
        System.out.println("  Removido filtro en posición " + index);
    }
    
    private Image removeDecoratorAt(Image image, int index) {
        // En un caso real, se recorrería la cadena de decoradores
        // Simplemente retornamos la imagen sin el decorador en esa posición
        return new BaseImage("Imagen sin filtro en posición " + index);
    }
    
    @Override
    public void undo() {
        editor.setImage(oldImage);
        System.out.println("  Reaplicado filtro en posición " + index);
    }
    
    @Override
    public String getDescription() {
        return "Remove filter at index " + index;
    }
}