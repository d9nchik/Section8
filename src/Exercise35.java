import java.util.Scanner;

public class Exercise35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows in the matrix: ");
        int size = input.nextInt();
        int[][] m = new int[size][size];
        System.out.println("Enter the matrix row by row: ");
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[i].length; j++)
                m[i][j] = input.nextInt();
        int[] largestBlock = findLargestBlock(m);
        System.out.print("The maximum square submatrix is at (" + largestBlock[0] + ", " + largestBlock[1] + ") with size " + largestBlock[2]);

    }

    public static int[] findLargestBlock(int[][] m) {
        int[] largestBlock = new int[3];
        largestBlock[2] = m.length ;
        while (largestBlock[2] > 0) {
            for (int i = 0; i <= m.length - largestBlock[2]; i++) {
                for (int j = 0; j <= m.length - largestBlock[2]; j++) {
                    boolean isOfOne = true;
                    for (int k = i; k < i+largestBlock[2] && isOfOne; k++) {
                        for (int l = j; l <j+ largestBlock[2]; l++) {
                            if (m[k][l] != 1) {
                                isOfOne = false;
                                break;
                            }
                        }
                    }
                    if (isOfOne) {
                        largestBlock[0] = i;
                        largestBlock[1] = j;
                        return largestBlock;
                    }
                }
            }
            largestBlock[2]--;
        }
        return largestBlock;
    }
}
