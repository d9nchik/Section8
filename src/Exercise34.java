import java.util.Scanner;

public class Exercise34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] points = new double[6][2];

        System.out.print("Enter 6 points: ");
        for (int i = 0; i < points.length; i++)
            for (int j = 0; j < points[i].length; j++)
                points[i][j] = input.nextDouble();
        double[] lowest = getRightmostLowestPoint(points);
        System.out.println("The rightmost lowest point is (" + lowest[0] + ", " + lowest[1] + ")");
    }

    public static double[]
    getRightmostLowestPoint(double[][] points) {
        int index = 0;
        double maximum = points[0][0] - points[0][1];
        for (int i = 1; i < points.length; i++) {
            if (maximum < points[i][0] - points[i][1]) {
                index = i;
                maximum = points[i][0] - points[i][1];
            }
        }
        return points[index];
    }
}
