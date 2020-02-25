import java.util.Scanner;

public class exercise11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 511: ");
        int position = input.nextInt();
        int[][] matrix = new int[3][3];
        for (int k = matrix.length - 1; k >= 0; k--) {
            for (int j = matrix[k].length - 1; j >= 0; j--) {
                matrix[k][j] = position % 2;
                position /= 2;
            }
        }
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                if (anInt == 1)
                    System.out.print("T");
                else
                    System.out.print("H");
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
