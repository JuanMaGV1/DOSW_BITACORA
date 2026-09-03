package main.dosw.semana_4.taller4.Ejercicio10_AplicacionEdicionImagenes;

public abstract class ImageDecorator implements Image{
    protected Image image;

    public ImageDecorator(Image image){
        this.image = image;
    }

    @Override
    public String render() {
        return image.render();
    }

    public Image getWrapped(){
        return image;
    }
}
