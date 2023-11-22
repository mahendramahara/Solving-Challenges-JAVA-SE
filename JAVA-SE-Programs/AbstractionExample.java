// Title: Abstraction Example in Java

abstract class Shape {
    abstract void draw();
}

interface Sound {
    void makeSound();
}

class Circle extends Shape implements Sound {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }

    @Override
    public void makeSound() {
        System.out.println("Circle makes a sound");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();
        circle.makeSound();
    }
}

// © Mahendra Mahara 2023
