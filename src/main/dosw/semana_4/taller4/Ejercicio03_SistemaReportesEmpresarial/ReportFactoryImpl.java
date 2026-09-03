package main.dosw.semana_4.taller4.Ejercicio03_SistemaReportesEmpresarial;

public class ReportFactoryImpl implements ReportFactory {
    @Override
    public ReportGenerator create(String type) {
        switch (type.toUpperCase()) {
            case "PDF": return new PdfReport();
            case "EXCEL": return new ExcelReport();
            case "CSV": return new CsvReport();
            default: throw new IllegalArgumentException("Tipo no soportado: " + type);
        }
    }
}