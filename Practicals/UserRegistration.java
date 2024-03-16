import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;

public class UserRegistration extends Frame implements ActionListener {
    private TextField usernameField, passwordField, nameField;
    private Button registerButton, loginButton;
    private HashMap<String, String> users;

    public UserRegistration() {
        setTitle("User Registration");
        setSize(300, 200);
        setLayout(new FlowLayout());

        Label nameLabel = new Label("Name:");
        nameField = new TextField(20);

        Label usernameLabel = new Label("Username:");
        usernameField = new TextField(20);

        Label passwordLabel = new Label("Password:");
        passwordField = new TextField(20);
        passwordField.setEchoChar('*');

        registerButton = new Button("Register");
        registerButton.addActionListener(this);

        loginButton = new Button("Login");
        loginButton.addActionListener(this);

        add(nameLabel);
        add(nameField);
        add(usernameLabel);
        add(usernameField);
        add(passwordLabel);
        add(passwordField);
        add(registerButton);
        add(loginButton);

        users = new HashMap<>();

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == registerButton) {
            registerUser();
        } else if (e.getSource() == loginButton) {
            loginUser();
        }
    }

    private void registerUser() {
        String username = usernameField.getText();
        String password = passwordField.getText();
        users.put(username, password);
        clearFields();
        System.out.println("User registered successfully!");
    }

    private void loginUser() {
        String username = usernameField.getText();
        String password = passwordField.getText();
        if (users.containsKey(username) && users.get(username).equals(password)) {
            System.out.println("Successfully logged in!");
        } else {
            System.out.println("Invalid username or password!");
        }
        clearFields();
    }

    private void clearFields() {
        nameField.setText("");
        usernameField.setText("");
        passwordField.setText("");
    }

    public static void main(String[] args) {

        UserRegistration registrationForm = new UserRegistration();
        registrationForm.setVisible(true);
    }
}
