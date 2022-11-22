package capadatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conexion {

    private final String URL = "jdbc:postgresql://localhost:5432/bd_jorge";
    private final String USER = "postgres";
    private final String PASS = "admin";

    public Connection conectar() {

        Connection con = null;

        try {
            
            Class.forName("org.postgresql.Driver");

            con = DriverManager.getConnection(URL, USER, PASS);
            
        } catch (SQLException e) {
            e.printStackTrace(System.err);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }

        return con;

    }

}
