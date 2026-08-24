package main.dosw.semana_4.taller4.Ejercicio10_AplicacionEdicionImagenes;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== APLICACIÓN DE EDICIÓN DE IMÁGENES ===\n");
        
        // Crear imagen base
        Image baseImage = new BaseImage("foto_vacaciones.jpg");
        ImageEditor editor = new ImageEditor(baseImage);
        
        System.out.println("Imagen inicial:");
        editor.showState();
        
        System.out.println("\n" + "=".repeat(60));
        System.out.println("APLICANDO FILTROS");
        System.out.println("=".repeat(60));
        
        // Aplicar filtros acumulativos
        System.out.println("\n1. Aplicando filtro sepia...");
        editor.applyFilter("sepia");
        
        System.out.println("\n2. Aplicando filtro blanco y negro...");
        editor.applyFilter("grayscale");
        
        System.out.println("\n3. Aplicando filtro brillo 70%...");
        editor.applyFilter("brightness", 70);
        
        System.out.println("\n" + "=".repeat(60));
        System.out.println("DESHACIENDO OPERACIONES");
        System.out.println("=".repeat(60));
        
        // Deshacer operaciones individuales
        System.out.println("\n4. Deshaciendo última operación (brillo)...");
        editor.undo();
        
        System.out.println("\n5. Deshaciendo penúltima operación (blanco y negro)...");
        editor.undo();
        
        System.out.println("\n" + "=".repeat(60));
        System.out.println("REHACIENDO OPERACIONES");
        System.out.println("=".repeat(60));
        
        // Rehacer operaciones
        System.out.println("\n6. Rehaciendo operación (blanco y negro)...");
        editor.redo();
        
        System.out.println("\n7. Rehaciendo operación (brillo)...");
        editor.redo();
        
        System.out.println("\n" + "=".repeat(60));
        System.out.println("VER HISTORIAL");
        System.out.println("=".repeat(60));
        editor.showHistory();
        
        System.out.println("\n" + "=".repeat(60));
        System.out.println("ESTADO FINAL");
        System.out.println("=".repeat(60));
        editor.showState();
    }
}