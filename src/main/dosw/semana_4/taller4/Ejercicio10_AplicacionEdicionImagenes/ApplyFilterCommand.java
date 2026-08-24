package main.dosw.semana_4.taller4.Ejercicio10_AplicacionEdicionImagenes;

public class ApplyFilterCommand implements ImageCommand {
    private ImageEditor editor;
    private Image newImage;
    private Image oldImage;
    private String filterName;
    private Object filterParam;
    
    public ApplyFilterCommand(ImageEditor editor, String filterName) {
        this.editor = editor;
        this.filterName = filterName;
        this.filterParam = null;
    }
    
    public ApplyFilterCommand(ImageEditor editor, String filterName, Object param) {
        this.editor = editor;
        this.filterName = filterName;
        this.filterParam = param;
    }
    
    @Override
    public void execute() {
        oldImage = editor.getImage();
        newImage = createDecoratedImage(oldImage);
        editor.setImage(newImage);
        System.out.println("  Aplicado filtro: " + filterName);
    }
    
    private Image createDecoratedImage(Image image) {
        switch (filterName) {
            case "grayscale": return new GrayscaleDecorator(image);
            case "sepia": return new SepiaDecorator(image);
            case "brightness": 
                int level = (filterParam != null) ? (int) filterParam : 50;
                return new BrightnessDecorator(image, level);
            default: return image;
        }
    }
    
    @Override
    public void undo() {
        editor.setImage(oldImage);
        System.out.println("  Deshecho filtro: " + filterName);
    }
    
    @Override
    public String getDescription() {
        return "Apply " + filterName + (filterParam != null ? " (" + filterParam + "%)" : "");
    }
}