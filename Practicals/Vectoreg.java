import java.util.Vector;

public class Vectoreg {
    public static void main(String[] args) {
        // Creating a vector
        Vector<String> vector = new Vector<>();

        // Adding elements to the vector
        vector.add("Java");
        vector.add("Python");
        vector.add("C++");

        // Accessing elements using index
        System.out.println("Elements in the vector:");
        for (int i = 0; i < vector.size(); i++) {
            System.out.println(vector.get(i));
        }
    }
}
