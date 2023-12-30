// Title: ByteStreamExample

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExample {
    public static void main(String[] args) {
        String inputFile = "input1.txt";
        String outputFile = "output1.txt";

        // Writing to a file using FileOutputStream
        try (FileOutputStream outputStream = new FileOutputStream(outputFile)) {
            String text = "This is a test for byte stream.";
            byte[] bytes = text.getBytes();
            outputStream.write(bytes);
            System.out.println("Data written to " + outputFile);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // Reading from a file using FileInputStream
        try (FileInputStream inputStream = new FileInputStream(inputFile)) {
            StringBuilder content = new StringBuilder();
            int byteValue;
            while ((byteValue = inputStream.read()) != -1) {
                content.append((char) byteValue);
            }
            System.out.println("Data read from " + inputFile + ":");
            System.out.println(content.toString());
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}
// © Mahendra Mahara 2023
