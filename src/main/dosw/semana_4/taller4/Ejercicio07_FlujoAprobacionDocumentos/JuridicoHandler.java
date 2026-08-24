package main.dosw.semana_4.taller4.Ejercicio07_FlujoAprobacionDocumentos;

public class JuridicoHandler extends DocumentHandler {
    @Override
    boolean canHandle(Document doc) {
        return doc.getType().equals("legal");
    }
    
    @Override
    void process(Document doc) {
        System.out.println("   Jurídico: Revisando cumplimiento legal...");
        doc.approve();
    }
}