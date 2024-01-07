// Title: Encapsulation Example in Java

public class EncapsulationExample {
    private String name;
    private int age;

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age
    public void setAge(int age) {
        if (age >= 0) { // Validate age
            this.age = age;
        } else {
            System.out.println("Invalid age. Age should be a non-negative value.");
        }
    }

    public static void main(String[] args) {
        EncapsulationExample obj = new EncapsulationExample();

        // Setting values using setter methods
        obj.setName("John");
        obj.setAge(30);

        // Getting values using getter methods and printing
        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());

        // Trying to set an invalid age
        obj.setAge(-5); // This will print "Invalid age. Age should be a non-negative value."

        // Getting the updated age and printing
        System.out.println("Updated Age: " + obj.getAge()); // This will still print the previously set age (30)
    }
}

// © Mahendra Mahara 2023
