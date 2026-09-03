package main.dosw.semana_4.taller4.Ejercicio07_FlujoAprobacionDocumentos;

public class LiderHandler extends DocumentHandler {
    @Override
    boolean canHandle(Document doc) {
        return doc.getType().equals("financiero") || doc.getType().equals("legal");
    }
    
    @Override
    void process(Document doc) {
        System.out.println("  Líder: Validando alcance...");
        doc.approve();
    }
}