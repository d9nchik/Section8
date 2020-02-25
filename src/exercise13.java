import java.util.Scanner;

public class exercise13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns of the array: ");
        int x = input.nextInt();
        int y = input.nextInt();
        System.out.println("Enter the array: ");
        double[][] array = exercise1.getMatrix(x, y);

        int minimumX = 0;
        int minimumY = 0;

        for (int k = 0; k < array.length; k++) {
            for (int j = 0; j < array[0].length; j++)
                if (array[minimumX][minimumY] > array[k][j]) {
                    minimumX = k;
                    minimumY = j;
                }
        }

        System.out.print("The location of the smallest element is at (" + minimumX + ", " + minimumY + ")");
    }
}
