import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        // Map: Demonstrating HashMap
        System.out.println("\n*****************HASH MAP *****************\n");
        Map<String, Integer> hashMap = new HashMap<>();

        hashMap.put("Apple", 10);
        hashMap.put("Banana", 20);
        hashMap.put("Orange", 30);

        System.out.println("HashMap elements: " + hashMap);

        // Accessing values by key
        int appleQuantity = hashMap.get("Apple");
        System.out.println("Quantity of Apple: " + appleQuantity);

        // Checking if a key exists
        boolean containsKey = hashMap.containsKey("Banana");
        System.out.println("Does HashMap contain key 'Banana'? " + containsKey);

        // Iterating through key-value pairs
        System.out.println("Key-Value Pairs:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Removing a key-value pair
        hashMap.remove("Orange");
        System.out.println("HashMap after removing key 'Orange': " + hashMap);

        // Create a TreeMap
        System.out.println("\n*****************TREE MAP *****************\n");
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Add key-value pairs to the TreeMap
        treeMap.put(3, "Girls");
        treeMap.put(4, "Boys");
        treeMap.put(2, "child");
        treeMap.put(5, "Adults");

        // Display the TreeMap (naturally ordered by keys)
        System.out.println("TreeMap (Naturally Ordered by Keys):");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Access a specific value by key
        int keyToFind = 2;
        String value = treeMap.get(keyToFind);
        System.out.println("\nValue associated with key " + keyToFind + ": " + value);

        // Check if a key exists in the TreeMap
        int keyToCheck = 5;
        boolean iscontainsKey = treeMap.containsKey(keyToCheck);
        System.out.println("Does the TreeMap contain key " + keyToCheck + "? " + iscontainsKey);

        // Remove a key-value pair from the TreeMap
        int keyToRemove = 5;
        treeMap.remove(keyToRemove);
        System.out.println("\nTreeMap after removing key " + keyToRemove + ":");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
