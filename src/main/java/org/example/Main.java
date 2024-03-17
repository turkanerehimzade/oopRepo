package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            carList();
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            switch (a) {
                case 1:
                    addCar();
                    printAllCars();
                    break;
                case 2:
                    System.out.println("Sistemden chixildi");
                    System.exit(0);
                    break;
            }
        }
    }

        public static void carList () {
            Scanner scanner = new Scanner(System.in);
            String list = "1.Mashini daxil edin" +
                    "\n2.Sistemden chix";
            System.out.println(list);

        }
        public static Car addCar() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("mashinin istehsalini daxil edin:");
            String carMake = scanner.nextLine();
            System.out.println("mashinin modelini daxil edin:");
            String carModel = scanner.nextLine();
            System.out.println("mashinin ilini daxil edin:");
            int carYear = scanner.nextInt();

            Car car = new Car(carMake, carModel, carYear);
            return car;

        }
        public static void printAllCars () {
            Collect.displayInfo();

        }}
