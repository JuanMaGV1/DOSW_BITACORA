package main.dosw.semana_4.taller4.Ejercicio10_AplicacionEdicionImagenes;

public class BaseImage implements Image {
    private String name;

    public BaseImage(String name){
        this.name = name;
    }

    @Override
    public String render() {
        return "Imagen: "+ name;
    }
}
