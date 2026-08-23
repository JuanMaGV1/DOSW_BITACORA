package main.dosw.semana_3.patrones_diapositivas.Ejercicio03_FabricaJuguetes;

public class Main {
    public static void main(String[] args) {
        ToyFactory factory = new ToyFactory();
        
        ActionDollBuilder actionBuilder = new ActionDollBuilder();
        factory.constructDoll(actionBuilder);
        ToyDoll actionDoll = actionBuilder.getResult();

        ClassicDollBuilder classicBuilder = new ClassicDollBuilder();
        factory.constructDoll(classicBuilder);
        ToyDoll classicDoll = classicBuilder.getResult();

        actionDoll.showInfo();
        classicDoll.showInfo();
    }
}
