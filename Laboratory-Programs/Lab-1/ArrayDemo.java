public class ArrayDemo {
    public static void main(String[] args) {
        // One-dimensional array
        System.out.println("One-Dimensional Array:");
        int[] arr1D = { 1, 2, 3, 4, 5 };

        for (int i = 0; i < arr1D.length; i++) {
            System.out.println("Element at index " + i + ": " + arr1D[i]);
        }

        // Two-dimensional array
        System.out.println("\nTwo-Dimensional Array:");
        int[][] arr2D = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                System.out.println("Element at row " + i + ", column " + j + ": " + arr2D[i][j]);
            }
        }

        // Jagged array
        System.out.println("\nJagged Array:");
        int[][] jaggedArray = { { 1, 2, 3 }, { 4, 5 }, { 6, 7, 8, 9 } };

        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.println("Element at row " + i + ", column " + j + ": " + jaggedArray[i][j]);
            }
        }
    }
}
