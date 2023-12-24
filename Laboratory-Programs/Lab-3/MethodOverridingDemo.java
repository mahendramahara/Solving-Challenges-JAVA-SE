// Superclass
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

// Subclass
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class MethodOverridingDemo {
    public static void main(String[] args) {
        Animal animal1 = new Dog(); // Polymorphism
        Animal animal2 = new Cat(); // Polymorphism

        animal1.makeSound(); // Calls Dog's overridden method
        animal2.makeSound(); // Calls Cat's overridden method
    }
}
