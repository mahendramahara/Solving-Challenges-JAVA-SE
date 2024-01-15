// Title: Constructor Overloading and Method Overriding Example in Java

class Vehicle {
    String type;

    public Vehicle() {
        this.type = "Generic Vehicle";
    }

    public Vehicle(String type) {
        this.type = type;
    }

    void displayType() {
        System.out.println("Type of Vehicle: " + type);
    }
}

class Car extends Vehicle {
    public Car() {
        super("Car");
    }

    // Overriding displayType method for Car
    @Override
    void displayType() {
        System.out.println("Type of Vehicle: Car");
    }
}

class Motorcycle extends Vehicle {
    public Motorcycle() {
        super("Motorcycle");
    }

    // Overriding displayType method for Motorcycle
    @Override
    void displayType() {
        System.out.println("Type of Vehicle: Motorcycle");
    }
}

public class ConstructorMethodExample {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();

        car.displayType();
        motorcycle.displayType();
    }
}

// © Mahendra Mahara 2023
