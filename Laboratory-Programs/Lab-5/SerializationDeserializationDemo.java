import java.io.*;

class Student implements Serializable {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }
}

public class SerializationDeserializationDemo {
    public static void main(String[] args) {
        // Serialization
        Student student = new Student("Mahendra Mahara", 20);
        serializeStudent(student, "student.ser");
        System.out.println("Student object serialized.");

        // Deserialization
        Student deserializedStudent = deserializeStudent("student.ser");
        System.out.println("Deserialized student: " + deserializedStudent);
    }

    public static void serializeStudent(Student student, String fileName) {
        try (FileOutputStream fileOut = new FileOutputStream(fileName);
                ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(student);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Student deserializeStudent(String fileName) {
        try (FileInputStream fileIn = new FileInputStream(fileName);
                ObjectInputStream in = new ObjectInputStream(fileIn)) {
            return (Student) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
