package com.abstractfactory.models;

import com.abstractfactory.Reportes;

public class Csv implements Reportes{

    @Override
    public void generateReport() {
        System.out.println("📝 Generando reporte en CSV...");
    }

    @Override
    public void downloadReport() {
        System.out.println("'⬇️ Descargando reporte en CSV...");
    }

}


