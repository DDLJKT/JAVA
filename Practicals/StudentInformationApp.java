import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class StudentInformationApp extends Frame implements ActionListener {
    TextField nameField, ageField, gradeField;
    Button addButton, displayButton;
    TextArea displayArea;
    ArrayList<Student> studentsList;

    public StudentInformationApp() {
        setLayout(new FlowLayout());

        Label nameLabel = new Label("Name:");
        add(nameLabel);
        nameField = new TextField(20);
        add(nameField);

        Label ageLabel = new Label("Age:");
        add(ageLabel);
        ageField = new TextField(20);
        add(ageField);

        Label gradeLabel = new Label("Grade:");
        add(gradeLabel);
        gradeField = new TextField(20);
        add(gradeField);

        addButton = new Button("Add Student");
        add(addButton);
        addButton.addActionListener(this);

        displayButton = new Button("Display Students");
        add(displayButton);
        displayButton.addActionListener(this);

        displayArea = new TextArea(10, 40);
        add(displayArea);

        studentsList = new ArrayList<>();

        setTitle("Student Information");
        setSize(400, 300);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            String name = nameField.getText();
            int age = Integer.parseInt(ageField.getText());
            String grade = gradeField.getText();

            Student student = new Student(name, age, grade);
            studentsList.add(student);

            nameField.setText("");
            ageField.setText("");
            gradeField.setText("");

            displayArea.append("Student added: " + student.toString() + "\n");
        } else if (e.getSource() == displayButton) {
            displayArea.setText("");
            for (Student student : studentsList) {
                displayArea.append(student.toString() + "\n");
            }
        }
    }

    public static void main(String[] args) {
        new StudentInformationApp();
    }

    class Student {
        private String name;
        private int age;
        private String grade;

        public Student(String name, int age, String grade) {
            this.name = name;
            this.age = age;
            this.grade = grade;
        }

        public String toString() {
            return "Name: " + name + ", Age: " + age + ", Grade: " + grade;
        }
    }
}
