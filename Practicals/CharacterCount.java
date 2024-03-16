import java.util.Scanner;

public class CharacterCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        int letters = 0;
        int spaces = 0;
        int numbers = 0;
        int other = 0;

        for (char character : inputString.toCharArray()) {
            if (Character.isLetter(character)) {
                letters++;
            } else if (Character.isSpaceChar(character)) {
                spaces++;
            } else if (Character.isDigit(character)) {
                numbers++;
            } else {
                other++;
            }
        }

        System.out.println("Letters: " + letters);
        System.out.println("Spaces: " + spaces);
        System.out.println("Numbers: " + numbers);
        System.out.println("Other characters: " + other);
    }
}
