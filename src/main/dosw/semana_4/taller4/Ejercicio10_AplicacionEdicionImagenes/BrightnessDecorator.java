package main.dosw.semana_4.taller4.Ejercicio10_AplicacionEdicionImagenes;

public class BrightnessDecorator extends ImageDecorator {
    private int level;
    
    public BrightnessDecorator(Image image, int level) {
        super(image);
        this.level = level;
    }
    
    @Override
    public String render() {
        return super.render() + " + [BRILLO " + level + "%]";
    }
}
