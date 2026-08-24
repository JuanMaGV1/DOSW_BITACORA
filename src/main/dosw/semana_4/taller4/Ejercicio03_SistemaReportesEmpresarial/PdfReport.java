package main.dosw.semana_4.taller4.Ejercicio03_SistemaReportesEmpresarial;

public class PdfReport extends ReportGenerator {
    @Override
    protected void applyFormat() {
        System.out.println("     -> Aplicando formato PDF (con estilos profesionales)");
    }
    
    @Override
    protected void exportFile() {
        System.out.println("     -> Exportando reporte.pdf");
    }
}