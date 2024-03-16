import java.io.*;

public class StudentDataWriter {
    public static void main(String[] args) {

        // File path to store the student data
        String filePath = "student_data.txt"; // Change this to your desired file path

        try {
            // Create FileWriter and BufferedWriter to write to the file
            FileWriter fileWriter = new FileWriter(filePath, true); // Append mode
            BufferedWriter writer = new BufferedWriter(fileWriter);

            // Read student data from the user
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter student details (name, roll number, grade):");
            String studentData = reader.readLine();

            // Write student data to the file
            writer.write(studentData);
            writer.newLine(); // Add newline character

            // Close the writer
            writer.close();

            System.out.println("Student data written to the file successfully!");
        } catch (IOException e) {
            // Handle IOException if any error occurs during file operations
            System.out.println("Error writing student data to the file: " + e.getMessage());
        }
    }
}
