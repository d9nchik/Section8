import java.util.Scanner;

public class Exercise37 {
    public static void main(String[] args) {
        String[][] states = {{"Alabama", "Montgomery"},
                {"Alaska", "Juneau"},
                {"Arizona", "Phoenix"},
                {"Arkansas", "Little Rock"},
                {"California", "Sacramento"},
                {"Colorado", "Denver"},
                {"Connecticut", "Hartford"},
                {"Delaware", "Dover"},
                {"Florida", "Tallahassee"},
                {"Georgia", "Atlanta"},
                {"Hawaii", "Honolulu"},
                {"Idaho", "Boise"},
                {"Illinois", "Springfield"},
                {"Indiana", "Indianapolis"},
                {"Iowa", "Des Moines"},
                {"Kansas", "Topeka"},
                {"Kentucky", "Frankfort"},
                {"Louisiana", "Baton Rouge"},
                {"Maine", "Augusta"}
        };//TODO: add more states and capitals
        int points = 0;
        Scanner input = new Scanner(System.in);

        for (String[] state : states) {
            System.out.print("What is the capital of " + state[0] + "? ");
            String answer = input.next();
            if (answer.equals(state[1])) {
                points++;
                System.out.println("Your answer is correct");
            } else
                System.out.println("The correct answer should be " + state[1]);
        }
        System.out.println("The correct count is " + points);
    }
}
