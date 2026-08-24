package main.dosw.semana_3.patrones_diapositivas.Ejercicio06_Bodega;

// Producto individual - Hoja en el patrón Composite
public class Product implements Item {
    private String name;
    private double price;
    
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    @Override
    public double getPrice() {
        return price;
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public String toString() {
        return String.format("Producto: %s - $%.2f", name, price);
    }
}