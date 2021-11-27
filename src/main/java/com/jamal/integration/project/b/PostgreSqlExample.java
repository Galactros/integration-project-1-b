package com.jamal.integration.project.b;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PostgreSqlExample {

    public static void main(String[] args) {
        try ( Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jamal", "postgres", "admin")) {

            System.out.println("Connected to PostgreSQL database!");
            Statement statement = connection.createStatement();
            System.out.println("Reading car records...");
            System.out.printf("%-30.30s  %-30.30s%n", "Username", "Password");
            ResultSet resultSet = statement.executeQuery("SELECT * FROM accounts");
            while (resultSet.next()) {
                System.out.printf("%-30.30s  %-30.30s%n", resultSet.getString("username"), resultSet.getString("password"));
            }

        } catch (SQLException e) {
            System.out.println("Connection failure.");
            e.printStackTrace();
        }
    }
}
