import java.util.Scanner;

public class exercise30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c, d, e, f: ");

        double[][] a = new double[2][2];
        double[] b = new double[2];
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j]=input.nextDouble();
            }
        }
        for (int i = 0; i < 2; i++) {
            b[i] = input.nextDouble();
        }

        double[] result = linearEquation(a, b);

        if (result == null)
            System.out.println("The equation has no solution");
        else {

            System.out.println("x is " + result[0] + " and y is " + result[1]);
        }

    }

    public static double[] linearEquation(double[][] a, double[] b) {
        double down = a[0][0] * a[1][1] - a[0][1] * a[1][0];
        if (down == 0)
            return null;
        else {

            double x = (b[0] * a[1][1] - b[1] * a[0][1]) / down;
            double y = (b[1] * a[0][0] - b[0] * a[1][0]) / down;
            return new double[]{x, y};
        }

    }
}
