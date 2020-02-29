import java.util.Arrays;
import java.util.Scanner;

public class Exercise27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] matrix = new double[4][4];
        System.out.println("Enter a 4−by−4 matrix row by row:");
        for (int k = 0; k < matrix.length; k++)
            for (int j = 0; j < matrix.length; j++)
                matrix[k][j] = input.nextDouble();
        Exercise26.showMatrix(sortColumns(matrix));

    }
    public static double[][] sortColumns(double[][] m) {
        double[][] matrix = new double[m.length][];
        for (int k = 0; k < m.length; k++) {
            double[] temp = Arrays.copyOfRange(m[k], 0, m.length);
            matrix[k] = temp;
        }

        for (int i = 0; i < matrix.length; i++) {
            int[] gaps = {701, 301, 132, 57, 23, 10, 4, 1};

            for (int gap : gaps) {
                for (int j = 0; j < matrix.length; j++) {
                    double temp = matrix[j][i];
                    int l = j;
                    for (; l >= gap && matrix[l - gap][i] > temp; l -= gap) {
                        matrix[l][i] = matrix[l - 1][i];
                    }
                    matrix[l][i] = temp;
                }
            }
        }
        return matrix;
    }
}
