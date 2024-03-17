package org.example;

public class Collect {
    private static Car[] cars=new Car[5];
    public static int lastIndex=0;

    public static void collectCar(Car car){
        cars[lastIndex++]=car;

    }
    public static void displayInfo(){
        for (Car car:cars) {
            if(car!=null) {
                System.out.println(car.getMake() + "-" + car.getModel() + "-" + car.getYear());
            }
        }
    }
}
