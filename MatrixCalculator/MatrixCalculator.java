import java.util.Scanner;

public class MatrixCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix1 = {{1, 2}, {3, 4}};
        int[][] matrix2 = {{5, 6}, {7, 8}};

        System.out.println("Matrix Calculator: ");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Transpose");
        System.out.print("Choose an operation: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                add(matrix1, matrix2);
                break;
            case 2:
                subtract(matrix1, matrix2);
                break;
            case 3:
                multiply(matrix1, matrix2);
                break;
            case 4:
                transpose(matrix1);
                break;
            default:
                System.out.println("Invalid choice!");
        }
        sc.close();
    }

    static void add(int[][] a, int[][] b) {
        System.out.println("Matrix Addition:");
        int[][] result = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        printMatrix(result);
    }

    static void subtract(int[][] a, int[][] b) {
        System.out.println("Matrix Subtraction:");
        int[][] result = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                result[i][j] = a[i][j] - b[i][j];
            }
        }
        printMatrix(result);
    }

    static void multiply(int[][] a, int[][] b) {
        System.out.println("Matrix Multiplication:");
        int[][] result = new int[a.length][b[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        printMatrix(result);
    }

    static void transpose(int[][] matrix) {
        System.out.println("Matrix Transpose:");
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposed = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        printMatrix(transposed);
    }

    static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for(int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

}


