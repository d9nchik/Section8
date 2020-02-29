import java.util.Scanner;

public class Exercise25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] matrix = new double[3][3];
        System.out.print("Enter a 3−by−3 matrix row by row:");
        for (int k = 0; k < matrix.length; k++)
            for (int j = 0; j < matrix.length; j++)
                matrix[k][j] = input.nextInt();
        System.out.print("It is ");
        if (!isMarkovMatrix(matrix))
            System.out.print("not ");
        System.out.println("a Markov matrix");
    }

    public static boolean isMarkovMatrix(double[][] m) {
        for (double[] doubles : m) {
            double total = 0;
            for (double aDouble : doubles) {
                if (aDouble <= 0)
                    return false;
                total += aDouble;
            }
            if (total != 1)
                return false;
        }
        return true;
    }
}
