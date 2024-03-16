import java.io.*;

public class FileCopyExample {
    public static void main(String[] args) {

        // Source and destination file paths
        String sourceFilePath = "source.txt"; // Change this to your source file path
        String destinationFilePath = "destination.txt"; // Change this to your destination file path

        // Create File objects for source and destination files
        File sourceFile = new File(sourceFilePath);
        File destinationFile = new File(destinationFilePath);

        // Create FileReader and FileWriter for reading from the source file and writing
        // to the destination file
        try (FileReader fileReader = new FileReader(sourceFile);
                FileWriter fileWriter = new FileWriter(destinationFile)) {

            // Create BufferedReader and BufferedWriter for efficient reading and writing
            BufferedReader reader = new BufferedReader(fileReader);
            BufferedWriter writer = new BufferedWriter(fileWriter);

            // Read each line from the source file and write it to the destination file
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine(); // Add newline character after each line
            }

            System.out.println("File copied successfully!");
        } catch (IOException e) {
            // Handle IOException if any error occurs during file operations
            System.out.println("Error copying file: " + e.getMessage());
        }
    }
}
