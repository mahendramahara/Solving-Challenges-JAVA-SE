class DogWithoutThis {
    String name;
    int weight;
    int age;

    void setData(String A, int B, int C) {
        name = A; // No "this" keyword needed here
        weight = B; // No "this" keyword needed here
        age = C; // No "this" keyword needed here
    }

    void display() {
        System.out.println("Dog Name: " + name);
        System.out.println("Dog Weight: " + weight);
        System.out.println("Dog Age: " + age);
    }
}

class DogWithThis {
    String name;
    int weight;
    int age;

    void setData(String name, int weight, int age) {
        this.name = name; // "this" keyword is used to distinguish between instance variable and parameter
        this.weight = weight;
        this.age = age; // "this" keyword is used to distinguish between instance variable and parameter
    }

    void display() {
        System.out.println("Dog Name: " + this.name); // "this" keyword is used to access instance variable
        System.out.println("Dog Weight: " + this.weight); // "this" keyword is used to access instance variable
        System.out.println("Dog Age: " + this.age); // "this" keyword is used to access instance variable
    }
}

public class DemonstrateClassAndObject {
    public static void main(String[] args) {
        // Demonstrate without "this" keyword
        DogWithoutThis Dog1 = new DogWithoutThis();
        Dog1.setData("Tommy", 15, 5);
        Dog1.display();
        System.out.println("----------------------------------------------");
        // Demonstrate with "this" keyword
        DogWithThis Dog2 = new DogWithThis();
        Dog2.setData("Bob", 12, 4);
        Dog2.display();
    }
}
