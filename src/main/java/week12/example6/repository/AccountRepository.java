package week12.example6.repository;

import week12.example6.model.Account;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

public class AccountRepository {

    public Optional<Account> findAccount(Connection con, int id) {
        String sql = "SELECT * FROM public.account WHERE id = ? ";
        try (var pstmt = con.prepareStatement(sql)) {

            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                var acc = new Account(
                        rs.getInt("id"),
                        rs.getBigDecimal("amount")
                );
                return Optional.of(acc);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return Optional.empty();
    }

    public void updateAccount(Connection con, Account acc) {
        String sql = "UPDATE public.account SET amount = ? WHERE id = ?";
        try (var pstmt = con.prepareStatement(sql)) {

            pstmt.setBigDecimal(1, acc.getAmount());
            pstmt.setInt(2, acc.getId());

            pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
