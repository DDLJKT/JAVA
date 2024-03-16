import java.util.Vector;

public class Vectorr {
    public static void main(String[] args) {
        // Create a Vector of String type
        Vector<String> vector = new Vector<>();

        // Add elements to the Vector
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Orange");

        // Display the elements of the Vector
        System.out.println("Vector elements:");
        for (String fruit : vector) {
            System.out.println(fruit);
        }

        // Get the size of the Vector
        int size = vector.size();
        System.out.println("Size of Vector: " + size);

        // Check if the Vector contains a specific element
        boolean containsBanana = vector.contains("Banana");
        System.out.println("Vector contains Banana: " + containsBanana);

        // Get the element at a specific index
        String elementAtIndex2 = vector.get(2);
        System.out.println("Element at index 2: " + elementAtIndex2);

        // Remove an element from the Vector
        vector.remove("Apple");
        System.out.println("After removing Apple:");
        for (String fruit : vector) {
            System.out.println(fruit);
        }

        // Clear all elements from the Vector
        vector.clear();
        System.out.println("Vector after clearing all elements:");
        System.out.println("Size of Vector: " + vector.size());
    }
}
