public class exercise4 {
    public static void main(String[] args) {
        int [][] employees = {{2, 4, 3, 4, 5, 8, 8},
                {7, 3, 4, 3, 3, 4, 4},
                {3, 3, 4, 3, 3, 2, 2},
                {9, 3, 4, 7, 3, 4, 1},
                {3, 5, 4, 3, 6, 3, 8},
                {3, 4, 4, 6, 3, 4, 4},
                {3, 7, 4, 8, 3, 8, 4},
                {6, 3, 5, 9, 2, 7, 9}};
        int[][] workOfEmployees = new int[employees.length][2];
        for(int k=0;k<employees.length;k++){
            int total =0;
            for (int j=0;j<employees[k].length;j++)
                total+=employees[k][j];
            workOfEmployees[k][0]=k;
            workOfEmployees[k][1]=total;
        }

        sortMatrix(workOfEmployees);

        for (int[] student : workOfEmployees) {
            System.out.println("Worker " + student[0] + "'s worked " +
                    student[1]);
        }
    }

    public static void sortMatrix(int[][] students) {
        for (int k = 1; k < students.length; k++) {
            int key = students[k][1];
            int number = students[k][0];
            int i = k-1;
            while (i >= 0 && students[i][1] > key) {
                students[i + 1][1] = students[i][1];
                students[i + 1][0] = students[i][0];
                i--;
            }
            students[i + 1][1] = key;
            students[i + 1][0] = number;
        }
    }
}
