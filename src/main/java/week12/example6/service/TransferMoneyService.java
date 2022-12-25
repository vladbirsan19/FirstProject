package week12.example6.service;

import week12.example6.dbmanager.DbConnectionManager;
import week12.example6.exception.AccountNotFoundException;
import week12.example6.model.Account;
import week12.example6.repository.AccountRepository;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.Optional;

public class TransferMoneyService {

    private final AccountRepository repository;

    public TransferMoneyService() {
        this.repository = new AccountRepository();
    }

    public void transferMoney(int fromAccount, int toAccount, BigDecimal amount) {

        try (var conn = DbConnectionManager.getInstance().getConnection()) {
            Optional<Account> from = repository.findAccount(conn, fromAccount);
            Optional<Account> to = repository.findAccount(conn, toAccount);

            // because of Optional
            var a1 = from.orElseThrow(AccountNotFoundException::new);
            var a2 = to.orElseThrow(AccountNotFoundException::new);

            a1.setAmount(a1.getAmount().subtract(amount));
            a2.setAmount(a2.getAmount().add(amount));

            // TRANSACTION
            conn.setAutoCommit(false);

            repository.updateAccount(conn, a1);
//            if (true) throw new RuntimeException();
            repository.updateAccount(conn, a2);

            conn.commit();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

}
