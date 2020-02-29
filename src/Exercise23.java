import java.util.Scanner;

public class Exercise23 {
    public static void main(String[] args) {
        int[][] matrix = getMatrix();
        System.out.println("The flipped cell is at (" + incorrectRow(matrix) + ", " + incorrectColumn(matrix) + ")");
    }

    public static int[][] getMatrix() {
        Scanner input = new Scanner(System.in);

        int[][] matrix = new int[6][6];

        System.out.print("Enter a 6−by−6 matrix row by row:");
        for (int k = 0; k < matrix.length; k++)
            for (int j = 0; j < matrix.length; j++)
                matrix[k][j] = input.nextInt();
        return matrix;
    }

    public static int incorrectRow(int[][] matrix) {
        for (int k = 0; k < matrix.length; k++) {
            int total = 0;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[k][j] == 1)
                    total++;
            }
            if (total % 2 == 1) {
                return k;
            }
        }
        return -1;
    }

    public static int incorrectColumn(int[][] matrix) {
        for (int k = 0; k < matrix.length; k++) {
            int total = 0;
            for (int[] ints : matrix) {
                if (ints[k] == 1)
                    total++;
            }
            if (total % 2 == 1) {
                return k;
            }
        }
        return -1;
    }
}
