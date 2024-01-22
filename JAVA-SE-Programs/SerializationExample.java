// Title: SerializationExample

import java.io.*;

class Person implements Serializable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

public class SerializationExample {
    public static void main(String[] args) {
        String fileName = "person.ser";

        // Serialization
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            Person person = new Person("Mahendra Mahara", 20);
            outputStream.writeObject(person);
            System.out.println("Object serialized to " + fileName);
        } catch (IOException e) {
            System.out.println("Error serializing object: " + e.getMessage());
        }

        // Deserialization
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName))) {
            Person person = (Person) inputStream.readObject();
            System.out.println("Object deserialized:");
            System.out.println(person);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error deserializing object: " + e.getMessage());
        }
    }
}

// © Mahendra Mahara 2023
