// Interface defining a shape's properties
interface Shape {
    double getArea();

    double getPerimeter();
}

// Interface defining a printable object
interface Printable {
    void print();
}

// Class implementing both Shape and Printable
class Circle implements Shape, Printable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public void print() {
        System.out.println("Circle with radius: " + radius);
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        circle.print();
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());
    }
}
