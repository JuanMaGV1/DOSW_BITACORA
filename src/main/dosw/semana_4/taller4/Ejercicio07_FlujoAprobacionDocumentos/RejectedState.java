package main.dosw.semana_4.taller4.Ejercicio07_FlujoAprobacionDocumentos;

public class RejectedState implements DocumentState {
    @Override
    public void approve(Document doc) {
        System.out.println("   Un documento rechazado no puede ser aprobado");
    }
    
    @Override
    public void reject(Document doc) {
        System.out.println("   El documento ya está rechazado");
    }
}