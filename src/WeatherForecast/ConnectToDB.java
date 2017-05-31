/*
 * Sapayth Hossain
 */
package WeatherDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * @author sapaythhossain
 */
public class ConnectToDB {

    public static Connection connect() {
        Connection conn = null;
        String url = "jdbc:sqlite:ToDoDatabase.sqlite";
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection(url);
            System.out.println("connected");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.toString());
        }
        return conn;
    }
}