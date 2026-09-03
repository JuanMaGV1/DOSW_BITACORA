package main.dosw.semana_4.taller4.Ejercicio07_FlujoAprobacionDocumentos;

public abstract class DocumentHandler {
    private DocumentHandler next;
    
    public DocumentHandler setNext(DocumentHandler next) {
        this.next = next;
        return next;
    }
    
    public void handle(Document doc) {
        System.out.println("   " + this.getClass().getSimpleName() + " evaluando...");
        if (canHandle(doc)) {
            System.out.println("   " + this.getClass().getSimpleName() + " procesando...");
            process(doc);
        } else if (next != null) {
            System.out.println("   " + this.getClass().getSimpleName() + " pasando al siguiente...");
            next.handle(doc);
        } else {
            System.out.println("   Fin de la cadena - " + this.getClass().getSimpleName() + " no puede manejar");
        }
    }
    
    abstract boolean canHandle(Document doc);
    abstract void process(Document doc);
}
