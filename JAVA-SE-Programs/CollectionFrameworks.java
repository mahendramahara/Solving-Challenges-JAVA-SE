// Title: Demonstration of Collection Frameworks in Java

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class CollectionFrameworks {
    public static void main(String[] args) {
        // Using ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        System.out.println("ArrayList: " + arrayList);

        // Using LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        System.out.println("LinkedList: " + linkedList);

        // Using HashSet
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Red");
        hashSet.add("Green");
        hashSet.add("Blue");
        System.out.println("HashSet: " + hashSet);

        // Using HashMap
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");
        System.out.println("HashMap: " + hashMap);
    }
}

// © Mahendra Mahara 2023
