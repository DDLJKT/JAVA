import java.util.Scanner;

class P9 {

	public static void cal_withoutrecur(int n, int f1, int f2) {
		int temp;
		while (n > 0) {
			temp = f1 + f2;
			f1 = f2;
			f2 = temp;
			System.out.print(temp + "\t");
			n = n - 1;
		}
	}

	public static void cal_withrecur(int n, int f1, int f2) {
		int temp;
		if (n > 0) {
			temp = f1 + f2;
			f1 = f2;
			f2 = temp;
			n = n - 1;
			System.out.print(temp + "\t");
			cal_withrecur(n, f1, f2);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of sequence: ");
		int n = sc.nextInt();
		System.out.println("Enter the first number: ");
		int f1 = sc.nextInt();
		System.out.println("Enter the second number: ");
		int f2 = sc.nextInt();

		System.out.println("The fibonacci series without recursive function: ");
		System.out.print(f1 + "\t" + f2);
		cal_withoutrecur(n, f1, f2);
		System.out.println();

		System.out.println("The fibonacci series with recursive function: ");
		System.out.print(f1 + "\t" + f2);
		cal_withrecur(n, f1, f2);
	}
}