// Title: Dynamic Method Dispatch Example in Java

// Superclass
class Animal {
    void makeSound() {
        System.out.println("Some sound");
    }
}

// Subclasses
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow");
    }
}

public class DynamicMethodDispatchExample {
    public static void main(String[] args) {
        Animal animal1 = new Dog(); // Dynamic method dispatch
        animal1.makeSound(); // Output: Woof
        
        Animal animal2 = new Cat(); // Dynamic method dispatch
        animal2.makeSound(); // Output: Meow
    }
}

// © Mahendra Mahara 2023
