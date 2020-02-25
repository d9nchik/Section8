import java.util.Scanner;

public class exercise14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size for the matrix: ");
        int size = input.nextInt();
        int[][] matrix = new int[size][size];
        exercise10.fillMatrix(matrix);
        exercise10.showMatrix(matrix);
        findSameOnRowAndColumn(matrix);
        isOnDiagonals(matrix);
    }

    public static void findSameOnRowAndColumn(int[][] matrix) {
        boolean row = false;
        for (int k = 0; k < matrix.length; k++) {
            boolean show = true;
            for (int j = 1; j < matrix.length; j++) {
                if (matrix[k][0] != matrix[k][j]) {
                    show = false;
                    break;
                }
            }
            if (show) {
                row = true;
                System.out.println("All " + matrix[k][0] + "s on row " + (k + 1));
            }
        }

        if (!row)
            System.out.println("No same numbers on a row");

        boolean column = false;
        for (int k = 0; k < matrix.length; k++) {
            boolean show = true;
            for (int j = 1; j < matrix.length; j++) {
                if (matrix[0][k] != matrix[j][k]) {
                    show = false;
                    break;
                }
            }
            if (show) {
                column = true;
                System.out.println("All " + matrix[0][k] + "s on column " + (k + 1));
            }
        }

        if (!column)
            System.out.println("No same numbers on a column");
    }

    public static void isOnDiagonals(int[][] matrix) {
        boolean main = true;
        for (int k = 1; k < matrix.length; k++)
            if (matrix[k][k] != matrix[0][0]) {
                main = false;
                break;
            }
        if (main) {
            System.out.println("All " + matrix[0][0] + "s on the major diagonal ");
        } else
            System.out.println("No same numbers on the major diagonal");
        boolean subMain = true;
        for (int k = 1; k < matrix.length; k++)
            if (matrix[k][matrix.length - 1 - k] != matrix[0][matrix.length - 1]) {
                subMain = false;
                break;
            }
        if (subMain) {
            System.out.println("All " + matrix[0][matrix.length - 1] + "s on the sub−diagonal ");
        } else
            System.out.println("No same numbers on the major sub−diagonal");
    }
}
