import java.util.Scanner;

public class exercise15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] points = new double[5][5];
        System.out.print("Enter five points: ");

        for (int k = 0; k < points.length; k++) {
            points[k][0] = input.nextDouble();
            points[k][1] = input.nextDouble();
        }

        System.out.print("The five points are");
        if (!sameLine(points))
            System.out.print(" not");
        System.out.print(" on the same line");
    }

    public static boolean sameLine(double[][] points) {
        for (int k = 0; k < points.length - 2; k++) {
            if (!onTheSameLine(points[k][0], points[k][1], points[k + 1][0], points[k + 1][1], points[k + 2][0], points[k + 2][1]))
                return false;
        }
        return true;
    }

    public static boolean onTheSameLine(double x0, double y0,
                                        double x1, double y1, double x2, double y2) {
        return (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) == 0;
    }
}
