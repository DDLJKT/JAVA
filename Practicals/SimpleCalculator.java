import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator extends Frame implements ActionListener {
    TextField resultField;
    Button[] digitButtons;
    Button addButton, subtractButton, multiplyButton, divideButton, percentButton, equalsButton, clearButton;
    double operand1;
    String currentInput;
    char operation;

    public SimpleCalculator() {
        setLayout(new BorderLayout());

        resultField = new TextField(20);
        resultField.setEditable(false);
        add(resultField, BorderLayout.NORTH);

        Panel buttonPanel = new Panel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        digitButtons = new Button[10];
        for (int i = 0; i < 10; i++) {
            digitButtons[i] = new Button(String.valueOf(i));
            digitButtons[i].addActionListener(this);
            buttonPanel.add(digitButtons[i]);
        }

        addButton = new Button("+");
        addButton.addActionListener(this);
        buttonPanel.add(addButton);

        subtractButton = new Button("-");
        subtractButton.addActionListener(this);
        buttonPanel.add(subtractButton);

        multiplyButton = new Button("*");
        multiplyButton.addActionListener(this);
        buttonPanel.add(multiplyButton);

        divideButton = new Button("/");
        divideButton.addActionListener(this);
        buttonPanel.add(divideButton);

        percentButton = new Button("%");
        percentButton.addActionListener(this);
        buttonPanel.add(percentButton);

        equalsButton = new Button("=");
        equalsButton.addActionListener(this);
        buttonPanel.add(equalsButton);

        clearButton = new Button("C");
        clearButton.addActionListener(this);
        buttonPanel.add(clearButton);

        add(buttonPanel, BorderLayout.CENTER);

        setTitle("Simple Calculator");
        setSize(300, 300);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String buttonText = e.getActionCommand();
        if (buttonText.equals("C")) {
            clearFields();
        } else if (buttonText.equals("=")) {
            calculateResult();
        } else if (buttonText.matches("[0-9]")) {
            currentInput += buttonText;
            resultField.setText(currentInput);
        } else {
            performOperation(buttonText.charAt(0));
        }
    }

    private void clearFields() {
        operand1 = 0;
        currentInput = "";
        resultField.setText("");
    }

    private void calculateResult() {
        double operand2 = Double.parseDouble(currentInput);
        double result = performOperation(operand1, operand2, operation);
        resultField.setText(String.valueOf(result));
        operand1 = result;
        currentInput = "";
    }

    private double performOperation(double operand1, double operand2, char operation) {
        switch (operation) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                if (operand2 == 0) {
                    throw new ArithmeticException("Cannot divide by zero");
                }
                return operand1 / operand2;
            case '%':
                return operand1 % operand2;
            default:
                throw new IllegalArgumentException("Invalid operation");
        }
    }

    private void performOperation(char op) {
        if (!currentInput.isEmpty()) {
            if (operand1 == 0) {
                operand1 = Double.parseDouble(currentInput);
            } else {
                calculateResult();
            }
            operation = op;
            currentInput = "";
        }
    }

    public static void main(String[] args) {
        new SimpleCalculator();
    }
}
