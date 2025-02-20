package com.doctorrv.util;
     



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    // Database URL
    private static final String URL = "jdbc:mysql://localhost:8089/Xdoctorrv"; 
    private static final String USER = "root"; 
    private static final String PASSWORD = "admin"; 

    public static Connection getConnection() {
        Connection connection = null;
        try {
            // Establish the connection
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connection to the database successful!");
        } catch (SQLException e) {
            System.out.println("Connection failed: " + e.getMessage());
        }
        return connection;
    }
}




