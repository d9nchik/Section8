import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        System.out.println("Enter a 3−by−4 matrix row by row:");
        double[][] matrix = getMatrix(3, 4);
        for (int k = 0; k < matrix.length; k++)
            System.out.println("Sum of the elements at row " + k + " is " + sumRow(matrix, k));
    }

    public static double[][] getMatrix(int m, int n) {
        double[][] matrix = new double[m][n];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }
        return matrix;
    }

    public static double sumRow(double[][] m, int rowIndex) {
        double total = 0;
        for (int k = 0; k < m[rowIndex].length; k++) {
            total += m[rowIndex][k];
        }
        return total;
    }
}
