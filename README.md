```markdown
# Gestión de Reportes 📊

Este proyecto implementa un sistema de generación y descarga de reportes en diferentes formatos (PDF, Excel, CSV) utilizando el patrón de diseño **Abstract Factory** en Java. El usuario puede seleccionar el formato deseado mediante un menú interactivo en la consola.

## Estructura del Proyecto 🗂️

El proyecto sigue la siguiente estructura de carpetas:

```
```bash
gestion_reportes
└── src/main/java
    └── com.gestion_reportes
        ├── factory
        │   ├── CsvFactory.java
        │   ├── PdfFactory.java
        │   ├── ExcelFactory.java
        │   └── ReportFactory.java
        ├── models
        │   ├── Csv.java
        │   ├── Pdf.java
        │   └── Excel.java
        ├── Main.java
        ├── Reportes.java
        └── TypeOfReport.java
```

## Requisitos 📋

- **Java Development Kit (JDK)**: Asegúrate de tener instalado JDK 8 o superior.
- **IDE o Editor de Texto**: Puedes usar IntelliJ IDEA, Eclipse, VS Code o cualquier editor de tu preferencia.

## Configuración ⚙️

1. Clona este repositorio o descarga el código fuente.
2. Abre el proyecto en tu IDE o editor de texto.
3. Asegúrate de que el proyecto esté configurado para usar JDK 8 o superior.

## Ejecución 🚀

1. Abre una terminal en la raíz del proyecto.
2. Navega a la carpeta `src/main/java/com/gestion_reportes`.
3. Compila el código ejecutando:
   ```bash
   javac Main.java
   ```
4. Ejecuta el programa con:
   ```bash
   java com.gestion_reportes.Main
   ```

## Uso del Programa 🖥️

Al ejecutar el programa, se mostrará un menú en la consola:

```
Seleccione el formato del reporte:
1. PDF
2. Excel
3. CSV
Ingrese su opción (1, 2 o 3):
```

- Ingresa el número correspondiente al formato que deseas generar.
- El programa generará y descargará el reporte en el formato seleccionado.

### Ejemplo de Salida

Si seleccionas **Excel**, verás:

```
Generando reporte en formato Excel...
Descargando reporte en formato Excel...
```

## Detalles de Implementación 🛠️

### Patrón Abstract Factory

El patrón **Abstract Factory** se utiliza para crear familias de objetos relacionados (en este caso, reportes en diferentes formatos) sin especificar sus clases concretas. Esto permite que el código sea flexible y fácil de extender.

- **`ReportFactory`**: Interfaz base para las fábricas.
- **`PdfFactory`**, **`ExcelFactory`**, **`CsvFactory`**: Fábricas concretas que crean reportes en PDF, Excel y CSV, respectivamente.
- **`Reportes`**: Interfaz que define los métodos `generateReport()` y `downloadReport()`.
- **`Pdf`**, **`Excel`**, **`Csv`**: Implementaciones concretas de los reportes.

### Enumeración `TypeOfReport`

La enumeración `TypeOfReport` define los tipos de reportes disponibles:

```java
public enum TypeOfReport {
    PDF,
    EXCEL,
    CSV
}
```

### Clase `Main`

La clase `Main` es el punto de entrada del programa. Aquí se muestra el menú interactivo, se procesa la entrada del usuario y se genera el reporte correspondiente.

## Extensibilidad 🌟

Si deseas agregar más formatos de reportes en el futuro:

1. Crea una nueva clase en el paquete `models` que implemente la interfaz `Reportes`.
2. Crea una nueva fábrica en el paquete `factory` que implemente la interfaz `ReportFactory`.
3. Actualiza la enumeración `TypeOfReport` y la función `getReportType` en la clase `Main`.

## Contribuciones 🤝

¡Las contribuciones son bienvenidas! Si tienes ideas para mejorar el proyecto, sigue estos pasos:

1. Haz un fork del repositorio.
2. Crea una rama con tu nueva funcionalidad (`git checkout -b nueva-funcionalidad`).
3. Realiza tus cambios y haz commit (`git commit -m 'Agrega nueva funcionalidad'`).
4. Haz push a la rama (`git push origin nueva-funcionalidad`).
5. Abre un Pull Request.

## Licencia 📄

Este proyecto está bajo la licencia MIT. Consulta el archivo [LICENSE](LICENSE) para más detalles.


## Desarrollador
- Luis Alberto Talero Martinez
---

¡Gracias por usar este proyecto! Si tienes alguna pregunta o sugerencia, no dudes en abrir un issue o contactarme. 😊
```
