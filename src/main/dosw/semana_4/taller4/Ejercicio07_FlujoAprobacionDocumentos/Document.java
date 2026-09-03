package main.dosw.semana_4.taller4.Ejercicio07_FlujoAprobacionDocumentos;

public class Document {
    private DocumentState state;
    private String content;
    private String type;
    
    public Document(String content, String type) {
        this.content = content;
        this.type = type;
        this.state = new DraftState();
        System.out.println(" Documento creado: '" + content + "' (Tipo: " + type + ")");
        System.out.println("  Estado actual: " + state.getClass().getSimpleName() + "\n");
    }
    
    public void approve() {
        System.out.println("   Documento: " + content);
        state.approve(this);
    }
    
    public void reject() {
        System.out.println("   Documento: " + content);
        state.reject(this);
    }
    
    public void setState(DocumentState state) {
        this.state = state;
        System.out.println("  -> Nuevo estado: " + state.getClass().getSimpleName());
    }
    
    public String getContent() { return content; }
    public String getType() { return type; }
    public DocumentState getState() { return state; }
}