import java.awt.*;
import java.awt.event.*;

public class FactorialCalculators extends Frame implements ActionListener {
    TextField inputField, outputField;
    Button computeButton;

    public FactorialCalculators() {
        setLayout(new FlowLayout());

        Label inputLabel = new Label("Enter an integer:");
        add(inputLabel);

        inputField = new TextField(10);
        add(inputField);

        computeButton = new Button("Compute");
        add(computeButton);
        computeButton.addActionListener(this);

        Label outputLabel = new Label("Factorial Value:");
        add(outputLabel);

        outputField = new TextField(10);
        outputField.setEditable(false);
        add(outputField);

        setTitle("Factorial Calculator");
        setSize(300, 150);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == computeButton) {
            String inputText = inputField.getText();
            try {
                int number = Integer.parseInt(inputText);
                long factorial = computeFactorial(number);
                outputField.setText(String.valueOf(factorial));
            } catch (NumberFormatException ex) {
                outputField.setText("Invalid input!");
            }
        }
    }

    private long computeFactorial(int n) {
        if (n < 0) {
            return -1; // Factorial of negative number is undefined
        }
        long factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {

        new FactorialCalculators();
    }
}
