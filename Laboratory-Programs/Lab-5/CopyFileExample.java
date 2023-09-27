import java.io.*;

public class CopyFileExample {
    public static void main(String[] args) {
        copyUsingFileReaderWriter("writer.txt", "copy_writer.txt");
        copyUsingFileInputStream("outputstream.txt", "copy_inputstream.txt");
    }

    public static void copyUsingFileReaderWriter(String sourcePath, String destPath) {
        try (FileReader reader = new FileReader(sourcePath);
                FileWriter writer = new FileWriter(destPath)) {
            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);
            }
            System.out.println("File copied using FileReader and FileWriter.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void copyUsingFileInputStream(String sourcePath, String destPath) {
        try (FileInputStream inputStream = new FileInputStream(sourcePath);
                FileOutputStream outputStream = new FileOutputStream(destPath)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
            System.out.println("File copied using FileInputStream and FileOutputStream.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
