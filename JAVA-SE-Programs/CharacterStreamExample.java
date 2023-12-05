// Title: CharacterStreamExample

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamExample {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        // Writing to a file using FileWriter
        try (FileWriter writer = new FileWriter(outputFile)) {
            String text = "This is a test for character stream.";
            writer.write(text);
            System.out.println("Data written to " + outputFile);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // Reading from a file using FileReader
        try (FileReader reader = new FileReader(inputFile)) {
            StringBuilder content = new StringBuilder();
            int character;
            while ((character = reader.read()) != -1) {
                content.append((char) character);
            }
            System.out.println("Data read from " + inputFile + ":");
            System.out.println(content.toString());
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}
// © Mahendra Mahara 2023
