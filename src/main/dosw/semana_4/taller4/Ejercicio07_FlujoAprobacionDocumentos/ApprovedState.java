package main.dosw.semana_4.taller4.Ejercicio07_FlujoAprobacionDocumentos;

class ApprovedState implements DocumentState {
    @Override
    public void approve(Document doc) {
        System.out.println("   El documento ya está aprobado");
    }
    
    @Override
    public void reject(Document doc) {
        System.out.println("   Un documento aprobado no puede ser rechazado");
    }
}