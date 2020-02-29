import java.util.Scanner;

public class exercise21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of cities: ");
        double[][] cities = new double[input.nextInt()][2];

        System.out.println("Enter the coordinates of the cities:");
        for (int k = 0; k < cities.length; k++) {
            cities[k][0] = input.nextDouble();
            cities[k][1] = input.nextDouble();
        }

        double shortestTotalDistance = 0;
        for (int j = 0; j < cities.length; j++) {
            if (1 == j)
                continue;
            shortestTotalDistance += distance(cities[1], cities[j]);
        }

        int center = 0;

        for (int i = 1; i < cities.length; i++) {
            double total = 0;
            for (int j = 0; j < cities.length; j++) {
                if (i == j)
                    continue;
                total += distance(cities[i], cities[j]);
            }
            if (shortestTotalDistance > total) {
                center = i;
                shortestTotalDistance = total;
            }
        }

        System.out.println("The central city is at (" + cities[center][0] + ", " + cities[center][1] + ")");
        System.out.println("The total distance to all other cities is " + shortestTotalDistance);
    }

    public static double distance(double[] start, double[] finish) {
        return Math.sqrt(Math.pow((start[0] - finish[0]), 2) + Math.pow((start[1] - finish[1]), 2));
    }
}
