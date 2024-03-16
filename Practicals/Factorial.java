import java.awt.*;
import java.awt.event.*;

class P23 extends Frame implements ActionListener {
	TextField t1;
	Button b1;
	Label l1;

	P23() {
		setLayout(new FlowLayout());
		pack();
		setVisible(true);

		t1 = new TextField(10);
		b1 = new Button("Click");
		l1 = new Label("Result: ");

		b1.addActionListener(this);

		add(t1);
		add(b1);
		add(l1);

	}

	public static void main(String[] args) {
		new P23();
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			int n = 1;
			int n1 = Integer.parseInt(t1.getText());
			if (n1 == 0 || n1 == 1) {
				l1.setText("Result:" + 1);
			} else {
				while (n1 > 0) {
					n *= n1;
					n1--;
					System.out.println(n);
				}
				l1.setText("Result:" + n);
			}
		}
	}
}