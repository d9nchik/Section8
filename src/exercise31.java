import java.util.Scanner;

public class exercise31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] points = new double[4][2];

        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        for (int i = 0; i < points.length; i++)
            for (int j = 0; j < points[i].length; j++)
                points[i][j] = input.nextDouble();

        double[] intersectingPoint = getIntersectingPoint(points);
        if (intersectingPoint == null)
            System.out.println("The two lines are parallel");
        else
            System.out.println("The intersecting point is at ( " + intersectingPoint[0] + ", " + intersectingPoint[1] + ")");
    }

    public static double[] getIntersectingPoint(double[][] points) {
        double a = points[0][1] - points[1][1];
        double b = points[1][0] - points[0][0];
        double c = points[2][1] - points[3][1];
        double d = points[3][0] - points[2][0];
        double e = a * points[0][0] + b * points[0][1];
        double f = c * points[2][0] + d * points[2][1];

        double down = a * d - b * c;

        if (down == 0)
            return null;
        else {
            double[] intersectingPoint = new double[2];
            intersectingPoint[0] = (e * d - b * f) / down;
            intersectingPoint[1] = (a * f - e * c) / down;
            return intersectingPoint;
        }
    }
}
