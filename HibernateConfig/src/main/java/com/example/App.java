package com.example;

import org.hibernate.Session;
import com.example.model.Account;
import com.example.model.Transaction;
import com.example.util.HibernateUtil;

import java.util.List;

public class App {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        org.hibernate.Transaction hibernateTx = session.beginTransaction(); // Avoid name clash

        Account acc = new Account();
        acc.setAccountHolder("Rechal");

        Transaction t1 = new Transaction();
        t1.setAmount(1000);
        t1.setAccount(acc);

        Transaction t2 = new Transaction();
        t2.setAmount(500);
        t2.setAccount(acc);

        acc.addTransaction(t1);
        acc.addTransaction(t2);

        session.save(acc);

        hibernateTx.commit();
        session.close(); 

        Session newSession = HibernateUtil.getSessionFactory().openSession();
        Account account = newSession.get(Account.class, acc.getAccountId());

        if (account != null) {
            List<Transaction> transactions = account.getTransactions();
            System.out.println("Account Holder: " + account.getAccountHolder());
            for (Transaction t : transactions) {
                System.out.println("Transaction ID: " + t.getTransactionId() + ", Amount: " + t.getAmount());
            }
        } else {
            System.out.println("Account not found.");
        }

        newSession.close();
    }
}
