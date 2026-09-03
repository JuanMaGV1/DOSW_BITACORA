package main.dosw.semana_4.taller4.Ejercicio10_AplicacionEdicionImagenes;

public class GrayscaleDecorator extends ImageDecorator {
    public GrayscaleDecorator(Image image) {
        super(image);
    }
    
    @Override
    public String render() {
        return super.render() + " + [BLANCO Y NEGRO]";
    }
}