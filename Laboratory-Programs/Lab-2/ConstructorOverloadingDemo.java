class ConstructorOverloadingDemo {

    private String name;
    private int age;

    // Constructor with no parameters
    public ConstructorOverloadingDemo() {
        name = "Default";
        age = 0;
    }

    // Constructor with one parameter
    public ConstructorOverloadingDemo(String n) {
        name = n;
        age = 0;
    }

    // Constructor with two parameters
    public ConstructorOverloadingDemo(String n, int a) {
        name = n;
        age = a;
    }

    // Constructor with one parameter
    public ConstructorOverloadingDemo(int a) {
        name = "Default";
        age = a;
    }

    // Method to display object information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println();
    }

    public static void main(String[] args) {
        ConstructorOverloadingDemo obj1 = new ConstructorOverloadingDemo();
        ConstructorOverloadingDemo obj2 = new ConstructorOverloadingDemo("Mahendra");
        ConstructorOverloadingDemo obj3 = new ConstructorOverloadingDemo("Harish", 15);
        ConstructorOverloadingDemo obj4 = new ConstructorOverloadingDemo(25);

        System.out.println("Object 1:");
        obj1.displayInfo();

        System.out.println("Object 2:");
        obj2.displayInfo();

        System.out.println("Object 3:");
        obj3.displayInfo();

        System.out.println("Object 4:");
        obj4.displayInfo();
    }
}
