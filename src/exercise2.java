public class exercise2 {
    public static void main(String[] args) {
        System.out.println("Enter a 4−by−4 matrix row by row:");
        double[][] matrix = exercise1.getMatrix(4, 4);
        System.out.println("Average of the elements in the major diagonal is " + averageMajorDiagonal(matrix));
    }

    public static double averageMajorDiagonal(double[][] m) {
        double total = 0;
        for (int k = 0; k < m.length; k++)
            total += m[k][k];
        return total / m.length;
    }
}
