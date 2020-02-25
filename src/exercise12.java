import java.util.Scanner;

public class exercise12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
        int[][] brackets = {
                {8350, 33950, 82250, 171550, 372950}, // Single filer
                {16700, 67900, 137050, 20885, 372950}, // Married jointly
                // −or qualifying widow(er)
                {8350, 33950, 68525, 104425, 186475}, // Married separately
                {11950, 45500, 117450, 190200, 372950} // Head of household
        };

        System.out.print("(0-single filer, 1-married jointly or " +
                "qualifying widow(er), 2-married separately, 3-head of " +
                "household) Enter the filing status: ");

        int status = input.nextInt();

        System.out.print("Enter the taxable income: ");
        double income = input.nextDouble();
        double tax = 0;
        int counter = 0;



        while (true) {
            if (counter<brackets[status].length&&income >= brackets[status][counter]) {
                if (counter==0){
                    tax += brackets[status][counter] * rates[counter];
                }
                else {
                    tax += (brackets[status][counter]-brackets[status][counter-1]) * rates[counter];
                }
                counter++;
            } else {
                tax += (income - brackets[status][counter-1]) * rates[counter];
                break;
            }
        }
        System.out.println("Tax is " + (int) (tax * 100) / 100.0);
    }
}
