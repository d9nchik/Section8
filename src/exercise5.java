import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double [][] a =new double [2][2];
        double [][] b =new double [2][2];

        System.out.print("Enter matrix1: ");
        for (int i=0;i<a.length;i++){
            for (int j =0;j<b.length;j++){
                a[i][j]=input.nextDouble();
            }
        }

        System.out.print("Enter matrix2: ");
        for (int i=0;i<b.length;i++){
            for (int j =0;j<b.length;j++){
                b[i][j]=input.nextDouble();
            }
        }
        double [][] c =addMatrix(a, b);
        System.out.println("The matrix are added as follows");
        System.out.printf("%2.1f %2.1f\t\t%2.1f %2.1f\t\t%2.1f %2.1f\n", a[0][0], a[0][1],b[0][0], b[0][1], c[0][0], c[0][1] );
        System.out.printf("%2.1f %2.1f  +  %2.1f %2.1f  =  %2.1f %2.1f\n", a[1][0], a[1][1],b[1][0], b[1][1], c[1][0], c[1][1] );
    }

    public static double[][] addMatrix(double[][] a, double[][] b) {
        double[][] c = new double[a.length][b.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                {
                    c[i][j] = a[i][j] + b[i][j];
                }
            }
        }
        return c;
    }
}
