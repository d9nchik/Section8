public class exercise16 {
    public static void main(String[] args) {
        int[][] array = {{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}};
        sort(array);
        showArray(array);
    }

    public static void sort(int[][] m) {
        for (int k = 0; k < m.length; k++) {
            int maximum = k;
            for (int l = k + 1; l < m.length; l++) {
                for (int z = 0; z < m[l].length; z++) {
                    if (m[maximum][z] > m[l][z])
                        break;
                    else if (m[maximum][z] < m[l][z]) {
                        maximum = l;
                        break;
                    }
                }
            }
            int[] temp = m[maximum];
            m[maximum] = m[k];
            m[k] = temp;
        }
    }

    public static void showArray(int[][] array){
        for (int[] ints : array) {
            for (int anInt : ints) System.out.print(anInt + " ");
            System.out.println();
        }
    }
}
