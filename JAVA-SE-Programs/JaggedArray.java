// Title: Jagged Array Demonstration in Java

public class JaggedArray {
    public static void main(String[] args) {
        // Declaring and initializing a jagged array
        int[][] jaggedArray = {
            {1, 2, 3},          // First row with 3 columns
            {4, 5},             // Second row with 2 columns
            {6, 7, 8, 9}        // Third row with 4 columns
        };

        // Displaying the jagged array
        System.out.println("Jagged Array:");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}

// © Mahendra Mahara 2023
