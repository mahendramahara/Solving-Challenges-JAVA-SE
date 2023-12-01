// Title: Method Overriding Example in Java

// Superclass
class Animal {
    // Method in the superclass
    void makeSound() {
        System.out.println("Some sound");
    }
}

// Subclass
class Dog extends Animal {
    // Method overridden in the subclass
    @Override
    void makeSound() {
        System.out.println("Woof");
    }
}

// Main class
public class MethodOverridingExample {
    public static void main(String[] args) {
        // Creating an instance of the subclass
        Dog dog = new Dog();
        // Calling the overridden method
        dog.makeSound(); // Output: Woof
    }
}
// © Mahendra Mahara 2023