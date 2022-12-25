package week12.example2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

// Connection + PreparedStatement
public class Example2 {

    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost/SIIT-DB";
        String user = "postgres";
        String pass = "postgres";

        String myProduct = "Pizza";
        int myPrice = 10;

// = "INSERT INTO public.product (id,name,price) VALUES (default, 'Soda', 5)";
        String sql = "INSERT INTO public.product VALUES (default, ?, ?)";

        try (Connection conn = DriverManager.getConnection(url, user, pass);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // this index starts from 1
            pstmt.setString(1, myProduct);
            pstmt.setDouble(2, myPrice);

            pstmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
