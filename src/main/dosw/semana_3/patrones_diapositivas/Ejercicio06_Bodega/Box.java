package main.dosw.semana_3.patrones_diapositivas.Ejercicio06_Bodega;

import java.util.ArrayList;
import java.util.List;

// Caja que puede contener productos y otras cajas - Compuesto
public class Box implements Item {
    private String name;
    private List<Item> items;
    
    public Box(String name) {
        this.name = name;
        this.items = new ArrayList<>();
    }
    
    // Métodos para gestionar los items
    public void add(Item item) {
        items.add(item);
        System.out.printf("Agregado '%s' a la caja '%s'%n", item.getName(), this.name);
    }
    
    public void remove(Item item) {
        if (items.remove(item)) {
            System.out.printf("Eliminado '%s' de la caja '%s'%n", item.getName(), this.name);
        } else {
            System.out.printf("No se encontró '%s' en la caja '%s'%n", item.getName(), this.name);
        }
    }
    
    @Override
    public double getPrice() {
        return items.stream().mapToDouble(Item::getPrice).sum();
    }
    
    @Override
    public String getName() {
        return name;
    }
}