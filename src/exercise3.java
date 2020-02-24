public class exercise3 {
    public static void main(String[] args) {
        // Students' answers to the questions
        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

        // Key to the questions
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        int[][] students = new int[answers.length][2];

        // Grade all answers
        for (int i = 0; i < answers.length; i++) {
            // Grade one student
            int correctCount = 0;
            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == keys[j])
                    correctCount++;
            }

            students[i][0] = i;
            students[i][1] = correctCount;
        }

        sortMatrix(students);

        for (int[] student : students) {
            System.out.println("Student " + student[0] + "'s correct count is " +
                    student[1]);
        }
    }

    public static void sortMatrix(int[][] students) {
        for (int k = 1; k < students.length; k++) {
            int key = students[k][1];
            int number = students[k][0];
            int i = k-1;
            while (i >= 0 && students[i][1] < key) {
                students[i + 1][1] = students[i][1];
                students[i + 1][0] = students[i][0];
                i--;
            }
            students[i + 1][1] = key;
            students[i + 1][0] = number;
        }
    }
}
