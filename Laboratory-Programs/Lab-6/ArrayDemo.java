public class ArrayDemo {
    public static void main(String[] args) {
        // Single-dimensional array
        int[] singleDimArray = new int[5];
        singleDimArray[0] = 10;
        singleDimArray[1] = 20;
        singleDimArray[2] = 30;
        singleDimArray[3] = 40;
        singleDimArray[4] = 50;

        System.out.println("Single-Dimensional Array:");
        for (int i = 0; i < singleDimArray.length; i++) {
            System.out.println("Element at index " + i + ": " + singleDimArray[i]);
        }

        // Double-dimensional array (matrix)
        int[][] doubleDimArray = new int[3][3];
        doubleDimArray[0][0] = 1;
        doubleDimArray[0][1] = 2;
        doubleDimArray[0][2] = 3;
        doubleDimArray[1][0] = 4;
        doubleDimArray[1][1] = 5;
        doubleDimArray[1][2] = 6;
        doubleDimArray[2][0] = 7;
        doubleDimArray[2][1] = 8;
        doubleDimArray[2][2] = 9;

        System.out.println("\nDouble-Dimensional Array (Matrix):");
        for (int i = 0; i < doubleDimArray.length; i++) {
            for (int j = 0; j < doubleDimArray[i].length; j++) {
                System.out.print(doubleDimArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
