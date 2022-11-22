
package capadatos;

import java.sql.Connection;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.swing.JRViewer;

public class ClsReportes {
    
    Connection con;
    public String RUTA_REPORTE="src\\Reportes\\";
    
    public JRViewer reporteInterno (String archivoReporte, Map<String,Object> parametros) throws Exception{
        try {
            Conexion estado = new Conexion();
            con = estado.conectar();
            
            JasperPrint miReporte = JasperFillManager.fillReport(RUTA_REPORTE+archivoReporte, parametros, con);
            JRViewer visorReporte= new JRViewer(miReporte);
            return visorReporte;
        } catch (JRException e) {
            throw new Exception ("Error al generar reporte!");
        }
    }
    
}
