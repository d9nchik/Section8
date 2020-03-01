import java.util.Scanner;

public class Exercise36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number n: ");
        int size = input.nextInt();
        char[][] matrix = new char[size][size];

        System.out.println("Enter "+size+" rows of letters separated by spaces: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                char symbol = input.next().charAt(0);
                if (symbol<'A'||symbol>'A'+size-1){
                    System.out.print("Wrong input: the letters must be from A to "+(char)('A'+size-1));
                    System.exit(1);
                }
                matrix[i][j]=symbol;
            }
        }
        System.out.print("The input array is ");
        if (!isLatinColumn(matrix)||!isLatinRow(matrix))
            System.out.print("not ");
        System.out.print("a Latin square");
    }

    public static boolean isLatinRow(char[][] m){
        for (char[] chars : m) {
            boolean[] letters = new boolean[m.length];
            for (int j = 0; j < m.length; j++) {
                int letter = chars[j] - 'A';
                if (letters[letter])
                    return false;
                else
                    letters[letter] = true;
            }
        }
        return true;
    }

    public static boolean isLatinColumn(char[][] m){
        for (int i = 0; i < m.length; i++) {
            boolean[] letters = new boolean[m.length];
            for (char[] chars : m) {
                int letter = chars[i] - 'A';
                if (letters[letter])
                    return false;
                else
                    letters[letter] = true;
            }
        }
        return true;
    }
}
