import java.util.Scanner;

public class exercise17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        double[][] borrowers = new double[size][size];
        double limit = input.nextInt();
        for (int k = 0; k < size; k++) {
            borrowers[k][k] = input.nextDouble();
            int iteration = input.nextInt();
            for (int j = 0; j < iteration; j++)
                borrowers[k][input.nextInt()] = input.nextDouble();
        }

        System.out.print("Unsafe banks are ");

        boolean isBankrupt = true;
        while (isBankrupt) {
            isBankrupt=false;
            for (int k = 0; k < borrowers.length; k++) {
                double debt = 0;
                for (int j = 0; j < borrowers.length; j++) {
                        debt += borrowers[k][j];
                }


                if (debt < limit&&debt>0) {
                    System.out.print(k + " ");
                    isBankrupt=true;
                    for (int i = 0; i < borrowers.length; i++) {
                        borrowers[i][k] = 0;
                        borrowers[k][i] = 0;
                    }
                    break;
                }
            }
        }
        System.out.println();
    }
}
