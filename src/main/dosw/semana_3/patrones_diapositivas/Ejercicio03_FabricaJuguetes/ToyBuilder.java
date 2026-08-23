package main.dosw.semana_3.patrones_diapositivas.Ejercicio03_FabricaJuguetes;

public interface ToyBuilder {
    void buildHead();
    void buildBody();
    void buildArms();
    void buildLegs();
    void addAccessories();
    ToyDoll getResult();
}
