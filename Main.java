/*
 * The program runs Sylvesters numbers.
 *
 * @author  Michael Bruneau
 * @version 1.0
 * @since   2020-11-30
 */

// setup
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static int numberGenerator(int runTimes,
                    int totalRunTimes) {
        // variables
        // array length is = to ammount sylvesters numbers required.
        int[] sylvestersNumbers = new int[totalRunTimes];
        System.out.println("test " + runTimes);
        System.out.println("test2 " + sylvestersNumbers[runTimes]);
        // sets default value of array only the first time
        if (runTimes == totalRunTimes - 1) {
            sylvestersNumbers[runTimes] = 2;
            System.out.println(sylvestersNumbers[runTimes] + ", ");
        }

        // base is when run times equal 0
        if (runTimes == 0) {
            return 0;
        } else {
            // calculates each number
            System.out.println((sylvestersNumbers[runTimes]
                    * sylvestersNumbers[runTimes]
                    - sylvestersNumbers[runTimes] + 1) + ", ");
            return numberGenerator(runTimes - 1, totalRunTimes);

        }
    }

    public static void main(String[] args) {
        // variables
        Scanner userInput = new Scanner(System.in);
        String numberOfSylvesterNumbers;
        boolean loop = true;
        int[] arr = new int[5];

        while (loop) {
            // gets input
            System.out.print("Input number of sylvester numbers you want"
                        + " outputed: ");
            numberOfSylvesterNumbers = userInput.nextLine();

            // makes sure input is valid
            try {
                // tries to convert input to integer
                int loopTimes = Integer.parseInt(
                             numberOfSylvesterNumbers);

                // sets loop to false if input is valid
                loop = false;

                //System.out.println(numberGenerator(5, 5));
            } catch (NumberFormatException e) {
                System.out.println("\nInvalid input.");
            }
        }
     numberGenerator(4, 5);
    }
}
