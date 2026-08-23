package main.dosw.semana_3.patrones_diapositivas.Ejercicio03_FabricaJuguetes;

public class ActionDollBuilder implements ToyBuilder {
    private ToyDoll doll;
    
    public ActionDollBuilder() {
        this.doll = new ToyDoll();
    }
    
    @Override
    public void buildHead() {
        doll.setHead("Cabeza de acción con casco y visor");
    }
    
    @Override
    public void buildBody() {
        doll.setBody("Cuerpo musculoso con armadura");
    }
    
    @Override
    public void buildArms() {
        doll.setArms("Brazos articulados con agarres fuertes");
    }
    
    @Override
    public void buildLegs() {
        doll.setLegs("Piernas robustas con botas tácticas");
    }
    
    @Override
    public void addAccessories() {
        doll.setHasAccessories(true);
        // En un caso real, aquí se agregarían los accesorios
        System.out.println("Agregando accesorios: mochila, cinturón con herramientas, y arma de juguete");
    }
    
    @Override
    public ToyDoll getResult() {
        return doll;
    }
}