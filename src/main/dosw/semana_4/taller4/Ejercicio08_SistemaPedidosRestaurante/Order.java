package main.dosw.semana_4.taller4.Ejercicio08_SistemaPedidosRestaurante;

import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

public class Order {
    private final Size size;
    private final Meat meat;
    private final List<String> toppings;
    private final List<String> sides;
    private final List<Observer> observers;
    
    public Order(Size size, Meat meat, List<String> toppings, List<String> sides) {
        this.size = size;
        this.meat = meat;
        this.toppings = Collections.unmodifiableList(toppings);
        this.sides = Collections.unmodifiableList(sides);
        this.observers = new ArrayList<>();
    }
    
    public void addObserver(Observer observer) {
        observers.add(observer);
        System.out.println("  Observer registrado: " + observer.getClass().getSimpleName());
    }
    
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    
    public void confirm() {
        System.out.println("\nPedido confirmado!");
        System.out.println("  " + toString());
        notifyObservers();
    }
    
    private void notifyObservers() {
        System.out.println("\nNotificando a " + observers.size() + " observers...");
        observers.stream().forEach(observer -> observer.update(this));
    }
    
    public Size getSize() { return size; }
    public Meat getMeat() { return meat; }
    public List<String> getToppings() { return toppings; }
    public List<String> getSides() { return sides; }
    
    @Override
    public String toString() {
        return "Order{" +
               "size=" + size +
               ", meat=" + meat +
               ", toppings=" + toppings +
               ", sides=" + sides +
               '}';
    }
}