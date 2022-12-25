package week12.example4;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

// SELECT + WHERE
public class Example4 {

    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost/SIIT-DB";
        String user = "postgres";
        String pass = "postgres";

        String sql = "SELECT * FROM public.product WHERE price > ?";

        try (var conn = DriverManager.getConnection(url, user, pass);
             var pstmt = conn.prepareStatement(sql)) {

            pstmt.setDouble(1, 10);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                double price = rs.getDouble("price");

                System.out.println(id + "  " + name + " " + price);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
