import java.util.Scanner;

public class MatrixMultiply {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input matrix dimensions
        System.out.print("Enter the number of rows in the first matrix (m): ");
        int m = scanner.nextInt();
        System.out.print("Enter the number of columns in the first matrix (n): ");
        int n = scanner.nextInt();
        System.out.print("Enter the number of rows in the second matrix (p): ");
        int p = scanner.nextInt();

        // Validate matrix compatibility for multiplication
        if (n != p) {
            System.err.println(
                    "Error: The number of columns in the first matrix (n) must equal the number of rows in the second matrix (p) for multiplication.");
            System.exit(1); // Exit the program with error status
        }

        // Input first matrix
        System.out.println("Enter the elements of the first matrix:");
        int[][] firstMatrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("First matrix[" + i + "][" + j + "]: ");
                firstMatrix[i][j] = scanner.nextInt();
            }
        }

        // Input second matrix
        System.out.println("Enter the elements of the second matrix:");
        int[][] secondMatrix = new int[p][n];
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Second matrix[" + i + "][" + j + "]: ");
                secondMatrix[i][j] = scanner.nextInt();
            }
        }

        // Calculate and print the resulting matrix
        int[][] resultMatrix = new int[m][p];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                for (int k = 0; k < n; k++) {
                    resultMatrix[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }

        System.out.println("Resulting matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
