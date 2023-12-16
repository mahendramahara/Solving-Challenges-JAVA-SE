// Title: Demonstration of Map Classes in Java

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapClasses {
    public static void main(String[] args) {
        // Using HashMap
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(3, "Three");
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        System.out.println("HashMap: " + hashMap);

        // Using LinkedHashMap
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(3, "Three");
        linkedHashMap.put(1, "One");
        linkedHashMap.put(2, "Two");
        System.out.println("LinkedHashMap: " + linkedHashMap);

        // Using TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "Three");
        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        System.out.println("TreeMap: " + treeMap);
    }
}

// © Mahendra Mahara 2023
