import java.util.Arrays;
import java.util.Scanner;

public class Exercise26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] matrix = new double[4][4];
        System.out.println("Enter a 4−by−4 matrix row by row:");
        for (int k = 0; k < matrix.length; k++)
            for (int j = 0; j < matrix.length; j++)
                matrix[k][j] = input.nextDouble();
        showMatrix(sortRows(matrix));

    }

    public static double[][] sortRows(double[][] m) {
        double[][] matrix = new double[m.length][];
        for (int k = 0; k < m.length; k++) {
            double[] temp = Arrays.copyOfRange(m[k], 0, m.length);
            Arrays.sort(temp);
            matrix[k] = temp;
        }
        return matrix;
    }

    public static void showMatrix(double[][] m) {
        for (double[] doubles : m) {
            for (double aDouble : doubles) {
                System.out.print(aDouble + " ");
            }
            System.out.println();
        }
    }
}
