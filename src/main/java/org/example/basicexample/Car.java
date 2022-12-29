package org.example.basicexample;

public class Car {
    public String brand;
    private String model;
    private int year;
    private int speed=0;
    private boolean isActive=false;

    //GETTERS
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isActive() {
        return isActive;
    }

    //SETTERS
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    //CONSTRUCTORS
    public Car(String brand, String model, int year, int speed) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.speed = speed;
    }

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public Car(){
    }

    //METHODS
    public void start(){
        if (isActive()){
            System.out.println("Car already active");
            return;
        }
        System.out.println("Starting car...");
        setSpeed(1);
        setActive(true);
    }
    public void accelerate(int speed){
        if (!isActive()){
            System.out.println("Car not active");
            return;
        }
        setSpeed( getSpeed()+speed );
    }

    public void slowDown(int speed){
        if (!isActive()){
            System.out.println("Car not active");
            return;
        }
        setSpeed( getSpeed()-speed );
        if (getSpeed()<=0){
            stop();
        }
    }

    public void stop(){
        if (!isActive()){
            System.out.println("Car not active");
            return;
        }
        System.out.println("Stopping car...");
        setSpeed(0);
        setActive(false);
    }
}
