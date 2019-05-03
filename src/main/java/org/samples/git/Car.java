package org.samples.git;

public class Car {

    private String name;

    private String brand;

    private Integer wheels;

    public Integer getWheels() {
        return wheels;
    }

    public void setWheels(Integer wheels) {
        this.wheels = wheels;
    }

    public Car(String name, String brand, Integer wheels) {
        this.name = name;
        this.brand = brand;
        this.wheels = wheels;
    }

    public Car(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
