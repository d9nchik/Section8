public class exercise10 {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        fillMatrix(matrix);
        showMatrix(matrix);
        System.out.println("The largest row index: " + findMaximumRow(matrix));
        System.out.println("The largest column index: " + findMaximumColumn(matrix));
    }

    public static void fillMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
            }
        }
    }

    public static void showMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(ints[j]);
            }
            System.out.println();
        }
    }

    public static int findMaximumRow(int[][] matrix) {
        int totalMax = 0;
        int totalIndex = 0;
        for (int i = 0; i < matrix.length; i++) {
            int total = 0;
            for (int j = 0; j < matrix.length; j++) {
                total += matrix[i][j];
            }
            if (totalMax < total) {
                totalMax = total;
                totalIndex = i;
            }
        }
        return totalIndex;
    }

    public static int findMaximumColumn(int[][] matrix) {
        int totalMax = 0;
        int totalIndex = 0;
        for (int i = 0; i < matrix.length; i++) {
            int total = 0;
            for (int[] ints : matrix) {
                total += ints[i];
            }
            if (totalMax < total) {
                totalMax = total;
                totalIndex = i;
            }
        }
        return totalIndex;
    }
}
