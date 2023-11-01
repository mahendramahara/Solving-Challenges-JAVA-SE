// Title: Constructor Types Demonstration in Java

public class ConstructorExample {
    private String name;
    private int age;

    // Default constructor
    public ConstructorExample() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Parameterized constructor
    public ConstructorExample(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public ConstructorExample(ConstructorExample obj) {
        this.name = obj.name;
        this.age = obj.age;
    }

    // Constructor with default values
    public ConstructorExample(String name) {
        this.name = name;
        this.age = 0;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        // Creating objects using different constructors
        ConstructorExample obj1 = new ConstructorExample();
        ConstructorExample obj2 = new ConstructorExample("John", 30);
        ConstructorExample obj3 = new ConstructorExample(obj2); // Copy constructor
        ConstructorExample obj4 = new ConstructorExample("Alice");

        // Displaying object information
        System.out.println("Object 1 - Name: " + obj1.getName() + ", Age: " + obj1.getAge());
        System.out.println("Object 2 - Name: " + obj2.getName() + ", Age: " + obj2.getAge());
        System.out.println("Object 3 - Name: " + obj3.getName() + ", Age: " + obj3.getAge());
        System.out.println("Object 4 - Name: " + obj4.getName() + ", Age: " + obj4.getAge());
    }
}

// © Mahendra Mahara 2023
