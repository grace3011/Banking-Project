package com.wecp.progressive.dao;


import com.wecp.progressive.entity.Accounts;


import java.util.List;


import java.sql.SQLException;


public interface AccountDAO {
    int addAccount(Accounts accounts) throws SQLException;
    Accounts getAccountById(int accountId) throws SQLException;
    void updateAccount(Accounts accounts) throws SQLException;
    void deleteAccount(int accountId) throws SQLException;
    List<Accounts> getAllAccounts() throws SQLException;

}
