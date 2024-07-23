package com.wecp.progressive.config;


public class DatabaseConnectionManager {

}

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionManager {
    private static final String URL = "jdbc:mysql://localhost:3306/banksafe_wecp";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}


>>>>>>> b59c1594ec22c506fd61e577027a81b044d1a42f
