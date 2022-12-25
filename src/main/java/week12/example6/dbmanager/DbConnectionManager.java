package week12.example6.dbmanager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnectionManager {

    private static final DbConnectionManager MANAGER = new DbConnectionManager();

    private DbConnectionManager() {

    }

    public static DbConnectionManager getInstance() {
        return MANAGER;
    }

    public Connection getConnection() {
        String url = "jdbc:postgresql://localhost/SIIT-DB";
        String user = "postgres";
        String pass = "postgres";

        try {
            return DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
