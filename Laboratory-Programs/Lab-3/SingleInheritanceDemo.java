// Parent class
class Vehicle {
    String brand;
    
    Vehicle(String brand) {
        this.brand = brand;
    }
    
    void displayBrand() {
        System.out.println("Brand: " + brand);
    }
}

// Child class inheriting from Vehicle
class Car extends Vehicle {
    int numDoors;
    
    Car(String brand, int numDoors) {
        super(brand);
        this.numDoors = numDoors;
    }
    
    void displayDetails() {
        displayBrand();
        System.out.println("Number of doors: " + numDoors);
    }
}

public class SingleInheritanceDemo {
    public static void main(String[] args) {
        // Creating an instance of the child class
        Car myCar = new Car("Toyota", 4);
        
        // Calling methods from the parent and child classes
        myCar.displayDetails();
    }
}
