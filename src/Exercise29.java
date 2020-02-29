import java.util.Scanner;

public class Exercise29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] list1 = new int[3][3];
        System.out.print("Enter list1: ");
        for (int k = 0; k < list1.length; k++)
            for (int j = 0; j < list1.length; j++)
                list1[k][j] = input.nextInt();
        int[][] list2 = new int[3][3];
        System.out.print("Enter list2: ");
        for (int k = 0; k < list2.length; k++)
            for (int j = 0; j < list2.length; j++)
                list2[k][j] = input.nextInt();
        System.out.print("The two arrays are ");
        if (!equals(list1, list2))
            System.out.print("not ");
        System.out.println("identical");
    }
    public static boolean equals(int[][] m1, int[][] m2) {
        if (m1.length != m2.length || m1[0].length != m2[0].length)
            return false;
        for (int[] ints : m1) {
            for (int j = 0; j < m1[0].length; j++) {
                boolean isAnalog = false;
                for (int k = 0; k < m1.length && !isAnalog; k++) {
                    for (int l = 0; l < m1[0].length; l++) {
                        if (ints[j] == m2[k][l]) {
                            isAnalog = true;
                            break;
                        }
                    }
                }
                if (!isAnalog)
                    return false;
            }
        }
        for (int[] ints : m2) {
            for (int j = 0; j < m1[0].length; j++) {
                boolean isAnalog = false;
                for (int k = 0; k < m1.length && !isAnalog; k++) {
                    for (int l = 0; l < m1[0].length; l++) {
                        if (ints[j] == m1[k][l]) {
                            isAnalog = true;
                            break;
                        }
                    }
                }
                if (!isAnalog)
                    return false;
            }
        }
        return true;
    }
}
