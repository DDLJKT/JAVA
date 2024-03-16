// Abstract class Shape
abstract class Shape {
    protected int dimension1;
    protected int dimension2;

    // Constructor
    public Shape(int dimension1, int dimension2) {
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
    }

    // Abstract method to be implemented by subclasses
    abstract void printArea();
}

// Rectangle class extending Shape
class Rectangle extends Shape {
    // Constructor
    public Rectangle(int length, int width) {
        super(length, width);
    }

    // Implementing abstract method
    @Override
    void printArea() {
        int area = dimension1 * dimension2;
        System.out.println("Area of Rectangle: " + area);
    }
}

// Triangle class extending Shape
class Triangle extends Shape {
    // Constructor
    public Triangle(int base, int height) {
        super(base, height);
    }

    // Implementing abstract method
    @Override
    void printArea() {
        double area = 0.5 * dimension1 * dimension2;
        System.out.println("Area of Triangle: " + area);
    }
}

// Circle class extending Shape
class Circle extends Shape {
    // Constructor
    public Circle(int radius) {
        super(radius, 0);
    }

    // Implementing abstract method
    @Override
    void printArea() {
        double area = Math.PI * dimension1 * dimension1;
        System.out.println("Area of Circle: " + area);
    }

}

    // Main class to test the implementation
    public class interface{

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        rectangle.printArea();

        Triangle triangle = new Triangle(4, 6);
        triangle.printArea();

        Circle circle = new Circle(3);
        circle.printArea();
    }
}