package com.jamal.integration.project.b;

public class Main {

    public static void main(String[] args) {

        PostgresConnection app = new PostgresConnection();
        Car car = new Car("Jamal", "Focus");

        long id = app.insertCar(car);

        System.out.println(
                String.format("%s, %s car has been inserted with an id of %d",
                        car.getCarname(), car.getBrand(), id));
    }
}
