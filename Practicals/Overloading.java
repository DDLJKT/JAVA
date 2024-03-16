public class Overloading {

    public static void main(String[] args) {
        // Method overloading examples

        System.out.println(add(5, 3)); // Calls add(int, int)
        System.out.println(add(2.5, 4.2)); // Calls add(double, double)

        // Constructor overloading examples
        Student student1 = new Student("Ambani");
        Student student2 = new Student(123, "Adani", "Finance");

        System.out.println(student1);
        System.out.println(student2);
    }

    // Method overloading (adding two different data types)
    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    // Constructor overloading (creating objects with different parameters)
    public static class Student {
        private int id;
        private String name;
        private String department;

        // Default constructor (no arguments)
        public Student() {
            this.id = 0;
            this.name = "Unknown";
            this.department = "Undecided";
        }

        // Constructor with name argument
        public Student(String name) {
            this.id = 0;
            this.name = name;
            this.department = "Undecided";
        }

        // Constructor with all arguments
        public Student(int id, String name, String department) {
            this.id = id;
            this.name = name;
            this.department = department;
        }

        @Override
        public String toString() {
            return "Student [id=" + id + ", name=" + name + ", department=" + department + "]";
        }
    }
}
