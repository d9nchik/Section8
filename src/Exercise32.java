import java.util.Scanner;

public class Exercise32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] points = new double[3][2];

        System.out.print("Enter x1, y1, x2, y2, x3, y3: ");
        for (int i = 0; i < points.length; i++)
            for (int j = 0; j < points[i].length; j++)
                points[i][j] = input.nextDouble();
        double area = getTriangleArea(points);
        if (area == 0)
            System.out.println("The three points are on the same line");
        else
            System.out.printf("The area of the triangle is %.2f", area);
    }

    public static double getTriangleArea(double[][] points) {
        if (exercise15.sameLine(points))
            return 0;
        double a = Math.sqrt(Math.pow(points[0][0] - points[1][0], 2) + Math.pow(points[0][1] - points[1][1], 2));
        double b = Math.sqrt(Math.pow(points[0][0] - points[2][0], 2) + Math.pow(points[0][1] - points[2][1], 2));
        double c = Math.sqrt(Math.pow(points[2][0] - points[1][0], 2) + Math.pow(points[2][1] - points[1][1], 2));

        double p = (a + b + c) / 2;

        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
