import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class IntegerDivisionUI extends JFrame implements ActionListener {

    private JTextField num1Field, num2Field, resultField;
    private JButton divideButton;

    public IntegerDivisionUI() {
        super("Integer Division");

        // Create UI elements
        JLabel num1Label = new JLabel("Number 1:");
        num1Field = new JTextField(10);
        JLabel num2Label = new JLabel("Number 2:");
        num2Field = new JTextField(10);
        resultField = new JTextField(10);
        resultField.setEditable(false);
        divideButton = new JButton("Divide");

        // Add event listener
        divideButton.addActionListener(this);

        // Layout components
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        inputPanel.add(num1Label);
        inputPanel.add(num1Field);
        inputPanel.add(num2Label);
        inputPanel.add(num2Field);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(divideButton);

        JPanel outputPanel = new JPanel();
        outputPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        outputPanel.add(new JLabel("Result:"));
        outputPanel.add(resultField);

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(inputPanel, BorderLayout.NORTH);
        getContentPane().add(buttonPanel, BorderLayout.CENTER);
        getContentPane().add(outputPanel, BorderLayout.SOUTH);

        // Set frame properties
        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == divideButton) {
            try {
                int num1 = Integer.parseInt(num1Field.getText());
                int num2 = Integer.parseInt(num2Field.getText());
                int result = num1 / num2;
                resultField.setText(String.valueOf(result));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Please enter valid integers only!", "Error", JOptionPane.ERROR_MESSAGE);
                num1Field.setText("");
                num2Field.setText("");
            } catch (ArithmeticException ex) {
                JOptionPane.showMessageDialog(this, "Cannot divide by zero!", "Error", JOptionPane.ERROR_MESSAGE);
                num2Field.setText("");
            }
        }
    }

    public static void main(String[] args) {
        new IntegerDivisionUI();
    }
}
