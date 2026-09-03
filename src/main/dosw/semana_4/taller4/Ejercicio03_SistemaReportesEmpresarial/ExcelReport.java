package main.dosw.semana_4.taller4.Ejercicio03_SistemaReportesEmpresarial;

public class ExcelReport extends ReportGenerator {
    @Override
    protected void applyFormat() {
        System.out.println("     -> Aplicando formato Excel (con celdas y fórmulas)");
    }
    
    @Override
    protected void exportFile() {
        System.out.println("     -> Exportando reporte.xlsx");
    }
}