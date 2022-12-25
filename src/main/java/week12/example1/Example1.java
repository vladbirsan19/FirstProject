package week12.example1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

// Connection + Statement
public class Example1 {
    //Connection -interface
    //implementation for the interface comes from the driver
    //dependency (org.postgresql) - driver
    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost/SIIT-DB";
        String name = "postgres";
        String pass = "Yousucck_19";


        // SQLException -> checked exception
        try (Connection conn = DriverManager.getConnection(url, name, pass);
             Statement stmt = conn.createStatement()) {

            String sql = "INSERT INTO public.product (id,name,price) VALUES (default, 'Soda', 5)";

            // execute(), executeQuery()
            // executeUpdate() - insert, update, delete
            stmt.executeUpdate(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        // java will close the resource automatically - finally
    }

}
