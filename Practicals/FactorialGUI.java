import java.awt.*;
import java.awt.event.*;

class P27 extends Frame implements ActionListener {
	TextField t1, t2;
	Button b1;

	P27() {
		setLayout(new FlowLayout());
		pack();
		setVisible(true);

		t1 = new TextField(10);
		t2 = new TextField(10);
		b1 = new Button("Compute");

		b1.addActionListener(this);

		add(t1);
		add(b1);
		add(t2);
	}

	public static void main(String[] args) {
		new P27();
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			int n1 = Integer.parseInt(t1.getText());
			int n = 1;
			if (n1 == 0 || n1 == 1) {
				t2.setText("Result:" + 1);
			} else {
				while (n1 > 0) {
					n = n * n1;
					n1 = n1 - 1;
				}
				t2.setText("Result:" + n);
			}
		}
	}
}