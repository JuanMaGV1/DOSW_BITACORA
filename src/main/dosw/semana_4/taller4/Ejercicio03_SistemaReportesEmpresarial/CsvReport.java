package main.dosw.semana_4.taller4.Ejercicio03_SistemaReportesEmpresarial;

public class CsvReport extends ReportGenerator {
    @Override
    protected void applyFormat() {
        System.out.println("     -> Aplicando formato CSV (separado por comas)");
    }
    
    @Override
    protected void exportFile() {
        System.out.println("     -> Exportando reporte.csv");
    }
}