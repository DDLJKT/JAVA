import java.util.Scanner;

public class AscendingandDescending {

    static class Sortdata {
        Scanner in = new Scanner(System.in);
        int len, i, j, temp = 0;
        int num[];

        public void getdata() {
            System.out.print("Enter the size of an array: ");
            len = in.nextInt();
            num = new int[len];
            System.out.print("Enter the numbers: ");
            for (i = 0; i < len; i++) {
                num[i] = in.nextInt();
            }
        }

        void disp_array() {
            System.out.print("Original order of an array: ");
            for (i = 0; i < len; i++) {
                System.out.print(" " + num[i]);
            }
            System.out.println();
        }

        void asce() {
            for (i = 0; i < len; i++) {
                for (j = i + 1; j < len; j++) {
                    if (num[i] > num[j]) {
                        temp = num[i];
                        num[i] = num[j];
                        num[j] = temp;
                    }
                }
            }
            System.out.print("Array in Ascending order: ");
            for (i = 0; i < len; i++) {
                System.out.print(" " + num[i]);
            }
            System.out.println();
        }

        void desc() {
            for (i = 0; i < len; i++) {
                for (j = i + 1; j < len; j++) {
                    if (num[i] < num[j]) {
                        temp = num[i];
                        num[i] = num[j];
                        num[j] = temp;
                    }
                }
            }
            System.out.print("Array in Descending order: ");
            for (i = 0; i < len; i++) {
                System.out.print(" " + num[i]);
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Sortdata sort = new Sortdata();
        sort.getdata();
        sort.disp_array();
        sort.asce();
        sort.desc();
    }
}