class P3 {

	public long cal_sum(char[] ch) {
		long sum = 0;
		for (int i = 0; i < ch.length; i++) {
			sum = sum + ch[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		char[] ch = { 0, 4, 2, 7, 5 };
		P3 obj = new P3();

		long result = obj.cal_sum(ch);

		System.out.println("The sum of Digits of Char Array is: " + result);
	}
}