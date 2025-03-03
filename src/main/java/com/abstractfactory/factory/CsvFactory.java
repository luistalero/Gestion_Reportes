package com.abstractfactory.factory;

import com.abstractfactory.Reportes;
import com.abstractfactory.models.Csv;

public class CsvFactory implements ReportFactory {
    @Override
    public Reportes createReport() {
        return new Csv();
    }

}
