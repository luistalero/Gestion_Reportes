package com.abstractfactory.factory;

import com.abstractfactory.Reportes;
import com.abstractfactory.models.Pdf;

public class PdfFactory implements ReportFactory {
    @Override
    public Reportes createReport() {
        return new Pdf();
    }    
}
