class Vehicle {
    String make;
    String model;
    int year;
    int maximumSpeed;

    // Constructor for Vehicle class
    public Vehicle(String make, String model, int year, int maximumSpeed) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.maximumSpeed = maximumSpeed;
    }

    // Drive method in the Vehicle class
    public void drive() {
        System.out.println(make + " " + model + " is driving.");
    }
}

class Car extends Vehicle {
    // Constructor for Car class calling super() to invoke the parent class constructor
    public Car(String make, String model, int year, int maximumSpeed) {
        super(make, model, year, maximumSpeed);
    }

    // Override drive method for Car
    @Override
    public void drive() {
        System.out.println(make + " " + model + " Car is driving.");
    }
}

class Bike extends Vehicle {
    // Constructor for Bike class calling super() to invoke the parent class constructor
    public Bike(String make, String model, int year, int maximumSpeed) {
        super(make, model, year, maximumSpeed);
    }

    // Override drive method for Bike
    @Override
    public void drive() {
        System.out.println(make + " " + model + " Bike is driving.");
    }
}

public class Main1 {
    public static void main(String[] args) {
        // Instantiate Car and Bike objects
        Car car = new Car("Toyota", "Camry", 2022, 180);
        Bike bike = new Bike("Honda", "CBR", 2022, 200);

        // Print attributes and call drive() method for Car
        System.out.println("Car Details:");
        System.out.println("Make: " + car.make);
        System.out.println("Model: " + car.model);
        System.out.println("Year: " + car.year);
        System.out.println("Maximum Speed: " + car.maximumSpeed + " km/h");
        car.drive();

        System.out.println(); // Adding a line break for better readability

        // Print attributes and call drive() method for Bike
        System.out.println("Bike Details:");
        System.out.println("Make: " + bike.make);
        System.out.println("Model: " + bike.model);
        System.out.println("Year: " + bike.year);
        System.out.println("Maximum Speed: " + bike.maximumSpeed + " km/h");
        bike.drive();
    }
}
