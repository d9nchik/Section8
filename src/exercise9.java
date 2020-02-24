import java.util.Arrays;
import java.util.Scanner;

public class exercise9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[][] field = new char[3][3];
        for (char[] chars : field) {
            Arrays.fill(chars, ' ');
        }
        char winner;
        for (int k = 0; k < 9; k++) {
            showField(field);
            winner = winner(field);
            if (winner != ' ')
                break;
            char symbol;
            if (k % 2 == 0)
                symbol = 'X';
            else
                symbol = 'O';
            int x;
            int y;
            do {
                System.out.print("Enter a row (0, 1, or 2) for player " + symbol+": ");
                x = input.nextInt();
                System.out.print("Enter a column (0, 1, or 2) for player " + symbol+": ");
                y = input.nextInt();
            } while (!setField(x, y, symbol, field));
        }

        winner = winner(field);
        if (winner == ' ')
            System.out.print("Draw!");
        else if (winner == 'X')
            System.out.print("X player won");
        else
            System.out.print("Y player won");

    }

    public static boolean setField(int x, int y, char symbol, char[][] field) {
        if (field[x][y] == ' ') {
            field[x][y] = symbol;
            return true;
        }
        return false;
    }

    public static void showField(char[][] field) {

        for (char[] chars : field) {
            System.out.println("--------------");
            for (char aChar : chars) {
                System.out.print("| " + aChar + " ");
            }
            System.out.println("|");
        }
        System.out.println("--------------");
    }

    public static char winner(char[][] field) {
        for (char[] chars : field) {
            if (chars[0] == ' ')
                continue;
            boolean answer = true;
            for (int j = 1; j < field.length; j++) {
                if (chars[j] != chars[0]) {
                    answer = false;
                    break;
                }
            }
            if (answer)
                return chars[0];
        }

        for (int i = 0; i < field.length; i++) {
            if (field[0][i] == ' ')
                continue;
            boolean answer = true;
            for (int j = 1; j < field.length; j++) {
                if (field[j][i] != field[0][i]) {
                    answer = false;
                    break;
                }
            }
            if (answer)
                return field[0][i];
        }


        if (field[1][1] != ' ' && (field[1][1] == field[0][0] && field[1][1] == field[2][2]) || (field[1][1] == field[0][2] && field[1][1] == field[2][0]))
            return field[1][1];

        return ' ';
    }
}
