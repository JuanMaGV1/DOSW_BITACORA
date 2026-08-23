package main.dosw.semana_3.patrones_diapositivas.Ejercicio03_FabricaJuguetes;

public class ClassicDollBuilder implements ToyBuilder {
    private ToyDoll doll;
    
    public ClassicDollBuilder() {
        this.doll = new ToyDoll();
    }
    
    @Override
    public void buildHead() {
        doll.setHead("Cabeza clásica con cabello largo y sonrisa");
    }
    
    @Override
    public void buildBody() {
        doll.setBody("Cuerpo elegante con vestido estampado");
    }
    
    @Override
    public void buildArms() {
        doll.setArms("Brazos delicados con manos abiertas");
    }
    
    @Override
    public void buildLegs() {
        doll.setLegs("Piernas elegantes con zapatos clásicos");
    }
    
    @Override
    public void addAccessories() {
        doll.setHasAccessories(true);
        System.out.println("Agregando accesorios: diadema, collar y bolso pequeño");
    }
    
    @Override
    public ToyDoll getResult() {
        return doll;
    }
}