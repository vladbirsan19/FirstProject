package week12.example5;

import java.sql.DriverManager;
import java.sql.SQLException;

// DELETE + .execute()
public class Example5 {

    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost/SIIT-DB";
        String user = "postgres";
        String pass = "postgres";

        String sql = "DELETE FROM public.product WHERE id = ?";

        try (var conn = DriverManager.getConnection(url, user, pass);
             var pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, 2);
            // DANGEROUS METHOD -> .execute()
            boolean execute = pstmt.execute();
            // true if SELECT
            // false otherwise
            System.out.println(execute);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
