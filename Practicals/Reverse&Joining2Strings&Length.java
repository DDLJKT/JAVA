import java.awt.*;
import java.awt.event.*;

class P24 extends Frame implements ActionListener {
	TextField t1, t2;
	Button b1;

	P24() {

		setLayout(new FlowLayout());
		pack();
		setVisible(true);

		t1 = new TextField(10);
		t2 = new TextField(10);
		b1 = new Button("Click");

		b1.addActionListener(this);

		add(t1);
		add(t2);
		add(b1);

	}

	public static void main(String[] args) {
		new P24();
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			String str1 = t1.getText().toString();
			String str2 = t2.getText().toString();
			String rev = "", concat = "";

			int l = str1.length() - 1;
			while (l >= 0) {
				rev = rev + str1.charAt(l);
				l--;
			}
			concat = str1.concat(str2);
			l = str1.length();
			System.out.println("Result:\nString 1 Reverse: " + rev + "\nString 1 and 2 joining: " + concat
					+ "\nString 1 length: " + l);
		}
	}
}