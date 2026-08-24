package main.dosw.semana_4.taller4.Ejercicio10_AplicacionEdicionImagenes;

public class SepiaDecorator extends ImageDecorator {
    public SepiaDecorator(Image image) {
        super(image);
    }
    
    @Override
    public String render() {
        return super.render() + " + [SEPIA]";
    }
}