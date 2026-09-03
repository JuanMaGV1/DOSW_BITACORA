package main.dosw.semana_4.taller4.Ejercicio07_FlujoAprobacionDocumentos;

public class InReviewState implements DocumentState {
    @Override
    public void approve(Document doc) {
        doc.setState(new ApprovedState());
        System.out.println("   El documento ha sido APROBADO");
    }
    
    @Override
    public void reject(Document doc) {
        doc.setState(new RejectedState());
        System.out.println("   El documento ha sido RECHAZADO");
    }
}
