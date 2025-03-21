package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgresConnection {
    public static void main(String[] args) {
        // JDBC URL, username, and password of the PostgreSQL database
        String jdbcURL = "jdbc:postgresql://localhost:5432/dbproo";
        String username = "postgres";
        String password = "pgufc";

        // Connection object
        Connection connection = null;

        try {
            // Connect to the PostgreSQL database
            connection = DriverManager.getConnection(jdbcURL, username, password);
            System.out.println("Connected to PostgreSQL database!");


        } catch (SQLException e) {
            System.out.println("Failed to connect to PostgreSQL database.");
            e.printStackTrace();
        } finally {
            // Close the connection
            try {
                if (connection != null) {
                    connection.close();
                    System.out.println("Connection closed.");
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
