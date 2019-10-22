package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Jose Suresh Alejo
 * @author Alberto Ruíz
 */
public class Connect {

    private Connection conn = null;

    public Connect() {
    }

    public Connection getConnection() {
        try {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            String url = "jdbc:mysql://localhost:3306/juego?useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            conn = DriverManager.getConnection(url, "root", "elrincon1920");
        } catch (SQLException ex) {
            conn = null;
            System.out.println(ex);
            throw new RuntimeException("Error con la conexión!!!");
        }
        return conn;
    }
}
