package com.wecp.progressive.dao;

import com.wecp.progressive.entity.Transactions;

import java.sql.SQLException;
import java.util.List;

public interface TransactionDAO {
<<<<<<< HEAD
    int addTransaction(Transactions transaction);
    Transactions getTransactionById(int transactionId);
    void updateTransaction(Transactions transaction);
    void deleteTransaction(int transactionId) ;
    List<Transactions> getAllTransactions();
=======
    int addTransaction(Transactions transaction) throws SQLException;
    Transactions getTransactionById(int transactionId) throws SQLException;
    void updateTransaction(Transactions transaction) throws SQLException;
    void deleteTransaction(int transactionId) throws SQLException;
    List<Transactions> getAllTransactions() throws SQLException;
>>>>>>> b59c1594ec22c506fd61e577027a81b044d1a42f
}
