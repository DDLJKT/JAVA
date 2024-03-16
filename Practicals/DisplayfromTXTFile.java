import java.awt.*;
import java.util.Scanner;
import java.io.*;

class P28 extends Frame {
	P28() {
		setLayout(new GridLayout(0, 2));
		pack();
		setVisible(true);
		try {
			FileInputStream fis = new FileInputStream("example.txt");
			Scanner sc = new Scanner(fis).useDelimiter(",");
			String[] arrayList;
			String a;
			while (sc.hasNextLine()) {
				a = sc.nextLine();
				arrayList = a.split(",");
				for (String i : arrayList) {
					add(new Label(i));
				}
			}
		} catch (Exception e) {
			System.out.println("Error");
		}
	}

	public static void main(String[] args) {
		new P28();
	}
}