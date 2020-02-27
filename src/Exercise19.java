import java.util.Scanner;

public class Exercise19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int numberOfRows = input.nextInt();
        System.out.print("Enter number of columns: ");
        int numberOfColumns = input.nextInt();

        int[][] array = new int[numberOfRows][numberOfColumns];

        fillArray(array);

        System.out.print(isConsecutiveFour(array));

    }

    public static boolean isConsecutiveFour(int[][] values) {
        if (values.length < 4)
            return false;
        for (int[] value : values) {
            for (int k = 0; k < values.length - 3; k++) {
                if (value[k] == value[k + 1] && value[k] == value[k + 2] && value[k] == value[k + 3])
                    return true;
            }
        }

        for (int k = 0; k < values.length - 3; k++) {
            for (int i = 0; i < values.length; i++) {
                if (values[k][i] == values[k + 1][i] && values[k][i] == values[k + 2][i] && values[k][i] == values[k + 3][i])
                    return true;
            }
        }

        for (int k = 0; k < values.length - 3; k++) {
            for (int i = 0; i < values.length - 3; i++) {
                if (values[k][i] == values[k + 1][i + 1] && values[k][i] == values[k + 2][i + 2] && values[k][i] == values[k + 3][i + 3])
                    return true;
            }
        }

        for (int k = 0; k < values.length - 3; k++) {
            for (int i = values.length - 4; i >= 0; i--) {
                if (values[k][i+3] == values[k + 1][i + 2] && values[k][i] == values[k + 2][i + 1] && values[k][i] == values[k + 3][i ])
                    return true;
            }
        }

        return false;
    }

    public static void fillArray(int[][] array) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array[i].length; j++)
                array[i][j] = input.nextInt();
    }
}
