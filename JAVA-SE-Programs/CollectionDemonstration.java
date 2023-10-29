// Title: Exploring Collection Classes

import java.util.*;

public class CollectionDemonstration {

    public static void main(String[] args) {

        // **List Example:**
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        System.out.println("List (ArrayList): " + names);

        // **Set Example:**
        Set<Integer> uniqueNumbers = new HashSet<>();
        uniqueNumbers.add(1);
        uniqueNumbers.add(2);
        uniqueNumbers.add(3);
        uniqueNumbers.add(2); // Duplicate ignored

        System.out.println("Set (HashSet): " + uniqueNumbers);

        // **Map Example:**
        Map<String, Integer> ages = new HashMap<>();
        ages.put("Alice", 25);
        ages.put("Bob", 30);
        ages.put("Charlie", 28);

        System.out.println("Map (HashMap): " + ages);

        // **Iterating through Collections:**
        for (String name : names) {
            System.out.println("Name: " + name);
        }

        for (Integer number : uniqueNumbers) {
            System.out.println("Unique number: " + number);
        }

        for (Map.Entry<String, Integer> entry : ages.entrySet()) {
            System.out.println("Person: " + entry.getKey() + ", Age: " + entry.getValue());
        }

        // **Additional Operations:**
        List<String> sortedNames = new ArrayList<>(names);
        Collections.sort(sortedNames); // Sort elements
        System.out.println("Sorted list: " + sortedNames);

        if (uniqueNumbers.contains(2)) {
            System.out.println("Set contains 2");
        }

        Map<String, Integer> filteredAges = new HashMap<>();
        for (Map.Entry<String, Integer> entry : ages.entrySet()) {
            if (entry.getValue() >= 28) {
                filteredAges.put(entry.getKey(), entry.getValue());
            }
        }
        System.out.println("Filtered map: " + filteredAges);
    }
}

// © Mahendra Mahara 2023
