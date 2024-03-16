import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter marks for a subject: ");
            int marks = scanner.nextInt();

            if (marks > 100) {
                throw new MarksOutOfBoundsException("Marks cannot be greater than 100!");
            }

            System.out.println("Entered marks: " + marks);
        } catch (MarksOutOfBoundsException e) {
            System.out.println("MarksOutOfBoundsException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        } finally {
            scanner.close();
        }
    }
}

class MarksOutOfBoundsException extends Exception {
    public MarksOutOfBoundsException(String message) {
        super(message);
    }
}
