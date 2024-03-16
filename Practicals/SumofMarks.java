import java.awt.*;
import java.awt.event.*;

class P26 extends Frame implements ActionListener {
	Label l1, l2, l3, l4, l5, r;
	TextField t1, t2, t3, t4, t5;
	Button b1;

	P26() {
		setLayout(new FlowLayout());
		pack();
		setVisible(true);

		l1 = new Label("Enter Marks1: ");
		l2 = new Label("Enter Marks2: ");
		l3 = new Label("Enter Marks3: ");
		l4 = new Label("Enter Marks4: ");
		l5 = new Label("Enter Marks5: ");
		r = new Label("Result:");
		t1 = new TextField(10);
		t2 = new TextField(10);
		t3 = new TextField(10);
		t4 = new TextField(10);
		t5 = new TextField(10);
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
		add(l5);
		add(t5);

		add(b1);
		add(r);

	}

	public static void main(String[] args) {
		new P26();
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			int m1 = Integer.parseInt(t1.getText());
			int m2 = Integer.parseInt(t2.getText());
			int m3 = Integer.parseInt(t3.getText());
			int m4 = Integer.parseInt(t4.getText());
			int m5 = Integer.parseInt(t5.getText());
			double result = ((m1 + m2 + m3 + m4 + m5) * 100) / 500;
			r.setText("Result:" + result + "%");
			System.out.println("Result:" + result + "%");
		}
	}
}