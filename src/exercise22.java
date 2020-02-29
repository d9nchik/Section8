public class exercise22 {
    public static void main(String[] args) {
        int[][] matrix = new int[6][6];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
            }
        }

        for (int[] value : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(value[j]);
            }
            System.out.println();
        }

        for (int[] ints : matrix) {
            int total = 0;
            for (int j = 0; j < matrix.length; j++) {
                if (ints[j] == 1)
                    total++;
            }
            if (total % 2 == 1) {
                System.out.print("every row \n" +
                        " don`t have an even number of 1s.");
                System.exit(0);
            }
        }

        for (int k = 0; k < matrix.length; k++) {
            int total = 0;
            for (int[] ints : matrix) {
                if (ints[k] == 1)
                    total++;
            }
            if (total % 2 == 1) {
                System.out.print("every column don`t have an even number of 1s.");
                System.exit(0);
            }
        }
        System.out.println("every row and\n" +
                "every column have an even number of 1s.");
    }
}
