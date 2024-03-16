import java.awt.*;
import java.awt.event.*;

class P25 extends Frame implements ActionListener {
	Label l1, l2, l3, l4, r;
	TextField t1, t2, t3, t4;
	Button b1;

	P25() {
		setLayout(new FlowLayout());
		pack();
		setVisible(true);

		l1 = new Label("Enter Name: ");
		l2 = new Label("Enter Age: ");
		l3 = new Label("Enter Roll No: ");
		l4 = new Label("Enter Address: ");
		r = new Label("Result: ");
		t1 = new TextField(10);
		t2 = new TextField(10);
		t3 = new TextField(10);
		t4 = new TextField(10);
		b1 = new Button("Click");

		b1.addActionListener(this);

		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(l4);
		add(t4);

		add(b1);
		add(r);

	}

	public static void main(String[] args) {
		new P25();
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			String result = "Hello, " + t1.getText() + "\nYour age is " + t2.getText() + "\nYour Rollno is "
					+ t3.getText() + "\nYour Address is " + t4.getText();
			r.setText("Result: \n" + result);
		}
	}
}