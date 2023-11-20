// Title: Polymorphism Example in Java

class Animal {
    void makeSound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof");
    }

    void fetch() {
        System.out.println("Fetching...");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        // Runtime polymorphism (method overriding)
        Animal animal1 = new Animal();
        animal1.makeSound();

        Animal animal2 = new Dog();
        animal2.makeSound();
        
        // Compile-time polymorphism (method overloading)
        PolymorphismExample obj = new PolymorphismExample();
        obj.display();
        obj.display(5);
    }

    void display() {
        System.out.println("Displaying something");
    }

    void display(int num) {
        System.out.println("Displaying " + num);
    }
}

// © Mahendra Mahara 2023
