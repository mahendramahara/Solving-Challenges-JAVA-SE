import java.util.Hashtable;
import java.util.Dictionary;

public class HashTableAndDictionaryDemo {
    public static void main(String[] args) {
        // Using Hashtable
        Hashtable<Integer, String> hashtable = new Hashtable<>();

        hashtable.put(1, "One");
        hashtable.put(2, "Two");
        hashtable.put(3, "Three");

        System.out.println("Hashtable: " + hashtable);

        // Using Dictionary (with Hashtable)
        Dictionary<Integer, String> dictionary = new Hashtable<>();

        dictionary.put(4, "Four");
        dictionary.put(5, "Five");
        dictionary.put(6, "Six");

        System.out.println("Dictionary: " + dictionary);

        // Accessing elements in Dictionary
        String value = dictionary.get(4);
        System.out.println("Value for key 4: " + value);

        // Removing elements from Dictionary
        dictionary.remove(5);
        System.out.println("Dictionary after removing key 5: " + dictionary);

        // Checking if Dictionary contains a key
        boolean containsKey = ((Hashtable<Integer, String>) dictionary).containsKey(6);
        System.out.println("Does dictionary contain key 6? " + containsKey);

        // Checking if Dictionary contains a value
        boolean containsValue = ((Hashtable<Integer, String>) dictionary).containsValue("Six");
        System.out.println("Does dictionary contain value 'Six'? " + containsValue);
    }
}
