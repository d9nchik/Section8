import java.util.Scanner;

public class Exercise24 {
    public static void main(String[] args) {
        // Read a Sudoku solution
        int[][] grid = readASolution();

        System.out.println(isValid(grid) ? "Valid solution" :
                "Invalid solution");
    }

    /**
     * Read a Sudoku solution from the console
     */
    public static int[][] readASolution() {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Sudoku puzzle solution:");
        int[][] grid = new int[9][9];
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++)
                grid[i][j] = input.nextInt();

        return grid;
    }

    /**
     * Check whether a solution is valid
     */
    public static boolean isValid(int[][] grid) {
        return isValidColumn(grid) && isValidBox(grid) && isValidRows(grid);
    }


    public static boolean isValidColumn(int[][] grid) {
        for (int j = 0; j < 9; j++)
            for (int row = 1; row < 9; row++)
                if (grid[row][j] == grid[0][j])
                    return false;
        return true;
    }

    public static boolean isValidRows(int[][] grid) {
        for (int i = 8; i >= 0; i--)
            for (int column = 1; column < 9; column++)
                if (grid[i][column] == grid[i][0])
                    return false;
        return true;
    }

    public static boolean isValidBox(int[][] grid) {
        for (int i = 0; i < 9; i += 3)
            for (int j = 0; j < 9; j += 3)
                for (int row = i; row < i + 3; row++)
                    for (int col = j; col < j + 3; col++)
                        if (!(row == i && col == j) && grid[row][col] == grid[i][j])
                            return false;
        return true;
    }
}
