package main.dosw.semana_4.taller4.Ejercicio07_FlujoAprobacionDocumentos;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== FLUJO DE APROBACIÓN DE DOCUMENTOS ===\n");
        
        // Configurar cadena de handlers (Chain of Responsibility)
        DocumentHandler chain = new AutorHandler();
        DocumentHandler lider = new LiderHandler();
        DocumentHandler juridico = new JuridicoHandler();
        DocumentHandler financiero = new FinancieroHandler();
        
        // Construir cadena: Autor → Líder → Jurídico → Financiero
        chain.setNext(lider).setNext(juridico).setNext(financiero);
        
        
        // Caso 1: Documento legal
        System.out.println("\n CASO 1: Documento Legal");
        System.out.println("-".repeat(40));
        Document docLegal = new Document("Contrato de servicios", "legal");
        chain.handle(docLegal);
        
        System.out.println("\n" + "=".repeat(60));
        
        // Caso 2: Documento financiero
        System.out.println("\n CASO 2: Documento Financiero");
        System.out.println("-".repeat(40));
        Document docFinanciero = new Document("Presupuesto anual", "financiero");
        chain.handle(docFinanciero);
        
        System.out.println("\n" + "=".repeat(60));
        
        // Caso 3: Documento general (no pasa ni por Líder, Jurídico ni Financiero)
        System.out.println("\n CASO 3: Documento General");
        System.out.println("-".repeat(40));
        Document docGeneral = new Document("Nota interna", "general");
        chain.handle(docGeneral);
    }
}