package com.abstractfactory.models;

import com.abstractfactory.Reportes;

public class Excel implements Reportes{

    @Override
    public void generateReport() {
        // TODO Auto-generated method stub
        System.out.println("📊 Generando reporte en EXCEL...");
    }

    @Override
    public void downloadReport() {
        // TODO Auto-generated method stub
        System.out.println("⬇️ Descargando reporte en EXCEL...");
    }

}
