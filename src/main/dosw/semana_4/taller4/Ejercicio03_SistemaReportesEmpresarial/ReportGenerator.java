package main.dosw.semana_4.taller4.Ejercicio03_SistemaReportesEmpresarial;

public abstract class ReportGenerator {
    
    // Template Method - final para que no sea sobrescrito
    public final void generate() {
        System.out.println("  1. Obteniendo datos...");
        fetchData();
        
        System.out.println("  2. Procesando información...");
        processData();
        
        System.out.println("  3. Aplicando formato...");
        applyFormat();
        
        System.out.println("  4. Exportando archivo...");
        exportFile();
        
        System.out.println("Reporte generado exitosamente");
    }
    
    // Pasos fijos - implementados en la clase base
    private void fetchData() {
        System.out.println("     -> Datos obtenidos de la base de datos");
    }
    
    private void processData() {
        System.out.println("     -> Datos procesados y calculados");
    }
    
    // Pasos variables - implementados por las subclases
    protected abstract void applyFormat();
    protected abstract void exportFile();
}
