// Title: Demonstration of Core Classes and Packages in Java

import java.util.ArrayList;
import java.util.Random;

public class CoreClassesPackages {
    public static void main(String[] args) {
        // Using built-in classes
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("World");
        System.out.println("ArrayList: " + arrayList);

        Random random = new Random();
        int randomNumber = random.nextInt(100);
        System.out.println("Random Number: " + randomNumber);
    }
}

// © Mahendra Mahara 2023
