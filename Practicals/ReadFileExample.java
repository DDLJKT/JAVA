import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileExample {
    public static void main(String[] args) {
        // Specify the file path
        String filePath = "example.txt"; // Change this to your file path
        
        // Create a File object
        File file = new File(filePath);
        
        try {
            // Create a FileReader to read the file
            FileReader fileReader = new FileReader(file);
            
            // Create a BufferedReader to read the FileReader
            BufferedReader reader = new BufferedReader(fileReader);
            
            // Read each line from the file and display it in the console
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            
            // Close the BufferedReader
            reader.close();
        } catch (IOException e) {
            // Handle IOException if the file cannot be read
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
