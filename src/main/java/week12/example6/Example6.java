package week12.example6;

import week12.example6.service.TransferMoneyService;

import java.math.BigDecimal;


    // TRANSACTION
// transfer amount from one account to another
    public class Example6 {

        public static void main(String[] args) {

            TransferMoneyService tms = new TransferMoneyService();

            tms.transferMoney(1, 2, BigDecimal.valueOf(100));


        }
    }


