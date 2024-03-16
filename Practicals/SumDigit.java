import java.util.*;

class SumDigit {
    public static void main(String args[]) {
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter the any string: ");
        String s = ob.nextLine();
        count(s);
    }

    public static void count(String str) {
        int sum = 0;
        int d = 0;
        char ch[] = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(ch[i])) {
                sum += Character.getNumericValue(ch[i]);
            }

        }
        System.out.println("Your addtion is: " + sum);
    }
}