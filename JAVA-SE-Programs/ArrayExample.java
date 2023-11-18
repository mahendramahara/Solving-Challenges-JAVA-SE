// Title: Array Demonstration in Java

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        // Declaring and initializing an array with literal values
        int[] numbers1 = {1, 2, 3, 4, 5};

        // Declaring and initializing an array with specified size
        int[] numbers2 = new int[5];
        numbers2[0] = 1;
        numbers2[1] = 2;
        numbers2[2] = 3;
        numbers2[3] = 4;
        numbers2[4] = 5;

        // Declaring and initializing an array with default values
        int[] numbers3 = new int[5];

        System.out.println("Original Array 1: " + Arrays.toString(numbers1));
        System.out.println("Original Array 2: " + Arrays.toString(numbers2));
        System.out.println("Original Array 3: " + Arrays.toString(numbers3));

        for (int i = 0; i < numbers1.length; i++) {
            numbers1[i] *= 2;
        }

        for (int i = 0; i < numbers2.length; i++) {
            numbers2[i] *= 2;
        }

        for (int i = 0; i < numbers3.length; i++) {
            numbers3[i] *= 2;
        }

        System.out.println("Modified Array 1: " + Arrays.toString(numbers1));
        System.out.println("Modified Array 2: " + Arrays.toString(numbers2));
        System.out.println("Modified Array 3: " + Arrays.toString(numbers3));
    }
}

// © Mahendra Mahara 2023
