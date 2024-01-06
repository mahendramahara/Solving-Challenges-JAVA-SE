// Title: Types of Inheritance Example in Java

// Base class
class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }
}

// Single Inheritance: Dog inherits from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking...");
    }
}

// Multilevel Inheritance: Puppy inherits from Dog
class Puppy extends Dog {
    void wagTail() {
        System.out.println("Puppy is wagging tail...");
    }
}

// Hierarchical Inheritance: Cat and Lion inherit from Animal
class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing...");
    }
}

class Lion extends Animal {
    void roar() {
        System.out.println("Lion is roaring...");
    }
}

// Multiple Inheritance (using interfaces): Bird implements both Flyable and Singable
interface Flyable {
    void fly();
}

interface Singable {
    void sing();
}

class Bird implements Flyable, Singable {
    @Override
    public void fly() {
        System.out.println("Bird is flying...");
    }

    @Override
    public void sing() {
        System.out.println("Bird is singing...");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        // Single Inheritance
        Dog dog = new Dog();
        dog.eat();
        dog.bark();

        // Multilevel Inheritance
        Puppy puppy = new Puppy();
        puppy.eat();
        puppy.bark();
        puppy.wagTail();

        // Hierarchical Inheritance
        Cat cat = new Cat();
        cat.eat();
        cat.meow();

        Lion lion = new Lion();
        lion.eat();
        lion.roar();

        // Multiple Inheritance (using interfaces)
        Bird bird = new Bird();
        bird.fly();
        bird.sing();
    }
}

// © Mahendra Mahara 2023
