// Abstract class
abstract class Shape {
    abstract double calculateArea(); // Abstract method

    void display() {
        System.out.println("This is a shape.");
    }
}

// Concrete subclass
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Concrete subclass
class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double calculateArea() {
        return length * width;
    }
}

public class AbstractionClassDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        circle.display();
        System.out.println("Area of circle: " + circle.calculateArea());

        rectangle.display();
        System.out.println("Area of rectangle: " + rectangle.calculateArea());
    }
}
