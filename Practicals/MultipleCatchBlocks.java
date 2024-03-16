public class MultipleCatchBlocks {

  public static void main(String[] args) {

    int[] numbers = { 1, 2, 3, 4 };

    try {
      // Code that might throw exceptions
      System.out.println(numbers[5]); // This will throw an ArrayIndexOutOfBoundsException
      int result = 10 / 0; // This will throw an ArithmeticException
    } catch (ArithmeticException e) {
      System.out.println("Error: Division by zero. Please check your input.");
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Error: Array index out of bounds. Accessing an element beyond the array size.");
    } catch (Exception e) { // This is a general catch block to handle any other exceptions
      System.out.println("An unexpected error occurred: " + e.getMessage());
    } finally {
      // Code that will always execute, regardless of exceptions
      System.out.println("Program execution completed.");
    }
  }
}
