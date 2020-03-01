import java.util.Scanner;

public class Exercise33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] points = new double[4][2];

        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        for (int i = 0; i < points.length; i++)
            for (int j = 0; j < points[i].length; j++)
                points[i][j] = input.nextDouble();
        double[] temp = points[1];
        points[1] = points[2];
        points[2] = temp;
        double[] middlePoint = exercise31.getIntersectingPoint(points);
        temp = points[1];
        points[1] = points[2];
        points[2] = temp;

        System.out.print("The areas are ");
        for (int i = 0; i < 4; i++) {
            double[][] tempPoints = new double[3][];
            tempPoints[0] = points[i];
            tempPoints[1] = points[(i + 1) % 4];
            tempPoints[2] = middlePoint;
            System.out.printf("%.2f ",Exercise32.getTriangleArea(tempPoints));
        }

    }
}
