package com.abstractfactory.factory;

import com.abstractfactory.Reportes;
import com.abstractfactory.models.Excel;

public class ExcelFactory implements ReportFactory{
    @Override
    public Reportes createReport() {
        return new Excel();
    }
}
