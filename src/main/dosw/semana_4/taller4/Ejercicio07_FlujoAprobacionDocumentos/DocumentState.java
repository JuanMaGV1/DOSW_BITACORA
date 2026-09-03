package main.dosw.semana_4.taller4.Ejercicio07_FlujoAprobacionDocumentos;

public interface DocumentState {
    void approve(Document doc);
    void reject(Document doc);
}
