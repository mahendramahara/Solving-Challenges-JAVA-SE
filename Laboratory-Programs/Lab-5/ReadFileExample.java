import java.io.FileReader;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFileExample {
    public static void main(String[] args) {
        // Using FileReader
        try (FileReader reader = new FileReader("writer.txt")) {
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            System.out.println("\nFile read using FileReader.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Using FileInputStream
        try (FileInputStream inputStream = new FileInputStream("outputstream.txt")) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                System.out.print(new String(buffer, 0, bytesRead));
            }
            System.out.println("\nFile read using FileInputStream.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
