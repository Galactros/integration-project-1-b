package com.jamal.integration.project.b;

public class Car {

    private String carname;

    private String brand;

    public Car(String carname, String brand) {
        this.carname = carname;
        this.brand = brand;
    }

    public Car() {

    }

    public String getCarname() {
        return carname;
    }

    public void setCarname(String carname) {
        this.carname = carname;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
