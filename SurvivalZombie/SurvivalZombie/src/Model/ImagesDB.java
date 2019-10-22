package Model;

import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Jose Suresh Alejo
 * @author Alberto Ruíz
 */
public class ImagesDB {

    private final Connect conn;

    public ImagesDB() {
        conn = new Connect();
    }

    public ResultSet executeQuery(String sqlQuery) {
        ResultSet rs = null;
        try {
            Statement stmt = conn.getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = stmt.executeQuery(sqlQuery);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return rs;
    }

    public File getImage(int id) {
        File result = null;
        ResultSet rs = executeQuery("SELECT * FROM imagenes");
        try {
            while (rs.next()) {
                if (id == rs.getInt(1)) {
                    result = new File(rs.getString(2));
                    return result;
                }
            }
        } catch (Exception e) {
        }
        return result;
    }

}
