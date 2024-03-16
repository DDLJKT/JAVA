import java.awt.*;
import java.awt.event.*;

class P29 extends Frame implements ActionListener {
	TextField t1;
	Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, ab, sb, mb, db, enter;
	int num1, num2, result;
	char Operation;

	P29() {
		setLayout(new GridLayout(4, 4));
		pack();
		setVisible(true);

		t1 = new TextField(10);

		b0 = new Button("0");
		b1 = new Button("1");
		b2 = new Button("2");
		b3 = new Button("3");
		b4 = new Button("4");
		b5 = new Button("5");
		b6 = new Button("6");
		b7 = new Button("7");
		b8 = new Button("8");
		b9 = new Button("9");

		ab = new Button("+");
		sb = new Button("-");
		mb = new Button("*");
		db = new Button("/");
		enter = new Button("=");

		add(t1);

		add(b0);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(ab);
		add(sb);
		add(mb);
		add(db);
		add(enter);

		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		ab.addActionListener(this);
		sb.addActionListener(this);
		mb.addActionListener(this);
		db.addActionListener(this);
		enter.addActionListener(this);

	}

	public static void main(String[] args) {
		new P29();
	}

	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		char ch = str.charAt(0);

		if (Character.isDigit(ch)) {
			t1.setText(t1.getText() + str);
		} else {
			if (str.equals("+")) {
				num1 = Integer.parseInt(t1.getText());
				Operation = '+';
				t1.setText("");
			}
			if (str.equals("-")) {
				num1 = Integer.parseInt(t1.getText());
				Operation = '-';
				t1.setText("");
			}
			if (str.equals("*")) {
				num1 = Integer.parseInt(t1.getText());
				Operation = '*';
				t1.setText("");
			}
			if (str.equals("/")) {
				num1 = Integer.parseInt(t1.getText());
				Operation = '/';
				t1.setText("");
			}
			if (str.equals("=")) {
				num2 = Integer.parseInt(t1.getText());
				t1.setText("");
				try {
					switch (Operation) {
						case '+':
							result = num1 + num2;
							break;
						case '-':
							result = num1 - num2;
							break;
						case '*':
							result = num1 * num2;
							break;
						case '/':
							result = num1 / num2;
							break;
					}
					t1.setText(Integer.toString(result));
				} catch (ArithmeticException ex) {
					t1.setText("Error");
				}
			}
		}
	}
}