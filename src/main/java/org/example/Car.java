package org.example;

public class Car {
    public Car(String make,String model,int year){
        System.out.println(make+" "+model+" "+year);
    }
    private String make;
    private String model;
    private int year;
    public static int maxSpeedLimit=120;
    public static int getMaxSpeedLimit(){
        return maxSpeedLimit;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


}
