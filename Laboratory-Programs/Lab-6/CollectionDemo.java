import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {
        // List: Demonstrating ArrayList and LinkedList
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");

        linkedList.add("Cat");
        linkedList.add("Dog");
        linkedList.add("Elephant");

        System.out.println("ArrayList elements: " + arrayList);
        System.out.println("LinkedList elements: " + linkedList);

        // Set: Demonstrating HashSet and TreeSet
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();

        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);

        treeSet.add(50);
        treeSet.add(30);
        treeSet.add(40);

        System.out.println("HashSet elements: " + hashSet);
        System.out.println("TreeSet elements: " + treeSet);
    }
}
