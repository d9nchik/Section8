public class exercise18 {
    public static void main(String[] args) {
        int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
        shuffle(m);
        exercise16.showArray(m);
    }
    public static void shuffle(int[][] m) {
        for (int k = 0; k < m.length; k++) {
            int choice = (int) (Math.random() * m.length);
            int[] temp = m[k];
            m[k] = m[choice];
            m[choice] = temp;
        }
    }
}
