package com.jamal.integration.project.b;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PostgresConnection {

    private final String url = "jdbc:postgresql://localhost:5432/cars";
    private final String user = "postgres";
    private final String password = "admin";

    public Connection dbcon() {
        Connection dbcon = null;

        try {
            dbcon = DriverManager.getConnection(url, user, password);
            System.out.println("You are now connected to the server");
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }

        return dbcon;
    }

    public long insertCar(Car car) {
        String SQLinsert = "INSERT INTO tblcars(carname,brand) "
                + "VALUES(?,?)";

        long id = 0;

        try ( Connection dbcon = dbcon();  PreparedStatement prepareStatement = dbcon.prepareStatement(SQLinsert, Statement.RETURN_GENERATED_KEYS)) {
            prepareStatement.setString(1, car.getCarname());
            prepareStatement.setString(2, car.getBrand());

            int rowsAffected = prepareStatement.executeUpdate();

            if (rowsAffected > 0) {

                try ( ResultSet rs = prepareStatement.getGeneratedKeys()) {
                    if (rs.next()) {
                        id = rs.getLong(1);
                    }
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return id;
    }

}
