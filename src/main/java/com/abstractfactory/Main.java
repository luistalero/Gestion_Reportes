package com.abstractfactory;

import com.abstractfactory.factory.ReportFactory;
import com.abstractfactory.factory.PdfFactory;
import com.abstractfactory.factory.ExcelFactory;
import com.abstractfactory.factory.CsvFactory;  
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String menu = """
        =====================================
        === Seleccione el tipo de reporte ===
        =====================================
        1. Excel
        2. PDF
        3. CSV
        =====================================       
        """;
        System.out.println(menu);
        int option = sc.nextInt();

        TypeOfReport reportType = getReportType(option);

        if (reportType == null) {
            System.out.println("Opción no válida");
            sc.close();
            return;
        }

        ReportFactory factory = getFactory(reportType);

        Reportes report = factory.createReport();
        report.generateReport();
        report.downloadReport();

        sc.close();
    }

    private static TypeOfReport getReportType(int opcion) {
        switch (opcion) {
            case 1:
                return TypeOfReport.PDF;
            case 2:
                return TypeOfReport.EXCEL;
            case 3:
                return TypeOfReport.CSV;
            default:
                return null;
        }
    }

    private static ReportFactory getFactory(TypeOfReport reportType) {
        switch (reportType) {
            case PDF:
                return new PdfFactory();
            case EXCEL:
                return new ExcelFactory();
            case CSV:
                return new CsvFactory();
            default:
                throw new IllegalArgumentException("Tipo de reporte no soportado");
        }
    }
}