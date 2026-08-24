package main.dosw.semana_4.taller4.Ejercicio07_FlujoAprobacionDocumentos;

public class FinancieroHandler extends DocumentHandler {
    @Override
    boolean canHandle(Document doc) {
        return doc.getType().equals("financiero");
    }
    
    @Override
    void process(Document doc) {
        System.out.println("   Financiero: Revisando presupuesto...");
        doc.approve();
    }
}