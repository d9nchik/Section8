import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[][] field = new char[6][7];
        for (int k = 0; k < field.length; k++)
            for (int j = 0; j < field[0].length; j++)
                field[k][j] = ' ';

        int counter = 0;
        while (!isConsecutiveFour(field)) {
            showField(field);
            int column;
            do {
                System.out.print("Drop a ");
                if (counter % 2 == 0)
                    System.out.print("red");
                else
                    System.out.print("yellow");
                System.out.print(" disk at column (0–6): ");
                column = input.nextInt();
            } while (!makeTurn(field, column, counter % 2));
            counter++;
        }
        System.out.println("-----------------------------------");
        showField(field);
        System.out.print("The ");
        if (counter % 2 == 0)
            System.out.print("yellow");
        else
            System.out.print("red");
        System.out.println(" player won");
    }

    public static void showField(char[][] field) {
        for (char[] ints : field) {
            for (int j = 0; j < field[0].length; j++)
                System.out.print("|" + ints[j]);
            System.out.println("|");
        }
    }

    public static boolean isConsecutiveFour(char[][] values) {
        if (values.length < 4)
            return false;
        for (char[] value : values) {
            for (int k = 0; k < values.length - 3; k++) {
                if (value[k] == value[k + 1] && value[k] == value[k + 2] && value[k] == value[k + 3] && value[k] != ' ')
                    return true;
            }
        }

        for (int k = 0; k < values.length - 3; k++) {
            for (int i = 0; i < values[k].length; i++) {
                if (values[k][i] == values[k + 1][i] && values[k][i] == values[k + 2][i] &&
                        values[k][i] == values[k + 3][i] && values[k][i] != ' ')
                    return true;
            }
        }

        for (int k = 0; k < values[k].length - 3; k++) {
            for (int i = 0; i < values[k].length - 3; i++) {
                if (values[k][i] == values[k + 1][i + 1] && values[k][i] == values[k + 2][i + 2] &&
                        values[k][i] == values[k + 3][i + 3] && values[k][i] != ' ')
                    return true;
            }
        }

        for (int k = 0; k < values.length - 3; k++) {
            for (int i = values.length - 4; i >= 0; i--) {
                if (values[k][i + 3] == values[k + 1][i + 2] && values[k][i + 3] == values[k + 2][i + 1] &&
                        values[k][i + 3] == values[k + 3][i] && values[k][i] != ' ')
                    return true;
            }
        }

        return false;
    }

    public static boolean makeTurn(char[][] field, int column, int color) {
        for (int k = field.length - 1; k >= 0; k--) {
            if (field[k][column] == ' ') {
                switch (color) {
                    case 1:
                        field[k][column] = 'Y';
                        break;
                    case 0:
                        field[k][column] = 'R';
                }
                return true;
            }
        }
        return false;
    }
}
