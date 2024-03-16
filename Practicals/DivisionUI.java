import java.awt.*;
import java.awt.event.*;

public class DivisionUI extends Frame implements ActionListener {
    TextField num1Field, num2Field, resultField;
    Button divideButton;

    DivisionUI() {

        setTitle("Integer Division");
        setSize(300, 150);
        setVisible(true);
        setLayout(new FlowLayout());

        // Initialize components
        num1Field = new TextField(10);
        num2Field = new TextField(10);
        resultField = new TextField(10);
        resultField.setEditable(false); // Make result field read-only
        divideButton = new Button("Divide");

        // Add components to container
        add(new Label("Num1:"));
        add(num1Field);
        add(new Label("Num2:"));
        add(num2Field);
        add(divideButton);
        add(new Label("Result:"));
        add(resultField);

        // Add action listener to the Divide button
        divideButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            // Get the values from text fields
            int num1 = Integer.parseInt(num1Field.getText());
            int num2 = Integer.parseInt(num2Field.getText());

            // Check if num2 is zero
            if (num2 == 0) {
                throw new ArithmeticException("Cannot divide by zero!");
            }

            // Perform division
            int result = num1 / num2;

            // Display result
            resultField.setText(String.valueOf(result));
        } catch (NumberFormatException e) {
            // Handle NumberFormatException
            showErrorDialog("NumberFormatException: Please enter valid integers.");
        } catch (ArithmeticException e) {
            // Handle ArithmeticException
            showErrorDialog("ArithmeticException: " + e.getMessage());
        }
    }

    // Method to show error dialog
    private void showErrorDialog(String message) {
        Dialog dialog = new Dialog(this, "Error", true);
        dialog.setLayout(new FlowLayout());
        dialog.add(new Label(message));
        Button closeButton = new Button("OK");
        closeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dialog.setVisible(false);
            }
        });
        dialog.add(closeButton);
        dialog.setSize(300, 150);
        dialog.setVisible(true);
    }

    public static void main(String args[]) {
        new DivisionUI();
    }
}
