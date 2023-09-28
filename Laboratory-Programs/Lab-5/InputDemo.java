import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        // Using Scanner for input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number using Scanner: ");
        int num1 = scanner.nextInt();
        System.out.println("You entered: " + num1);

        System.out.print("Enter a line of text using Scanner: ");
        scanner.nextLine(); // Consume the newline character left by nextInt()
        String text1 = scanner.nextLine();
        System.out.println("You entered: " + text1);

        // Using BufferedReader for input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter another number using BufferedReader: ");
            int num2 = Integer.parseInt(reader.readLine());
            System.out.println("You entered: " + num2);

            System.out.print("Enter another line of text using BufferedReader: ");
            String text2 = reader.readLine();
            System.out.println("You entered: " + text2);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Close the resources
        scanner.close();
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
