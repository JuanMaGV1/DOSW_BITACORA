package main.dosw.semana_4.taller4.Ejercicio03_SistemaReportesEmpresarial;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ReportFactory factory = new ReportFactoryImpl();
        
        List<String> tipos = List.of("PDF", "EXCEL", "CSV");

        tipos.stream().forEach(tipo -> {
            System.out.println("Solicitando: " + tipo);
            ReportGenerator report = factory.create(tipo);
            report.generate();
        });
        
    }
}