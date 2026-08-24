package main.dosw.semana_4.taller4.Ejercicio07_FlujoAprobacionDocumentos;

public class AutorHandler extends DocumentHandler {
    @Override
    boolean canHandle(Document doc) {
        return doc.getState() instanceof DraftState;
    }
    
    @Override
    void process(Document doc) {
        System.out.println("  Autor: Revisando contenido...");
        doc.approve(); // Avanza a InReviewState
    }
}
