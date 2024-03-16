import java.awt.*;
import java.awt.event.*;

public class ResultMarkSheet extends Frame implements ActionListener {
    TextField nameField, rollNumberField, physicsField, chemistryField, mathField;
    Button generateButton;
    TextArea resultArea;

    public ResultMarkSheet() {
        setLayout(new FlowLayout());

        Label nameLabel = new Label("Name:");
        add(nameLabel);
        nameField = new TextField(20);
        add(nameField);

        Label rollNumberLabel = new Label("Roll Number:");
        add(rollNumberLabel);
        rollNumberField = new TextField(20);
        add(rollNumberField);

        Label physicsLabel = new Label("Physics:");
        add(physicsLabel);
        physicsField = new TextField(20);
        add(physicsField);

        Label chemistryLabel = new Label("Chemistry:");
        add(chemistryLabel);
        chemistryField = new TextField(20);
        add(chemistryField);

        Label mathLabel = new Label("Mathematics:");
        add(mathLabel);
        mathField = new TextField(20);
        add(mathField);

        generateButton = new Button("Generate Result");
        add(generateButton);
        generateButton.addActionListener(this);

        resultArea = new TextArea(10, 40);
        add(resultArea);

        setTitle("Result Mark Sheet");
        setSize(400, 300);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == generateButton) {
            String name = nameField.getText();
            int rollNumber = Integer.parseInt(rollNumberField.getText());
            int physicsMarks = Integer.parseInt(physicsField.getText());
            int chemistryMarks = Integer.parseInt(chemistryField.getText());
            int mathMarks = Integer.parseInt(mathField.getText());

            double totalMarks = physicsMarks + chemistryMarks + mathMarks;
            double average = totalMarks / 3;
            String grade = calculateGrade(average);

            String result = "Name: " + name + "\nRoll Number: " + rollNumber + "\nPhysics: " + physicsMarks +
                    "\nChemistry: " + chemistryMarks + "\nMathematics: " + mathMarks +
                    "\nTotal Marks: " + totalMarks + "\nAverage: " + average + "\nGrade: " + grade;

            resultArea.setText(result);
        }
    }

    private String calculateGrade(double average) {
        if (average >= 90) {
            return "A+";
        } else if (average >= 80) {
            return "A";
        } else if (average >= 70) {
            return "B+";
        } else if (average >= 60) {
            return "B";
        } else if (average >= 50) {
            return "C+";
        } else if (average >= 40) {
            return "C";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        new ResultMarkSheet();
    }
}
