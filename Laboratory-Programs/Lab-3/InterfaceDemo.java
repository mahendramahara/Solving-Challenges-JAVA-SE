import java.util.Scanner;

// Interface
interface Clients {
    void input(); // Abstract method

    void output(); // Abstract method
}

// Concrete class implementing the interface
class Raju implements Clients {
    String name;
    double salary; // Changed from String to double for salary

    public void input() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter Username: ");
            name = scanner.nextLine();

            System.out.println("Enter Salary: ");
            salary = scanner.nextDouble();
        }
    }

    public void output() {
        System.out.println("\n********RESULT********");
        System.out.println("Name:" + name);
        System.out.println("Salary:" + salary);
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Clients c = new Raju(); // Use the Raju class
        c.input();
        c.output();
    }
}
