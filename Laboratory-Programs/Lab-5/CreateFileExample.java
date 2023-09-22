import java.io.FileWriter;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateFileExample {
    public static void main(String[] args) {
        String content = "This is the content of the file which are created using File Writer and File Output Stream";

        // Using FileWriter
        try (FileWriter writer = new FileWriter("writer.txt")) {
            writer.write(content);
            System.out.println("File created using FileWriter.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Using FileOutputStream
        try (FileOutputStream outputStream = new FileOutputStream("outputstream.txt")) {
            byte[] bytes = content.getBytes();
            outputStream.write(bytes);
            System.out.println("File created using FileOutputStream.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
