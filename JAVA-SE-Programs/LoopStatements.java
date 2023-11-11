// Title: Looping Statements Demonstration in Java

public class LoopStatements {
    public static void main(String[] args) {
        // For loop
        System.out.println("For loop:");
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }

        // While loop
        System.out.println("While loop:");
        int j = 0;
        while (j < 5) {
            System.out.println("j = " + j);
            j++;
        }

        // Do-while loop
        System.out.println("Do-while loop:");
        int k = 0;
        do {
            System.out.println("k = " + k);
            k++;
        } while (k < 5);

        // For-each loop (Enhanced for loop)
        System.out.println("For-each loop:");
        int[] numbers = {1, 2, 3, 4, 5};
        for (int num : numbers) {
            System.out.println("Number: " + num);
        }
    }
}

// © Mahendra Mahara 2023
