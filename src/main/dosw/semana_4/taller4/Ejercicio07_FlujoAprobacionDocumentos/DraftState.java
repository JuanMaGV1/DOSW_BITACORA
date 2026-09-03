package main.dosw.semana_4.taller4.Ejercicio07_FlujoAprobacionDocumentos;

public class DraftState implements DocumentState {
    @Override
    public void approve(Document doc) {
        doc.setState(new InReviewState());
        System.out.println("   El documento pasa a REVISIÓN");
    }
    
    @Override
    public void reject(Document doc) {
        System.out.println("   Un documento en BORRADOR no puede ser rechazado");
    }
}