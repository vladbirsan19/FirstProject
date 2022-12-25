package week12.example3;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Example3 {

    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost/SIIT-DB";
        String user = "postgres";
        String pass = "postgres";

        String sql = "SELECT * FROM public.product";

        try (var conn = DriverManager.getConnection(url, user, pass);
             var pstmt = conn.prepareStatement(sql)) {

            /**
             * .execute() -> any SQL QUERY (SELECT, INSERT, UPDATE, ALTER TABLE, CREATE TABLE, DROP TABLE...)
             *            -> boolean - true if SELECT, false otherwise
             * .executeUpdate() -> INSERT, UPDATE, DELETE
             *                  -> int - how many rows were affected
             * .executeQuery() -> SELECT
             *                 -> ResultSet
             */

            // ResultSet is a table
            ResultSet rs = pstmt.executeQuery();

            // it uses a cursor
            // first time is positioned above the first line
            while (rs.next()) {
//                rs.getInt(1);
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
